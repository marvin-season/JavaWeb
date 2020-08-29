<%--
  Created by IntelliJ IDEA.
  User: mawenshu2019
  Date: 2020/8/19
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>displayAGameAccountWithPlayers</title>
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
<body style="text-align: center">
<h3>您查询的游戏账号及其玩家的信息</h3>

<table cellpadding="0" cellspacing="1">
    <caption>游戏账号信息</caption>
    <tr>
        <th>昵称</th>
        <th>密码</th>
        <th>账号id</th>
        <th>玩家编号</th>
        <th>段位</th>
        <th>巅峰赛积分</th>
    <tr>
        <td>${AGameAccountWithPlayers[0].name}</td>
        <td>${AGameAccountWithPlayers[0].password}</td>
        <td>${AGameAccountWithPlayers[0].id}</td>
        <td>${AGameAccountWithPlayers[0].pid}</td>
        <td>${AGameAccountWithPlayers[0].rank}</td>
        <td>${AGameAccountWithPlayers[0].score}</td>
    </tr>
</table>
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
        <td>${AGameAccountWithPlayers[0].player.id}</td>
        <td>${AGameAccountWithPlayers[0].player.name}</td>
        <td>${AGameAccountWithPlayers[0].player.age}</td>
        <td>${AGameAccountWithPlayers[0].player.gender}</td>
        <td>${AGameAccountWithPlayers[0].player.tel}</td>
    </tr>

</table>

</body>
</html>
