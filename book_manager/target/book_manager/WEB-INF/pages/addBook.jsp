<%--
  Created by IntelliJ IDEA.
  User: mawenshu2019
  Date: 2020/9/7
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1><small>书籍列表----新增书籍</small></h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/addBook">
        <div class="form-group">
            <label>书籍名称</label>
            <input type="text" class="form-control" name="name" required>
        </div>
        <div class="form-group">
            <label>书籍价格</label>
            <input type="text" class="form-control" name="price" required>
        </div>
        <div class="form-group">
            <label>书籍版本</label>
            <input type="text" class="form-control" name="version" required>
        </div>
        <div class="form-group">
            <label>书籍作者</label>
            <input type="text" class="form-control" name="author" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control">
        </div>
    </form>
</div>
</body>
</html>
