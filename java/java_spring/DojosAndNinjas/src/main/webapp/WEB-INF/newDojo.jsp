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
	<link rel="stylesheet" type="text/css" href="/css/newDojo.css">
	<title>New Dojo</title>
</head>
<body>
	<div id="flex">
		<div>
			<h1>New Dojo</h1>
		</div>
		<form:form action="/dojos/create" method="POST" modelAttribute="dojoObj">
			<div>
				<form:label path="name">Name:</form:label>
				<form:errors path="name" class="errors"></form:errors>
				<form:input path="name" />
			</div>
			<div>
				<button type="submit" class="btn btn-primary">Create</button>
			</div>
		</form:form>
	</div>
</body>
</html>