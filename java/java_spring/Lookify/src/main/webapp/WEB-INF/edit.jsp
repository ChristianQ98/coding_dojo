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
	<link rel="stylesheet" type="text/css" href="/css/edit.css">
	<title><c:out value="${song.title}"></c:out></title>
</head>
<body>
	<a href="/dashboard" class="btn btn-dark" id="dashboard">Dashboard</a>
	<form:form method="POST" modelAttribute="songObj" action="/songs/update/${songObj.id}">
		<input type="hidden" name="_method" value="put">
		<div class="row mb-5">
			<form:label path="title">Title</form:label>
			<form:errors path="title" class="error"></form:errors>
			<div class="col-sm-8">
				<form:input path="title" value="${song.title}"/>
			</div>
		</div>
		<div class="row mb-5">
			<form:label for="artist" path="artist">Artist</form:label>
			<form:errors path="artist" class="error"></form:errors>
			<div class="col-sm-8">
				<form:input path="artist" value="${song.artist}"/>
			</div>
		</div>
		
		<div class="row mb-5">
			<form:label for="rating" path="rating">Rating(1-10)</form:label>
			<form:errors path="rating" class="error"></form:errors>
			<div class="col-sm-8">
				<form:input type="number" path="rating" min="1" max="10" id="rating" value="${song.rating}"/>
			</div>
		</div>
		<form:button type="submit" class="btn btn-primary" id="submit">Add Song</form:button>
	</form:form>
</body>
</html>