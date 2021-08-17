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
	<link rel="stylesheet" type="text/css" href="css/dashboard.css">
	<title>Lookify!</title>
</head>
<body>
	<div id="nav">
		<a href="/songs/new" class="btn btn-success">Add New</a>
		<a href="/songs/topTen" class="btn btn-info">Top Songs</a>
		<form method="GET" action="/search">
		<div id="search">
				<input type="text" placeholder="Search for an artist" name="artist" id="search-bar">
				<button type="submit" class="btn btn-primary" id="search-btn">Search Artists</button>
		</div>
			</form>
	</div>
	<div id="table">
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
						<td><a href="/songs/${song.id}"><c:out value="${song.title}"></c:out></a></td>
						<td><c:out value="${song.rating}"></c:out></td>
						<td>
							<a href="/songs/edit/${song.id}" class="btn btn-warning">Edit</a>
							<a href="/songs/delete/${song.id}" class="btn btn-danger">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script src="/js/script.js"></script>
</body>
</html>