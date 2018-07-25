package com.douyu.wsd.doc.generator.domain.sapi;

import java.util.List;
import java.util.Map;

public class ApiDocsJsonObject {
    private Info info;
    private String host;
    private List<Tag> tags;
    private Map<String,Object> paths;
    private Map<String,Object> definitions;


    public Map<String, Object> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(Map<String, Object> definitions) {
        this.definitions = definitions;
    }

    public Map<String, Object> getPaths() {
        return paths;
    }

    public void setPaths(Map<String, Object> paths) {
        this.paths = paths;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
