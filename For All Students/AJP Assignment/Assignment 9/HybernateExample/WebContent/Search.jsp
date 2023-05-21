<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<body>
<table border="1px solid black">
<tr>
<th>Number</th>
<th>First Name</th>
<th>Last Name</th>
<th>Contact Number</th>
<th>Address</th>
<th>Action</th>
</tr>
<c:forEach items="${sessionScope.data}" var="i" varStatus="j">
<tr>
<td>${j.count}</td>
<td>${i.fn}</td>
<td>${i.ln}</td>
<td>${i.cn}</td>
<td>${i.add}</td>
<td><a href="RegController?flag=Delete&x=${i.id}">Delete</td>
<td><a href="RegController?flag=Edit&y=${i.id}">Edit</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>