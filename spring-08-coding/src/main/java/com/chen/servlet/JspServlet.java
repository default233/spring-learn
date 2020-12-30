package com.chen.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 对于 jsp 页面，服务器会将起生成为java类，利用响应对象将页面中的内容写入，并编译为 class 对象，
 * 因此要告知浏览器端，响应对象中内容的格式和编码方式
 * 需要在 jsp 页面顶部设置
 * <%@ page contentType="text/html;charset=UTF-8"%>
 * 即可解决
 * author: JINCHENCHEN
 * date: 2020/12/30
 */
public class JspServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        resp.setContentType("text/html;charset=utf-8");
        req.setAttribute("admin", "男");
        req.getRequestDispatcher("test.jsp").forward(req, resp);
    }
}
