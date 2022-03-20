<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete product</title>
</head>
<body>
<h1>Delete Product</h1>
<a href="/products">Back to list product</a>
<form action="/products/delete/${product.id}" method="post">
    <%--    <label>Id</label>--%>
    <%--    <br>--%>
    <%--    <input type="text" name="id" value="${product.id}"><br>--%>
    <label>Name</label>
    <br>
    <input type="text" name="name" value="${product.name}"><br>
    <label>Price</label><br>
    <input type=" text" name="price" value="${product.price}"><br>
    <label>Description</label>
    <br>
    <input type="text" name="description" value="${product.description}"><br>
    <label>Image</label><br>
    <input type=" text" name="image" value="${product.image}"><br>
    <button>Delete</button>
</form>
</body>
</html>
