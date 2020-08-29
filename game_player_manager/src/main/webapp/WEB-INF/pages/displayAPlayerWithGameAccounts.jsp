<%--
    玩家和他的账号信息
  Created by IntelliJ IDEA.
  User: mawenshu2019
  Date: 2020/8/19
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>displayAPlayerWithGameAccounts</title>
</head>
<style type="text/css">
    * {
        margin: 0;
        padding: 0;
    }

    table {
        margin: 50px auto;
        text-align: center;
    }

    table {
        background-color: #aaa;
        line-height: 25px;
    }

    th {
        padding-left: 8px;
        padding-right: 8px;
        background-color: #fff;
    }

    td {
        padding-left: 8px;
        padding-right: 8px;
        background-color: #fff;
        text-align: center
    }

</style>
<body>
<table cellpadding="0" cellspacing="1">
    <caption>玩家信息</caption>
    <tr>
        <th>玩家编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
        <th>电话</th>
    </tr>
    <tr>
        <td>${playerWithGameAccounts[0].id}</td>
        <td>${playerWithGameAccounts[0].name}</td>
        <td>${playerWithGameAccounts[0].age}</td>
        <td>${playerWithGameAccounts[0].gender}</td>
        <td>${playerWithGameAccounts[0].tel}</td>
    </tr>
</table>
<table cellpadding="0" cellspacing="1">
    <caption>游戏账号信息</caption>
    <tr>
        <th>昵称</th>
        <th>密码</th>
        <th>账号id</th>
        <th>玩家编号</th>
        <th>段位</th>
        <th>巅峰赛积分</th>
    </tr>
    <c:forEach items="${playerWithGameAccounts[0].gameAccounts}" var="item">
        <tr>
            <td>${item.name}</td>
            <td>${item.password}</td>
            <td>${item.id}</td>
            <td>${item.pid}</td>
            <td>${item.rank}</td>
            <td>${item.score}</td>
        </tr>
    </c:forEach>
</table>
<table cellpadding="0" cellspacing="1">
    <caption>擅长的游戏位置及其作用信息</caption>
    <tr>
        <th>位置</th>
        <th>作用</th>
    </tr>
    <c:forEach items="${allRolersOfPlayer[0].rolers}" var="item">
        <tr>
            <td>${item.location}</td>
            <td>${item.fun}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
