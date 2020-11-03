package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: JINCHENCHEN
 * Date: 2020/11/02
 */
public class UserController {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        User user = userService.selectUserById(002L);
        System.out.println(user);
    }
}
