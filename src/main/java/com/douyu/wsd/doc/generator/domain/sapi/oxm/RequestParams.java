package com.douyu.wsd.doc.generator.domain.sapi.oxm;

import com.douyu.wsd.doc.generator.domain.utils.MarkdownUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RequestParams {
    private String in;
    private String name;
    private String description;
    private String required;
    private String schema;
    private String type;
    private String example;
    private String items_ref;

    public static List<RequestParams> list2RequestParamsList(List<Map> parameters,Map requestDataDefinitions){
        List<RequestParams> res = new ArrayList<>();
        if (parameters==null){
            return null;
        }
        for (Map map : parameters){
            String requestInWhere = (String)map.get("in");
            switch (requestInWhere){
                case "body":{
                    String outterRef = (String)((Map)map.get("schema")).get("$ref");
                    String outterType = (String)((Map)map.get("schema")).get("type");
                    if (null != outterRef){
                        MarkdownUtil.recursiveGenerateRequestParamsList(requestDataDefinitions,MarkdownUtil.ref2DefinitionInfo(outterRef),res);
                    }
                    if ( null != outterType){
                        RequestParams param = new RequestParams();
                        param.setIn("body体内传的参数");
                        param.setType(outterType);
                        param.setDescription( (String)map.get("description") );
                        param.setName( (String)map.get("name") );
                        param.setRequired(map.get("required").toString() );
                        res.add(param);
                    }
                    break;
                }
                case "path":{
                    RequestParams param = new RequestParams();
                    param.setDescription((String)map.get("description"));
                    param.setType(  (String)map.get("type") );
                    param.setName( (String)map.get("name") );
                    param.setIn("URL体内穿的参数");
                    param.setRequired( map.get("required").toString() );
                    res.add(param);
                    break;
                }
                case "query":{
                    RequestParams param = new RequestParams();
                    param.setIn("url后传递参数");
                    param.setType(  (String)map.get("type") );
                    param.setDescription((String)map.get("description"));
                    param.setRequired( map.get("required").toString() );
                    param.setName( (String)map.get("name") );
                    res.add(param);
                    break;
                }
            }
        }

        return res;
    }

    public String getItems_ref() {
        return items_ref;
    }

    public void setItems_ref(String items_ref) {
        this.items_ref = items_ref;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}
