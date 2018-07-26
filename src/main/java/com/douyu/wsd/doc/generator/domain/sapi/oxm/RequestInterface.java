package com.douyu.wsd.doc.generator.domain.sapi.oxm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RequestInterface {
    private String uri;
    private String requestMethod;
    private List<String> controllerTag;
    private String summary;
    private String description;
    private List<String> consumes;
    private List<RequestParams> parameters;
    private String requestExample;
    private String responseExample;


    public static List<RequestInterface> map2RequestInterfaceList(Map<String,Object> paths ,Map<String,Object> definitions){
        List<RequestInterface> res = new ArrayList<>();
        for (Map.Entry<String,Object> entry:paths.entrySet()){
            Map<String,Object> pathsValue = (Map)entry.getValue();
            for (Map.Entry<String,Object> oneMethodEntry:pathsValue.entrySet()){
                RequestInterface ri = new RequestInterface();
                ri.setUri(entry.getKey());
                ri.setSummary( (String)((Map)oneMethodEntry.getValue()).get("summary") );
                ri.setConsumes( (List)((Map)oneMethodEntry.getValue()).get("consumes") );
                ri.setControllerTag( (List)((Map)oneMethodEntry.getValue()).get("tags") );
                ri.setDescription( (String)((Map)oneMethodEntry.getValue()).get("description") );
                ri.setRequestMethod( (String)oneMethodEntry.getKey() );
                ri.setParameters(
                        RequestParams.list2RequestParamsList((List)((Map)oneMethodEntry.getValue()).get("parameters"), definitions)
                );
                res.add(ri);
            }

        }
        return res;
    }


    public String getRequestExample() {
        return requestExample;
    }

    public void setRequestExample(String requestExample) {
        this.requestExample = requestExample;
    }

    public String getResponseExample() {
        return responseExample;
    }

    public void setResponseExample(String responseExample) {
        this.responseExample = responseExample;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public List<String> getControllerTag() {
        return controllerTag;
    }

    public void setControllerTag(List<String> controllerTag) {
        this.controllerTag = controllerTag;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getConsumes() {
        return consumes;
    }

    public void setConsumes(List<String> consumes) {
        this.consumes = consumes;
    }

    public List<RequestParams> getParameters() {
        return parameters;
    }

    public void setParameters(List<RequestParams> parameters) {
        this.parameters = parameters;
    }
}
