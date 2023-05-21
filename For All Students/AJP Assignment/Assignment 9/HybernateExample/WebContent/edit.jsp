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
<form action="RegController" method="get">
<table border="1px solid black">
<c:forEach var="i" items = "${sessionScope.data1}">
<input type=hidden name=idupdate value="${i.id}">
<tr>
<td>First_Name: </td>
<td><input type="text" name="fn" value="${i.fn}"></td>
</tr>
<tr>
<td>Last_Name: </td>
<td><input type="text" name="ln" value="${i.ln}"></td>
</tr>
<tr>
<td>Contact_Number: </td>
<td><input type="text" name="cn" value="${i.cn}"></td>
</tr>
<tr>
<td>Address: </td>
<td><input type="text" name="add" value="${i.add}"></td>
<td><input type="hidden" name="flag" value="Update"></td>
</tr>
<tr>
<td><input type="submit" value="Update"></td>
</tr>
</c:forEach>
</table>
</form>
</body>
</html>