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
	<link rel="stylesheet" type="text/css" href="css/result.css">
	<title>Result</title>
</head>
<body>
	<div class="container">
		<c:choose>
		<c:when test="${favorite_language eq 'Java'}">
		<h1 id="facts">Java is the SUPERIOR language</h1>
		<button onclick="window.history.back()" type="button" id="go_back" class="btn btn-primary btn-lg">Go Back</button>
		</c:when>
		<c:otherwise>
		<div>
            <h1>Submitted Info</h1>
            <table class="form-horizontal">
                <div class="form-group">
                    <tr>
                        <td>Name:</td>
                        <td><c:out value="${name}"></c:out></td>
                    </tr>
                </div>
                <div class="form-group">
                    <tr>
                        <td>Dojo Location:</td>
                        <td><c:out value="${dojo_location}"></c:out></td>
                    </tr>
                </div>
                <div class="form-group">
                    <tr>
                        <td>Favorite Language:</td>
                        <td><c:out value="${favorite_language}"></c:out></td>
                    </tr>
                </div>
                <div class="form-group">
                    <tr>
                        <td>Comment:</td>
                        <td><c:out value="${comment}"></c:out></td>
                    </tr>
                </div>
            </table>
            <button onclick="window.history.back()" type="button" id="go_back" class="btn btn-primary btn-lg">Go Back</button>
        </div>
        </c:otherwise>
        </c:choose>
	</div>
</body>
</html>