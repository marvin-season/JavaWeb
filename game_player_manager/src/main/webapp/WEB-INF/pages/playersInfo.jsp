<%--
  Created by IntelliJ IDEA.
  User: mawenshu2019
  Date: 2020/8/18
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>players</title>
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
<div id="play_info">
    <table cellpadding="0" cellspacing="1">
        <caption>拥有账号的玩家信息</caption>
        <tr>
            <th>玩家编号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>性别</th>
            <th>电话</th>
        </tr>

        <c:forEach items="${players}" var="item">
            <tr>
                <td>${item.id} </td>
                <td>${item.name}</td>
                <td>${item.age}</td>
                <td>${item.gender}</td>
                <td>${item.tel}</td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
