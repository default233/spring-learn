package com.chen.springboot02start.controller;

import com.chen.springboot02start.pojo.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: JINCHENCHEN
 * date: 2020/12/23
 */
@RestController
public class TestController {

    @Autowired
    private Random random;

    @Value("${names}")
    private String name;

    @GetMapping("/random")
    public String random() {
        return random.toString();
    }
}
