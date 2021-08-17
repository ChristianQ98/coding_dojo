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
	<link rel="stylesheet" type="text/css" href="/css/search.css">
	<title>Search Results</title>
</head>
<body>
	<div id="nav">
		<h1>Songs by Artist: <c:out value="${artist}"></c:out></h1>
		<form method="GET" action="/search">
		<div id="search">
				<input type="text" placeholder="Search for an artist" name="artist" id="search-bar">
				<button type="submit" class="btn btn-primary" id="search-btn">Search Artists</button>
		</div>
			</form>
	</div>
	<div class="container">
		<form method="POST" action="">
		</form>
		<table class="table table-primary">
			<thead>
				<tr>
					<th>Name</th>
					<th>Rating</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="song" items="${songs}">
					<tr>
						<td>${song.title}</td>
						<td>${song.rating}</td>
						<td>
							<a href="/songs/edit/${song.id}" class="btn btn-warning">Edit</a>
							<a href="/songs/delete/${song.id}" class="btn btn-danger">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/dashboard" class="btn btn-dark" id="dashboard-btn">Go Back</a>
	</div>
	
</body>
</html>