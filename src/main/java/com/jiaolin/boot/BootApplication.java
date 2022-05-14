package com.jiaolin.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 指定配置文件激活有3种方式,
 * 第一:使用配置文件,
 * 第二:在虚拟机里面进行配置 -Dspring.profiles.active=dev
 * 第三:打成jar包,进行输入命令 java -jar boot --spring.profiles.active=dev
 */
@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

}
