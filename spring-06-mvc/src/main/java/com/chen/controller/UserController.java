package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * User: JINCHENCHEN
 * Date: 2020/10/29
 */

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/hello")
    public String test() {
        System.out.println("come in");
        User user = userService.selectUser(0L);
        System.out.println(user);
        return user.toString();
    }
}
