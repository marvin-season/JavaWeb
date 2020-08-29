<%--
  Created by IntelliJ IDEA.
  User: mawenshu2019
  Date: 2020/8/19
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>deleteGAInfo</title>
</head>
<link type="text/css" rel="stylesheet" href="css/form.css">
<body>
<div>
    <table>
        <caption>请输入账号昵称和密码进行注销</caption>
        <form action="gameAccount/deleteGAInfo" method="get">
            <tr>
                <td>游戏昵称</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="注销游戏账号"></td>
            </tr>
        </form>
    </table>
</div>
</body>
</html>
