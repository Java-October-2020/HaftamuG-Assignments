<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/survey.js"></script>
<link rel="stylesheet" type="text/css"  href="css/dojo.css" >
</head>
<body>
<div class="survey">
<h4 style="text-decoration: underline;">Submitted Info</h4>
<p> Name:  <c:out value="${yourname }" ></c:out></p>

<p>Dojo Location:  <c:out value="${location }" ></c:out></p>

<p> Favorite Language:   <c:out value="${language }" ></c:out></p>

<p> Comment:   <c:out value="${comment }" ></c:out></p>
<br></br>
<button onclick="goBack()">Go Back</button>
</div>
</body>
</html>