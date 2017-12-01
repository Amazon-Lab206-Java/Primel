<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<title>Dojo Survey</title>
</head>
<body>
<form action='/' method='post'>
        Your Name: <input type='text' name='name'>
        Location: <select name='location'>
                    <option value='Tempe'>Tempe</option>
                    <option value='Seattle'>Seattle</option>
                    <option value='Mountain View'>Mountain View</option>
                </select>
        Favorite Language: <select name='language'>
                    <option value='JavaScript'>JavaScript</option>
                    <option value='Python'>Python</option>
                    <option value='C++'>C++</option>
                </select>
        Comment (optional): <textarea name='comment'></textarea>
        <input type='submit' value='Submit'>
    </form>
</body>
</html>