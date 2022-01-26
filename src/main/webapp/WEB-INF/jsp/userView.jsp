<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User List</h1>
<table>
<tr>
<th> Id</th>
<th>Name</th>
</tr>
<c:forEach items="${users}" var="user">

<tr>
<td>${user.userId}</td>
<td>${user.name}</td>
</tr>

</c:forEach>
</table>

</body>
</html>