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
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Secret Code</title>
</head>
<body>
	<div class="container">
		<div id="main">
			<p id="error"><c:out value="${error}"></c:out></p>
			<p>What is the code?</p>
			<form method="POST" action="/login">
			<input type="text" name="code">
			<div>
			<button class="btn btn-primary" type="submit">Try Code</button>
			</div>
			</form>
		</div>
	</div>
</body>
</html>