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
	<link rel="stylesheet" type="text/css" href="/css/song.css">
	<title>${song.title}</title>
</head>
<body>
	<a href="/dashboard" class="btn btn-dark" id="dashboard">Dashboard</a>
	<div id="box">
		<div class="flex">
		<p>Title</p>
		<p><c:out value="${song.title}"></c:out></p>
		</div>
		
		<div class="flex">
		<p>Artist</p>
		<p><c:out value="${song.artist}"></c:out></p>
		</div>
		
		<div class="flex">
		<p>Rating(1-10)</p>
		<p id="rating"><c:out value="${song.rating}"></c:out></p>
		</div>
		<a href="/songs/delete/${song.id}" class="btn btn-danger" id="delete">Delete</a>
	</div>
</body>
</html>