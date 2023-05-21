<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRATION PAGE</title>
</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<body>
<f:form action="insert.html" post="Post" modelAttribute="RegVO">
<table border="1px solid black">
<tr>
<td>STUDENT_ID:</td>
<td><f:input path="studentID" /></td>
</tr>
<tr>
<td>ENROLLMENT_NUMBER:</td>
<td> <f:input path="enrollment" /></td>
</tr>
<tr>
<td>SEMESTER:</td>
<td><f:input path="semester" /></td>
</tr>
<tr>
<td>SPI:</td>
<td> <f:input path="SPI" /></td>
</tr>
<tr>
<td> <f:hidden path="id" /></td>
</tr>
<tr>
<td> <input type="submit" value="Submit"></td>
</tr>
</table>
</f:form>
</body>
</html>
Search.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<body>
<table border="1px solid black">
<tr>
<th>Id</th>
<th>STUDENT_ID</th>
<th>ENROLLMENT_NUMBER</th>
<th>SEMESTER</th>
<th>SPI</th>
<th>ACTION</th>
</tr>
<c:forEach items="${SearchList}" var="p">
<tr>
<td>${p.id}</td>
<td>${p.studentID}</td>
<td>${p.enrollment}</td>
<td>${p.semester}</td>
<td>${p.SPI}</td>
<td colspan="2"><a href="delete.html?id=${p.id}">Delete</a>&nbsp;&nbsp;<a
href="edit.html?id=${p.id}">Edit</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>