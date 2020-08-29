<%--
  Created by IntelliJ IDEA.
  User: mawenshu2019
  Date: 2020/8/19
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>findGameAccountWithPlayer</title>
</head>
<link type="text/css" rel="stylesheet" href="css/form.css">
<body>
<h1>欢迎查询游戏账号及其玩家的信息</h1>
<div>
    <form method="get" action="gameAccount/findAGameAccountWithPlayer">
        <input type="text" name="name" placeholder="请输入游戏昵称查找">
        <input type="submit" value="查询">
    </form>
</div>

</body>
</html>
