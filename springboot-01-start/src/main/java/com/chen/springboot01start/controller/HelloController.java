package com.chen.springboot01start.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: JINCHENCHEN
 * date: 2020/11/26
 */
@RestController
public class HelloController {
    @Value("${name}")
    private String name;
    @GetMapping("/hello")
    public String hello() {
        System.out.println(name);
        return "Hello, world";
    }
}
