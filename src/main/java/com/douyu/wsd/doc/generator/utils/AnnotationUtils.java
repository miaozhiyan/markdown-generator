package com.douyu.wsd.doc.generator.utils;

import java.lang.annotation.Annotation;

public class AnnotationUtils {
    public static boolean havaAnnotation(Annotation annotation,Class clazz){
        Annotation[] annotations=clazz.getAnnotations();
        for(int i=0;i<annotations.length;i++){  //遍历循环
            if(annotations[i].hashCode()==annotation.hashCode()) //用哈希码判断
                return true;
        }
        return false;
    }
}
