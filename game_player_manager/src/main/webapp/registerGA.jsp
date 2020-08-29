<%--
  Created by IntelliJ IDEA.
  User: mawenshu2019
  Date: 2020/8/18
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link type="text/css" rel="stylesheet" href="css/form.css">
<body>
<h1>您还没有游戏账号喔，请先注册一个游戏账号</h1>
<div>
    <table>
        <form action="gameAccount/registerGA" method="get">
            <tr>
                <td>player id</td>
                <td><input type="text" name="pid"></td>
            </tr>
            <tr>
                <td>游戏昵称</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>确认密码</td>
                <td><input type="password" name="password2"></td>
            </tr>
            <tr>
                <td><input type="submit" value="注册"></td>
            </tr>
        </form>

    </table>
</div>
</body>
</html>
