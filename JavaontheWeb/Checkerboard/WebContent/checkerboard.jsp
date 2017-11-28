<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>Checkerboard</title>
</head>
<body>
	<% String width = request.getParameter("width"); %>
	<% String height = request.getParameter("height"); %>
	
	<%
	int w = Integer.parseInt(width);
	int h = Integer.parseInt(height);
	%>
	
	<p>Checkerboard: <%= w + "w" +" X " + h + "h" %></p>
	
	<%for(int i = 0; i < h; i++) { %> 
		<%for(int j = 0; j< w; j++) { %>
			<%if(i % 2 == 0) { %>
				<% if(j % 2 == 0) { %>
					<div class="even"></div
				<% } %>
				<% if(j % 2 != 0) { %>
					><div class="odd"></div>
				<% } %>
			<% } %>
			<% if( i % 2 != 0) { %>
				<% if(j % 2 == 0) { %>
					<div class="odd"></div
				<% } %>
				<% if(j % 2 != 0) { %>
					><div class="even"></div>
				<% } %>
			<% } %>
		<% } %>
		<br>
	<% } %>
</body>
</html>