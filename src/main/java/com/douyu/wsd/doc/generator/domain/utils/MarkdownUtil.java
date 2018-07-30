package com.douyu.wsd.doc.generator.domain.utils;

import com.douyu.wsd.doc.generator.domain.exceptions.MarkdownGeneratorException;
import com.douyu.wsd.doc.generator.domain.sapi.oxm.ControllerDocObject;
import com.douyu.wsd.doc.generator.domain.sapi.oxm.Property;
import com.douyu.wsd.doc.generator.domain.sapi.oxm.RequestInterface;
import com.douyu.wsd.doc.generator.domain.sapi.oxm.RequestParams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MarkdownUtil {
    public static void exportMarkDown(List<ControllerDocObject> list) throws MarkdownGeneratorException {
        for (ControllerDocObject docObject : list) {
            File file = new File("D:/接口文档-" + docObject.getDescription() + ".md");
            try {
                try (
                        FileWriter fileWriter = new FileWriter(file);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
                ) {
                    bufferedWriter.write("# " + docObject.getDescription() + " : " + docObject.getControllerName());
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    int i = 1;
                    for (RequestInterface requestInterface : docObject.getRequestInterfaces()) {
                        bufferedWriter.write("## " + i++ + "." + requestInterface.getDescription() + "-" + requestInterface.getSummary());
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("- URI:" + requestInterface.getUri());
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("- 请求方式:" + requestInterface.getRequestMethod());
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("- 请求格式:" + requestInterface.getConsumes());
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("- 请求参数 :");
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        bufferedWriter.write("|参数名称|参数类型|必须|备注|");
                        bufferedWriter.newLine();
                        bufferedWriter.write("|-----|-----|-----|-----|");
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                        if (null != requestInterface.getParameters()) {
                            for (RequestParams param : requestInterface.getParameters()) {
                                bufferedWriter.write("|" + param.getName()
                                        + "|" + param.getType()
                                        + "|" + param.getRequired()
                                        + "|" + param.getDescription());
                                bufferedWriter.newLine();
                            }
                        }
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                    }
                }
            } catch (IOException e) {
                throw new MarkdownGeneratorException(400, e.getMessage());
            }
        }
    }

    public static void recursiveGenerateRequestParamsList(Map requestDataDefinitions, String Definition, List<RequestParams> res) {
        Map reqInfoMap = (Map) requestDataDefinitions.get(Definition);
        Map<String, Object> properties = (Map) reqInfoMap.get("properties");
        List<String> required = (List) reqInfoMap.get("required");
        if (required == null) {
            required = new ArrayList<>();
        }

        for (Map.Entry<String, Object> property : properties.entrySet()) {
            Property property1 = Property.map2Property((Map) property.getValue());
            RequestParams requestParams = new RequestParams();
            requestParams.setName(property.getKey());
            requestParams.setRequired(required.contains(property.getKey()) ? "true" : "false");
            requestParams.setDescription(property1.getDescription());
            String type = property1.getType();
            requestParams.setType(type);

            if ("string".equals(type)) {
                requestParams.setExample(property1.getExample());
            } else {
                try {
                    Double ex = Double.parseDouble(property1.getExample());
                    BigDecimal bigDecimal = BigDecimal.valueOf(ex);
                    requestParams.setExample(bigDecimal.toString());
                } catch (Exception e) {
                    requestParams.setExample(property1.getExample());
                }
            }
            requestParams.setIn("body体内传的参数");
            if (null != property1.getItems()) {
                requestParams.setItems_ref(property1.getItems().get$ref());
                requestParams.setSchema(property1.getItems().getType());
                if (null != property1.getItems().get$ref()) {
                    recursiveGenerateRequestParamsList(requestDataDefinitions, ref2DefinitionInfo(property1.getItems().get$ref()), res);
                }
            }
//            if (property1.getItems() && requestParams.getItems_ref() == null)
            res.add(requestParams);
        }
    }


    public static String ref2DefinitionInfo(String ref) {
        if (ref == null || ref.trim().length() == 0) {
            return "";
        }
        String[] refLocationInfo = ref.split("/");
        if (refLocationInfo[0].equals("#") && refLocationInfo.length == 3) {
            return refLocationInfo[2];
        } else {
            return refLocationInfo[refLocationInfo.length - 1];
        }
    }

    public static void requestJsonAddBaseParam(StringBuilder requestBody, RequestParams param) {
        if (param.getType().equals("string")) {
            requestBody.append("\n\t\"").append(param.getName()).
                    append("\":\"")
                    .append(param.getExample()).append("\",");
        } else if (param.getType().contains("int") || param.getType().contains("number")) {
            requestBody.append("\n\t\"").append(param.getName()).
                    append("\": ")
                    .append(param.getExample()).append(",");
        }
    }

    public static void requestJsonAddObjectParam(StringBuilder requestBody, RequestParams param, Map<String, Object> definitions) {
        String definitionInfo = ref2DefinitionInfo(param.getItems_ref());
        Map requestDataMap = (Map) definitions.get(definitionInfo);
        Map<String, Object> requestParams = (Map) requestDataMap.get("properties");
        // TODO 递归
//        for (Map.Entry<String, Object> entry : requestParams.entrySet()) {
//            //Todo 生成requestbody
//        }

    }
}
