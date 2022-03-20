
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<h1>List Product</h1>
<a href="/products">Back to list product</a>
<a href="/products/create">Create new product</a>
<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Image</td>
        <td colspan="2">Action</td>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td><img src="${product.image}"></td>
            <td><a href="/products/edit/${product.id}">Edit</a></td>
            <td><a href="/products/delete/${product.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
