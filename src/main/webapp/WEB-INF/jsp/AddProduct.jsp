<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<h1>Enter product details</h1>
<form action="./add">
<div>Name<input type="text" name="name" placeholder="name" required="required" ></div>
<div>Category<input type="text" name="category" placeholder="Category" required="required"></div>
<div>Price<input type="text" name="price" placeholder="Price" required="required"></div>
<div>Description<input type="text" name="description" placeholder="description"></div>
<div><input type="submit" name="submit"></div>
</form>
</body>
</html>