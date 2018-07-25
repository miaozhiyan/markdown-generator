package com.douyu.wsd.doc.generator.domain.sapi.oxm;

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

    public static List<RequestParams> list2RequestParamsList(List<Map> parameters,Map requestDataDefinitions){
        List<RequestParams> res = new ArrayList<>();
        if (parameters==null){
            return null;
        }
        for (Map map : parameters){
            String requestInWhere = (String)map.get("in");
            switch (requestInWhere){
                case "body":{
                    String requestDataRef = (String)((Map)map.get("schema")).get("$ref");
                    String [] refLocationInfo = requestDataRef.split("/");
                    if (refLocationInfo[0].equals("#") && refLocationInfo.length==3){
                        Map requestDataMap = (Map)requestDataDefinitions.get(refLocationInfo[2]);
                        Map<String,Object> requestParams = (Map)requestDataMap.get("properties");
                        List<String> required =  (List)requestDataMap.get("required");
                        for (Map.Entry<String,Object> entry : requestParams.entrySet()){
                            Map valueMap = (Map)entry.getValue();
                            RequestParams param = new RequestParams();
                            param.setDescription((String)valueMap.get("description"));
                            param.setIn("body体内传的参数");
                            param.setType(  (String)valueMap.get("type") );
                            param.setName( entry.getKey() );
                            param.setRequired( required.contains(entry.getKey())?"true":"false" );
                            res.add(param);
                        }
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
                    param.setIn("url后穿的参数");
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
