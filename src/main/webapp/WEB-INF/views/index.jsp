<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<h1>Tiny Inventors</h1>

<table>
	<tr>
		<th>Year</th>
		<th>Name</th>
		<th>Invention</th>
	</tr>

	<c:forEach items="${list}" var="person">
	
	<tr>
		<td>${person.year}</td>
		<td>${person.name}</td>
		<td>${person.invention}</td>
	</tr>
	
	</c:forEach>
	
</table>

<br>
<a href="/complete">Visit the Complete Inventors page.</a>




</body>
</html>