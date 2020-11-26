<%@ page import="com.chen.pojo.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: JINCHENCHEN
  Date: 2020/11/26
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Car</title>
</head>
<body>
<br>
<%
    List<User> users = (List) request.getAttribute("users");
%>
<c:forEach items="${requestScope.users}" varStatus="user">
    ${user.toString()}<br>
</c:forEach>
<br>
</body>
</html>
