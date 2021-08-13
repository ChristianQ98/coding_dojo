<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="/path/to/tailwind.css" rel="stylesheet">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" type="text/css" href="/css/edit.css">
	<title><c:out value="${language.name}"></c:out></title>
</head>
<body>
	<div class="container">
		<div id="links">
			<a class="btn btn-danger" href="/languages/delete/${language.id}">Delete</a>
			<a class="btn btn-dark" href="/languages">Dashboard</a>
		</div>
		<div id="main">
			<div id="flex">
				<h1> Edit ${language.name}</h1>
				<form:form method="POST" action="/languages/update/${language.id}" modelAttribute="languageObj">
	
							<div class="row mb-3">
								<form:label for="name" path="name" class="col-sm-2 col-form-label">Name</form:label>
								<form:errors path="name"/>
								<div class="col-sm-8">
								<form:input id="name" name="name" path="name" class="form-control form-control-sm" value="${language.name}"/>
								</div>
							</div>
							<div class="row mb-3">
								<form:label for="creator" path="creator" class="col-sm-2 col-form-label">Creator</form:label>
								<form:errors path="creator"/>
								<div class="col-sm-8">
								<form:input id="creator" name="creator" path="creator" class="form-control form-control-sm" value="${language.creator}"/>
								</div>
							</div>
							<div class="row mb-3">
								<form:label for="currentVersion" path="currentVersion" class="col-sm-2 col-form-label">Version</form:label>
								<form:errors path="currentVersion"/>
								<div class="col-sm-8">
								<form:input id="currentVersion" name="currentVerison" path="currentVersion" class="form-control form-control-sm" value="${language.currentVersion}"/>
								</div>
							</div>
						<form:button type="submit" class="btn btn-primary" id="submit">Submit</form:button>
	
					</form:form>
			</div>
		</div>
	</div>
</body>
</html>