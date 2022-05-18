package com.jiaolin.boot.controller;

import cn.hutool.json.JSON;
import com.jiaolin.boot.config.Person;
import com.jiaolin.boot.entity.Department;
import com.jiaolin.boot.exception.MyException;
import com.jiaolin.boot.maper.DepartmentMapper;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
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
    private DepartmentMapper departmentMapper;

    @Autowired
    private Person person;

    @GetMapping("/hello")
    public String getHello(@RequestParam(value = "value") String value) {
        if (value.equals("xxx")) {
            throw new MyException("value 为xxx ");
        }
        log.trace("这是log trace...");
        log.debug("这是log debug...");
        log.info("这是log info...");
        log.warn("这是log warn...");
        log.error("这是log error...");
        return "hello";
    }


    @PostMapping("/hello")
    public String hello(@RequestBody String values) {
        log.info("github 测试提交");
        return "hello";
    }


    @PostMapping("/depart")
    @ResponseBody
    public String hello(Department department) {
        log.info("github 测试提交");
        departmentMapper.insertDept(department);
        return department.getDepartmentName();
    }
    @GetMapping("/depart/{id}")
    @ResponseBody
    public Department hello(@PathVariable(value = "id")Integer id) {
        log.info("github 测试提交");
        Department dept = departmentMapper.getDeptById(id);
        return dept;
    }


}
