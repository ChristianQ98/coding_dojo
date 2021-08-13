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
	<title>New Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form action="/ninjas/create" method="POST" modelAttribute="ninjaObj">
		<div>
			<form:label path="dojo">Dojo:</form:label>
			<form:errors path="dojo"></form:errors>
			<form:select path="dojo">
				<c:forEach var="dojo" items="${dojos}">
					<form:option value="${dojo.id}">
						<c:out value="${dojo.name}"></c:out>
					</form:option>
				</c:forEach>
			</form:select>
		</div>
		<div>
			<form:label path="firstName">First Name:</form:label>
			<form:errors path="firstName"></form:errors>
			<form:input path="firstName"></form:input>
		</div>
		<div>
			<form:label path="lastName">Last Name:</form:label>
			<form:errors path="lastName"></form:errors>
			<form:input path="lastName"></form:input>
		</div>
		<div>
			<form:label path="age">Age:</form:label>
			<form:errors path="age"></form:errors>
			<form:input type="number" path="age"></form:input>
		</div>
		<button type="submit" class="btn btn-primary">Create</button>
	</form:form>
</body>
</html>