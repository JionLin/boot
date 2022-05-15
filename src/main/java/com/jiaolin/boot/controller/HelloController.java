package com.jiaolin.boot.controller;

import com.jiaolin.boot.config.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author johnny
 * @Classname HelloController
 * @Description
 * @Date 2022/4/10 10:21
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private Person person;

    @GetMapping("/hello")
    public String getHello(){
        log.info("github 测试提交");
        log.info(person.toString());
        return "hello";
    }


    @PostMapping("/hello")
    public String hello(@RequestBody String values){
        log.info("github 测试提交");
        log.info(person.toString());
        return "hello";
    }
}
