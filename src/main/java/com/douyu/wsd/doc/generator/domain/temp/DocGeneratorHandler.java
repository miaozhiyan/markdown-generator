package com.douyu.wsd.doc.generator.domain.temp;

import com.douyu.wsd.doc.generator.domain.exceptions.MarkdownGeneratorException;
import com.douyu.wsd.doc.generator.domain.sapi.ApiDocsJsonObject;
import com.douyu.wsd.doc.generator.domain.sapi.oxm.ControllerDocObject;
import com.douyu.wsd.doc.generator.domain.sapi.oxm.RequestInterface;
import com.douyu.wsd.doc.generator.domain.sapi.oxm.RequestParams;
import com.douyu.wsd.doc.generator.domain.utils.MarkdownUtil;
import com.google.gson.Gson;

import java.util.List;
import java.util.Map;

public class DocGeneratorHandler {
    public static void main(String[] args) throws MarkdownGeneratorException {
        //1.获取doc-api信息
        Gson gson = new Gson();
        ApiDocsJsonObject apiDocsJsonObject = gson.fromJson(TestDoc.api3, ApiDocsJsonObject.class);
        String host = apiDocsJsonObject.getHost();
        if (host.endsWith("/")){
            host = host.substring(0,host.length()-1);
        }
        //2.提取所有的 paths,并生成 RequestInterface
        List<RequestInterface> requestInterfaces = RequestInterface.map2RequestInterfaceList(apiDocsJsonObject.getPaths(), apiDocsJsonObject.getDefinitions());
        //3. 将所有的接口都归类到对应的controller中去
        List<ControllerDocObject> list = ControllerDocObject.generateControllerDocObjectList(apiDocsJsonObject.getTags(), requestInterfaces);
        /* Todo 模拟发送请求 生成request, 获得 response 写入文档
        * */
        //4. 生成请求request
        for (ControllerDocObject object : list) {
            for (RequestInterface onceReq : object.getRequestInterfaces()) {
                String requestMethod = onceReq.getRequestMethod();
                List<String> consumes = onceReq.getConsumes();
                List<RequestParams> params = onceReq.getParameters();
                for (String consume : consumes) {
                    switch (consume) {
                        case "application/json":
                            switch (requestMethod) {
                                case "post":
                                    String res = contrustReqAndReciveResponse(params,apiDocsJsonObject.getDefinitions(),host);
                                    break;
                                case "get":
                                    break;
                            }
                            break;
                    }


                }
            }
        }


        //5. 接受返回response

        //6.导出markdown
        MarkdownUtil.exportMarkDown(list);
    }

    private static String contrustReqAndReciveResponse(List<RequestParams> params, Map<String, Object> definitions,String host) {
        Integer queryNum=0;
        StringBuilder requestBody = new StringBuilder();
        requestBody.append("{");
        for (RequestParams param:params){
            String paramType = param.getType();
            switch (param.getIn()){
                case "body体内传的参数":
                    String requestDataRef = param.getSchema();
                    if (null == requestDataRef){
                        if ( "object".equals( param.getType() ) ){
                            MarkdownUtil.requestJsonAddObjectParam(requestBody,param,definitions);
                        }else{
                            MarkdownUtil.requestJsonAddBaseParam(requestBody,param);
                        }
                    }
                    break;
                case "path":
                    String pathVariable = "123";
                    if (   paramType.equals("string") ){
                        pathVariable = param.getName();
                    }
                    host = host.replaceAll("\\{"+param.getName()+"\\}",pathVariable);
                    break;
                case "query":
                    String queryVariable = "234";
                    if (   paramType.equals("string") ){
                        if (queryNum.equals(0)){
                            host = host+"?"+param.getName()+"="+param.getName();
                            queryNum++;
                        }else{
                            host = host+"&"+param.getName()+"="+param.getName();
                        }
                    }else if( paramType.equals("integer") ){
                        if (queryNum.equals(0)){
                            host = host+"?"+param.getName()+"="+queryVariable;
                            queryNum++;
                        }else{
                            host = host+"&"+param.getName()+"="+queryVariable;
                        }
                    }
                    break;
            }
        }
        requestBody.append("}");

        //Todo
        return null;
    }


}
