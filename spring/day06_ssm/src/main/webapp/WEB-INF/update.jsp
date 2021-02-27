<%--
  Created by IntelliJ IDEA.
  User: lofxve
  Date: 2021/1/11
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/accountController/update" method="post">
    <input type="hidden" value="${account.aid}" name="aid">
    name:<input type="text" value="${account.name}" name="name">
    balane:<input type="text" value="${account.balane}" name="balane">
    <input type="submit" value="提交">
</form>
</body>
</html>
