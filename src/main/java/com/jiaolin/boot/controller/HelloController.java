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
        log.trace("这是log trace...");
        log.debug("这是log debug...");
        log.info("这是log info...");
        log.warn("这是log warn...");
        log.error("这是log error...");
        return "hello";
    }


    @PostMapping("/hello")
    public String hello(@RequestBody String values){
        log.info("github 测试提交");
        return "hello";
    }
}
