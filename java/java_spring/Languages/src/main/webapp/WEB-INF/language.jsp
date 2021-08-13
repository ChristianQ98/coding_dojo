<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="/path/to/tailwind.css" rel="stylesheet">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="/css/language.css">
	<title><c:out value="${language.name}"></c:out></title>
</head>
<body>
	<div class="container">
		<div id="main">
			<h1><c:out value="${language.name}"></c:out></h1>
			<p>Creator: <c:out value="${language.creator}"></c:out></p>
			<p>Version: <c:out value="${language.currentVersion}"></c:out></p>
			<a class="btn btn-primary" href="/languages">Go Back</a>
			<a class="btn btn-warning" href="/languages/edit/${language.id}">Edit</a>
			<a class="btn btn-danger" href="/languages/delete/${language.id}">Delete</a>
		</div>
	</div>
</body>
</html>