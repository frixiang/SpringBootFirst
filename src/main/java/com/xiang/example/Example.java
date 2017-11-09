package com.xiang.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WIN7 on 2017/11/9.
 * @author Norris
 *
 * EnableAutoConfiguration 告诉 Spring Boot 根据您添加的jar依赖关系来“猜(guess)”你将如何配置Spring;
 *
 * RestController 注解，告诉Spring将生成的字符串直接返回给调用者
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    public static void main(String[] args){
        SpringApplication.run(Example.class,args);
    }
}
