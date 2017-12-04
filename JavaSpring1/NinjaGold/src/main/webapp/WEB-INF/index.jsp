<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<title>Welcome</title>
</head>
<body>
<h3>Your Gold: <c:out value="${gold}"></c:out></h3>
<a href="/reset">Reset</a>
    <div class='wrap'>
        <div class='box'>
            <h1>Farm</h1>
            <p>(earns 10-20g)</p>
            <form action="/" method="post">
                <input type="hidden" name="building" value="farm" />
                <input type="submit" value="Find Gold!"/>
              </form>
        </div>
        <div class='box'>
            <h1>Cave</h1>
            <p>(earns 5-10g)</p>
            <form action="/" method="post">
                <input type="hidden" name="building" value="cave" />
                <input type="submit" value="Find Gold!"/>
              </form>
        </div>
        <div class='box'>
            <h1>House</h1>
            <p>(earns 2-5g)</p>
            <form action="/" method="post">
                <input type="hidden" name="building" value="house" />
                <input type="submit" value="Find Gold!"/>
              </form>
        </div>
        <div class='box'>
            <h1>Casino</h1>
            <p>(earns/takes 0-50g)</p>
            <form action="/" method="post">
                <input type="hidden" name="building" value="casino" />
                <input type="submit" value="Find Gold!"/>
              </form>
        </div>
    </div>
<h3>Activities:</h3>
	<c:forEach var="msg" items="${log}">
		<p><c:out value="${msg}"/></p>
	</c:forEach>
</body>
</html>
