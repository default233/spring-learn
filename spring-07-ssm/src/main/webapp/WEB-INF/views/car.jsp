<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.chen.pojo.ProCar" %><%--
  Created by IntelliJ IDEA.
  User: JINCHENCHEN
  Date: 2020/11/9
  Time: 11:14
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
    List<ProCar> cars = (List) request.getAttribute("cars");
%>
<c:forEach items="${requestScope.cars}" varStatus="id">
    ${id.toString()}<br>
</c:forEach>
<br>
</body>
</html>
