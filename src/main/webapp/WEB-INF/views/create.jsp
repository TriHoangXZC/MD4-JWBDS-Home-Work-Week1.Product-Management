<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 3/20/2022
  Time: 9:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create product</title>
</head>
<body>
<h1>Create new product</h1>
<a href="/products">Back to list product</a>
<form action="/products/create" method="post">
    <lable>Id</lable><br>
    <input type="text" name="id" placeholder="Input id product"><br>
    <lable>Name</lable><br>
    <input type="text" name="name" placeholder="Input name product"><br>
    <lable>Price</lable><br>
    <input type="text" name="price" placeholder="Input price product"><br>
    <lable>Description</lable><br>
    <input type="text" name="description" placeholder="Input description product"><br>
    <lable>Image</lable><br>
    <input type="text" name="image" placeholder="Input image product"><br>
    <button>Create</button>
</form>
</body>
</html>
