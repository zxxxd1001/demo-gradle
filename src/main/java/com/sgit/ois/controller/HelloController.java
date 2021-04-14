package com.sgit.ois.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "hello")
    public String hello() {
        return "hello spring!!!";
    }
    @GetMapping(value = "hello1")
    public String hello1() {
        int i=100/0;
        int a=100;
        a=200;
        String s="sta";//测试注释和代码同行
        return "hello spring!!!";
    }
}
