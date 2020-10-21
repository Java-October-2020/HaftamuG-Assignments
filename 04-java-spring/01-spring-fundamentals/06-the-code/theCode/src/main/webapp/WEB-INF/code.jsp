<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"  href="css/code.css" >
</head>
<body>

<form method="POST" action="/code">

<p class="red"><c:out value="${error}"> </c:out></p>
	<p>What is the code?</p>
    <input type="text" name="code">
    <button>Try Code</button>
    
</form>


</body>
</html>