<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Complete Inventors</title>
</head>
<body>

<h1>Complete Inventors</h1>

<table>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Innovation</th>
		<th>Year</th>
	</tr>

	<c:forEach items="${list }" var="person">
	
	<tr>
		<td>${person.firstName}</td>
		<td>${person.lastName}</td>
		<td>${person.innovation }</td>
		<td>${person.year}</td>
	</tr>
	
	</c:forEach>
	
</table>

<br>
<a href="/">Visit the homepage.</a>





</body>
</html>