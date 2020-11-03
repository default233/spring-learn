package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

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
