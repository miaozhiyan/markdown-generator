package com.douyu.wsd.doc.generator.domain;

import java.util.ArrayList;
import java.util.List;

public class ControllerBean {
    public String controllerName;

    public List<MethodBean> interfaces = new ArrayList<MethodBean>();

    @Override
    public String toString() {
        return "ControllerBean{" +
                "controllerName='" + controllerName + '\'' +
                ", interfaces=" + interfaces +
                '}';
    }
}
