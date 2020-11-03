package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: JINCHENCHEN
 * Date: 2020/10/29
 */
public class UserController {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = userService.selectUser(1L);
        System.out.println(user);

    }
}
