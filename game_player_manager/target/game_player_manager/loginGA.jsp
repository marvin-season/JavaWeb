<%--
  Created by IntelliJ IDEA.
  User: mawenshu2019
  Date: 2020/8/18
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<link type="text/css" rel="stylesheet" href="css/form.css">
<body>
<div>
    <table>
        <%--不用写父目录--%>
        <form action="gameAccount/login" method="get">
            <tr>
                <td>游戏昵称</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="登录"></td>
            </tr>
        </form>
    </table>
</div>
</body>
</html>
