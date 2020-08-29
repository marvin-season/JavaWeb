<%--
  Created by IntelliJ IDEA.
  User: mawenshu2019
  Date: 2020/8/19
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改玩家信息</title>
</head>
<script src="./js/jquery.js">
</script>
<script>
    $(function () {
        alert("请注意你要修改的玩家id是否存在")
    });
</script>
<link type="text/css" rel="stylesheet" href="./css/form.css">
<body>
<div>
    <table>
        <caption>请修改玩家信息</caption>
        <form action="player/modifyPlayerInfo" method="get">
            <tr>
                <td>id</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>age</td>
                <td><input type="text" name="age"></td>
            </tr>
            <tr>
                <td>gender</td>
                <td><input type="text" name="gender"></td>
            </tr>
            <tr>
                <td>tel</td>
                <td><input type="text" name="tel"></td>
            </tr>
            <tr>
                <td><input type="submit" value="注册"></td>
            </tr>
        </form>
    </table>
</div>
</body>
</html>
