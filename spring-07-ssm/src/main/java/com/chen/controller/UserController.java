package com.chen.controller;

import com.chen.pojo.ProCar;
import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.List;

/**
 * author: JINCHENCHEN
 * date: 2020/11/26
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String list(ServletRequest request, ServletResponse response) {
        List<User> users = userService.list();
        request.setAttribute("users", users);
        return "user";
    }
}
