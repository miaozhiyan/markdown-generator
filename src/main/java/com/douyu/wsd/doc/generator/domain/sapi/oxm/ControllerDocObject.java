package com.douyu.wsd.doc.generator.domain.sapi.oxm;

import com.douyu.wsd.doc.generator.domain.sapi.Tag;

import java.util.ArrayList;
import java.util.List;

public class ControllerDocObject {
    List<RequestInterface> requestInterfaces = new ArrayList<>();

    private String controllerName;

    private String description;

    public List<RequestInterface> getRequestInterfaces() {
        return requestInterfaces;
    }



    public static List<ControllerDocObject> generateControllerDocObjectList(List<Tag> tags,List<RequestInterface> requestInterfaces){
        List<ControllerDocObject> docObjects = new ArrayList<>();
        for (Tag tag:tags){
            ControllerDocObject docObject = new ControllerDocObject();
            docObject.setControllerName(tag.getName());
            docObject.setDescription(tag.getDescription());
            docObjects.add(docObject);
        }
        for (RequestInterface requestInterface:requestInterfaces){
            for (ControllerDocObject docObject: docObjects){
                if (requestInterface.getControllerTag().contains(docObject.getControllerName())){
                    docObject.getRequestInterfaces().add(requestInterface);
                }
            }
        }
        return docObjects;
    }

    public void setRequestInterfaces(List<RequestInterface> requestInterfaces) {
        this.requestInterfaces = requestInterfaces;
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
