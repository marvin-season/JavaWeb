<%--
  Created by IntelliJ IDEA.
  User: mawenshu2019
  Date: 2020/8/18
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<style type="text/css">
    * {
        margin: 0;
        padding: 0;
    }

    table {
        margin: 50px auto;
        border: 1px solid blueviolet;
        text-align: center;
    }

    td,
    th{
        padding-left: 25px;
        padding-right: 25px;
    }

</style>
<body>
<table>
    <caption>登录成功，您的账号信息如下</caption>
    <tr>
        <th>昵称</th>
        <td>${results[0].name}</td>
    </tr>
    <tr>
        <th>密码</th>
        <td>${results[0].password}</td>
    </tr>
    <tr>
        <th>账号id</th>
        <td>${results[0].id}</td>
    </tr>
    <tr>
        <th>玩家编号</th>
        <td>${results[0].pid}</td>
    </tr>
    <tr>
        <th>段位</th>
        <td>${results[0].rank}</td>
    </tr>
    <tr>
        <th>巅峰赛积分</th>
        <td>${results[0].score}</td>
    </tr>
</table>
</body>
</html>
