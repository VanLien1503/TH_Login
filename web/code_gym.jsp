<%@ page import="javax.xml.crypto.Data" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 30/07/2020
  Time: 10:09 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="style.css">
<html>
<head>
    <title>Code_Gym</title>
</head>
<body>
<h1> Welcome to Code_Gym</h1>

<%-- jsp cho phép nhúng thêm mã  java  trong cặp dấu <% ... %>--%>
<%
    String username = (String) request.getAttribute("username");
    Date loginTime = (Date) request.getAttribute("LoginTime");
%>

<h3> Hi <%= username + loginTime %>
</h3>
<%--jsp cho phép hiển thị ra HTML nhanh chóng
giá trị của một biến thông qua dấu <%= varName%>--%>
</body>
</html>
