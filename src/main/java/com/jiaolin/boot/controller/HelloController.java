package com.jiaolin.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author johnny
 * @Classname HelloController
 * @Description
 * @Date 2022/4/10 10:21
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String getHello(){
        return "hello";
    }
}
