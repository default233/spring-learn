package com.chen.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 前端发生 post 请求时，请求参数被包裹在请求体中
 * 当调用请求对象 HttpServletRequest 获取参数时，Tomcat 解析请求体并解码
 * 因此可以在获取参数之前，调用 setCharacterEncoding 方法设置解码方式
 * 进而解决中文乱码
 * author: JINCHENCHEN
 * date: 2020/12/30
 */
public class PostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String sex = req.getParameter("sex");
        System.out.println(sex);
    }
}
