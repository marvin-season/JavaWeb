<%--
  Created by IntelliJ IDEA.
  User: mawenshu2019
  Date: 2020/8/18
  Time: 15:23
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
    <caption>所有游戏账号信息</caption>
    <tr>
        <th>昵称</th>
        <th>密码</th>
        <th>账号id</th>
        <th>玩家编号</th>
        <th>段位</th>
        <th>巅峰赛积分</th>
    </tr>

    <c:forEach items="${gameAccounts}" var="item">
        <tr>
            <td>${item.name}</td>
            <td>${item.password}</td>
            <td>${item.id} </td>
            <td>${item.pid}</td>
            <td>${item.rank}</td>
            <td>${item.score}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
