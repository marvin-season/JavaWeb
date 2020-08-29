<%--
  Created by IntelliJ IDEA.
  User: mawenshu2019
  Date: 2020/8/19
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>findAPlayerWithGameAccount</title>
</head>
<link type="text/css" rel="stylesheet" href="css/form.css">
<body>
<h1>欢迎查询玩家及其游戏账号的信息</h1>
<div>
    <form method="get" action="player/findAPlayerWithGameAccount">
        <input type="text" name="name" placeholder="请输入您的姓名"><br>
        <input type="submit" value="查询">
    </form>
</div>


</body>
</html>
