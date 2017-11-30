<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pets</title>
</head>
<body>
	<h1>Create a Dog!</h1>
	
	<form action= "Dog" method ="get">
		<label>Name:</label>
		<input type="text" name="name">
		<label>Breed:</label>
		<input type="text" name="breed">
		<label>Weight:</label>
		<input type="text" name="weight">
		<input type="submit" value="Create!">
	</form>
	
	<h1>Create a Cat!</h1>
	
	<form action= "Cat" method ="get">
		<label>Name:</label>
		<input type="text" name="name">
		<label>Breed:</label>
		<input type="text" name="breed">
		<label>Weight:</label>
		<input type="text" name="weight">
		<input type="submit" value="Create!">
	</form>
</body>
</html>