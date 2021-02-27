<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lofxve
  Date: 2021/1/11
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${accounts}
<table border="1px" cellpadding="0px" cellspacing="0px"><br>
    <a href="${pageContext.request.contextPath}/accountController/toadd">添加</a>
    <tr>
        <td>aid</td>
        <td>name</td>
        <td>blance</td>
        <td>修改</td>
        <td>删除</td>
    </tr>
    <c:forEach items="${accounts}" var="account">
        <tr>
            <td>${account.aid}</td>
            <td>${account.name}</td>
            <td>${account.balane}</td>
            <td><a href="${pageContext.request.contextPath}/accountController/toUpdate?aid=${account.aid}">修改</a></td>
            <td><a href="${pageContext.request.contextPath}/accountController/delete?aid=${account.aid}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
