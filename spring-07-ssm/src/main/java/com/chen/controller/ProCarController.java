package com.chen.controller;

import com.chen.pojo.ProCar;
import com.chen.service.ProCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.List;

/**
 * User: JINCHENCHEN
 * Date: 2020/11/09
 */
@Controller
@RequestMapping("/car")
public class ProCarController {

    @Autowired
    private ProCarService proCarService;

    @GetMapping("/list")
    public String listAllCar(ServletRequest request, ServletResponse response) {
        List<ProCar> cars = proCarService.listAllCar();
        request.setAttribute("cars", cars);
        return "car";
    }
}
