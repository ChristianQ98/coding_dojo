<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="/path/to/tailwind.css" rel="stylesheet">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Dojo Page</title>
</head>
<body>
	<h1><c:out value="${dojo.name}"></c:out> Location Ninjas</h1>
	<table class="table table-primary">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ninja" items="${ninjas}">
				<tr>
					<td>
						<c:out value="${ninja.firstName}"></c:out>
					</td>
					<td>
						<c:out value="${ninja.lastName}"></c:out>
					</td>
					<td>
						<c:out value="${ninja.age}"></c:out>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>