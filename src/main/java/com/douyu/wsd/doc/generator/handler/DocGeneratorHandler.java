package com.douyu.wsd.doc.generator.handler;

import com.douyu.wsd.doc.generator.domain.ControllerBean;
import com.douyu.wsd.doc.generator.domain.MethodBean;
import org.reflections.Reflections;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Set;

public class DocGeneratorHandler {
    public static void main(String[] args) {
        Reflections reflections = new Reflections("com.douyu.wsd.test");
        //1. 如果是@RestController
        Set<Class<?>> classesListWithRestController = reflections.getTypesAnnotatedWith(RestController.class);
        for (Class clazz : classesListWithRestController){
            // 获取RestController 的 RequestMapping
            ControllerBean controllerBean = new ControllerBean();
            // 1.1 得到该类下面的所有方法
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods){
                MethodBean methodBean = new MethodBean();
                methodBean.interfaceName = method.getName();//Todo
                //1.1.1得到该类下面的RequestMapping注解
                RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
                //1.1.2得到该类下面的GetMapping注解
                GetMapping getMapping = method.getAnnotation(GetMapping.class);
                //1.1.3得到该类下面的PostMapping注解
                PostMapping postMapping = method.getAnnotation(PostMapping.class);
                //1.1.4 是get请求
                if (null != getMapping ||(null!=requestMapping&&requestMapping.method().equals(RequestMethod.GET))){
                    methodBean.requestMethod = "GET";
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    for(Type genericParameterType : genericParameterTypes){
                        if(genericParameterType instanceof ParameterizedType){
                            ParameterizedType aType = (ParameterizedType) genericParameterType;
                            Type[] parameterArgTypes = aType.getActualTypeArguments();
                            for(Type parameterArgType : parameterArgTypes){
                                Class parameterArgClass = (Class) parameterArgType;
                                System.out.println("parameterArgClass = " + parameterArgClass);
                            }
                        }
                    }
                }

                //1.1.5 是post请求
                if (null != postMapping ||(null!=requestMapping&&requestMapping.method().equals(RequestMethod.POST))){
                    methodBean.requestMethod = "Post";
                }
                controllerBean.interfaces.add(methodBean);
            }

        }



        //2. 如果是@Controller
        Set<Class<?>> classesListWithController = reflections.getTypesAnnotatedWith(Controller.class);
        // 获取Controller 的部分url
        //2.1  加了@ResponseBody

        //2.2   没加@ResponseBody



    }
}
