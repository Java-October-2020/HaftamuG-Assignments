<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Name!</title>
<link rel="stylesheet" type="text/css"  href="css/name.css">
</head>
<body>

<div class="name">
<h1> Hello <c:out value="${myname}"></c:out>!</h1>
<p> Welcome to SpringBoot!</p>
</div>


</body>
</html>