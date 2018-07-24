package com.douyu.wsd.test.controller;

import com.douyu.wsd.doc.generator.domain.MethodBean;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "TestRestController测试生成")
public class TestRestController {

    @RequestMapping("/one")
    public String one(){
        return "one";
    }

    @GetMapping("/two")
    public String two(String str, MethodBean methodBean){
        return "two";
    }

    @PostMapping("/three")
    public String three(){
        return "three";
    }
}
