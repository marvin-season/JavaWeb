<%--
  Created by IntelliJ IDEA.
  User: mawenshu2019
  Date: 2020/8/18
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<link type="text/css" rel="stylesheet" href="css/main.css">
<body>

<div>
    <h2>请选择您的需求</h2>
    <button><a href="gameAccount/findAll" title="查询所有游戏账号信息">查询所有游戏账号信息 </a></button><br>
    <button><a href="player/findAll">查询拥有账号的玩家信息</a></button><br>
    <button><a href="gameAccount/gotoLogin">去登录游戏账号</a></button><br>
    <button><a href="gameAccount/gotoRegisterGA">去注册游戏账号</a></button><br>
    <button><a href="gameAccount/gotoRegisterP">去注册玩家信息</a></button><br>
    <button><a href="gameAccount/gotoFindAGameAccountWithPlayer" title="(对一查询)">去查询游戏账号及其玩家信息</a></button><br>
    <button><a href="player/gotoFindAPlayerWithGameAccount" title="(对多查询)">去查询玩家及游戏账号其信息</a></button><br>
    <button><a href="player/gotoModifyPlayerInfo">去修改玩家信息</a></button><br>
    <button><a href="gameAccount/gotoDeleteGAInfo">去注销账号信息</a></button><br>
</div>

</body>
</html>
