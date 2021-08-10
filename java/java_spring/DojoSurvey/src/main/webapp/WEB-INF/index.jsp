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
	<title>Dojo Survey</title>
</head>
<body>
	<div class="container">
        <form action="/submit" method="POST" class="form-horizontal">
            <div class="form-group">
                <label class="col-form-label-lg">Your Name:</label>
                <input type="text" name="name" id="name" class="flex col-form-label-lg col-sm-12">
            </div>
            <div class="form-group">
                <label class="col-form-label-lg">Dojo Location:</label>
                <select name="dojo_location" id="dojo_location" class="flex col-form-label-lg col-sm-12">
                    <option value="San Jose">San Jose</option>
                    <option value="Los Angeles">Los Angeles</option>
                    <option value="Dallas">Dallas</option>
                    <option value="Seattle">Seattle</option>
                </select>
            </div>
            <div class="form-group">
                <label class="col-form-label-lg">Favorite Language:</label>
                <select name="favorite_language" id="favorite_language" class="flex col-form-label-lg col-sm-12">
                    <option value="Python">Python</option>
                    <option value="Java">Java</option>
                    <option value="Javascript">JavaScript</option>
                    <option value="C">C</option>
                </select>
            </div>
            <label class="col-form-label-lg">Comment(optional):</label>
            <textarea name="comment" id="comment" cols="50" rows="10"></textarea>
            <button type="submit" id="submit" class="btn btn-primary btn-lg">Submit</button>
        </form>
    </div>
</body>
</html>