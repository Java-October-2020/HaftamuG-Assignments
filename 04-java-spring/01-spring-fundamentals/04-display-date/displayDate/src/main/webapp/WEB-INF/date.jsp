<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current Date</title>
<link rel="stylesheet" type="text/css"  href="css/date.css" >
<script type="text/javascript" src="js/date.js"></script>
</head>
<body onload = "displayDate()">

<div class="date"> 

<h2> <c:out value="${date}"></c:out></h2>

</div>


</body>
</html>