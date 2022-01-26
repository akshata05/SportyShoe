<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Purchase Report</title>
</head>
<body>
<div style="margin-left:40%;margin-top:5%;">
<h1> Purchase Report</h1>
</div>
<div style="margin-left:30%;margin-top:5%;">

<table style=" border: 1px solid black;">
<tr >
<th style=" border: 1px solid black;"> User Id</th>
<th style=" border: 1px solid black;"> User Name</th>
<th style=" border: 1px solid black;"> Product Name</th>
<th style=" border: 1px solid black;"> Product Price</th>
<th style=" border: 1px solid black;"> Product Category</th>
<th style=" border: 1px solid black;"> Purchase Date</th>
</tr>
<c:set var="count" value="0" scope="page" />

<c:forEach items="${purchases}" var="purchase">

<tr style=" border: 1px solid black;">
<td style=" border: 1px solid black;" >${purchase.userId}</td>
<td style=" border: 1px solid black;">${users[count].name}</td>
<td style=" border: 1px solid black;">${products[count].name}</td>
<td style=" border: 1px solid black;">${products[count].price}</td>
<td style=" border: 1px solid black;">${products[count].category}</td>
<td style=" border: 1px solid black;">${purchase.date}</td>
</tr>
<c:set var="count" value="${count + 1}" scope="page"/>
</c:forEach>
</table>
</div>
</body>
</html>