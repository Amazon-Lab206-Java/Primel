<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<title>Dojo Survey</title>
</head>
<body>
<h1>Submitted Info:</h1>
<p>Name: <c:out value="${name}"></c:out></p>
<p>Location: <c:out value="${location}"></c:out></p>
<p>Favorite Language: <c:out value="${language}"></c:out></p>
<p>Comment: <c:out value="${comment}"></c:out></p>

<a href="/">Go Back</a>
</body>
</html>