package com.chen.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 前端发送 post 请求发送中文参数时，由于 Tomcat 服务器直接解析了URL中携带的参数
 * 因此是否乱码决定于 tomcat 默认的URL解码方式，可在 tomcat 配置文件中进行设置
 * 现行版本下，中文问题无乱码
 * author: JINCHENCHEN
 * date: 2020/12/30
 */
public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String admin = req.getParameter("admin");
        System.out.println(admin);
    }
}
