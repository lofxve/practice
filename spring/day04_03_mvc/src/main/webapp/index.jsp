<%--
  Created by IntelliJ IDEA.
  User: lofxve
  Date: 2021/1/9
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/domeController/dome01">入门案例</a>
<form action="/domeController/dome02" method="post">
    <input type="submit" value="验证post请求">
</form>
<a href="${pageContext.request.contextPath}/domeController/dome03?username=张三&age=18">接受参数-简单类型</a><br>
<a href="${pageContext.request.contextPath}/domeController/dome04?username=张三&age=18">接受参数-对象类型</a><br>
<a href="${pageContext.request.contextPath}/domeController/dome05?age=19&age=18&age=17">接受参数-数组类型</a><br>
<form action="/domeController/dome06" method="post">
    <%--list--%>
    <input type="text" name="userList[0].username" value="张三">
    <input type="text" name="userList[0].age" value="18">
    <input type="text" name="userList[1].username" value="李四">
    <input type="text" name="userList[1].username" value="19">

    <%-- map--%>
    <input type="text" name="map['1001']" value="张三">
    <input type="text" name="map['1002']" value="李四">
    <input type="submit" value="接受参数-集合类型">
</form>
<a href="${pageContext.request.contextPath}/domeController/dome07?usernAme=张三&aGe=18&pageNum=10&=pageSize=20&password=root&age=19&age=18&age=17">接受参数-RequestParam测试</a><br>
<a href="${pageContext.request.contextPath}/domeController/dome08">接受参数-@RequestHeader</a><br>
<a href="${pageContext.request.contextPath}/domeController/dome09?birthday=2020-12-15">自定义类型转换器</a><br>
<form action="/domeController/dome10" method="post" enctype="multipart/form-data">
    <input type="file" name="multipartFile">
    <input type="submit" value="单文件上传">
</form>
<form action="/domeController/dome11" method="post" enctype="multipart/form-data">
    <input type="file" name="multipartFiles" multiple>
    <input type="submit" value="多文件上传">
</form>
<hr>
<a href="${pageContext.request.contextPath}/domeController/dome12">页面转发——简单方式</a><br>
<a href="${pageContext.request.contextPath}/domeController/dome13">页面转发——forward</a><br>
<a href="${pageContext.request.contextPath}/domeController/dome14">页面转发——原生api</a><br>
<a href="${pageContext.request.contextPath}/domeController/dome15">页面重定向——redirect</a><br>
<a href="${pageContext.request.contextPath}/domeController/dome16">页面重定向——原生api</a><br>
<a href="${pageContext.request.contextPath}/domeController/dome17">页面重定向+转发</a><br>
<button id="btn" type="submit" value="Ajax实现异步交互">Ajax实现异步交互</button>
<%--script标签不能自闭合--%>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script>
    $("#btn").click(function () {//绑定点击事件
        //触发ajax请求
        $.ajax({
            type: "POST",//请求方式
            url: "${pageContext.request.contextPath}/domeController/dome18",//请求地址
            contentType: "application/json",//指定请求参数的格式为json
            dataType: "json",//指定返回数据的格式为json
            data: '[{"username":"张三","age":18},{"username":"李四","age":19}]',//请求参数
            success: function (data) {//回调函数
                console.log(data);
            }
        });
    })
</script>
<a href="${pageContext.request.contextPath}/domeController/dome20">拦截器20</a><br>
<a href="${pageContext.request.contextPath}/domeController/dome21">拦截器21</a><br>
</body>
</html>
