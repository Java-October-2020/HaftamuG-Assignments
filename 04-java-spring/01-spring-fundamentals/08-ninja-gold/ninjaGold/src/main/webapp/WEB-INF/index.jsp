<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NinjaGold</title>
<link rel="stylesheet" type="text/css"  href="css/style.css" >
</head>
<body>

<h1>Ninja Gold</h1>
<h3>Your Gold: <c:out value="${totalGold}"/></h3>

<c:forEach items="myBuildings" var ="building">



</c:forEach>
<div class="building">
<h3>Farm</h3>
<p>(earns 10-20 gold)</p>
<form method="post" action="/getGold">
<input type="hidden" name="building" value= "farm">
<button> Find Gold</button>
</form>

</div>

<div class="building">
<h3>Cave</h3>
<p>(earns 5-10 gold)</p>
<form method="post" action="/getGold">
<input type="hidden" name="building" value= "cave">
<button> Find Gold</button>
</form>

</div>

<div class="building">
<h3>House</h3>
<p>(earns 2-5 gold)</p>
<form method="post" action="/getGold">
<input type="hidden" name="building" value= "house">
<button> Find Gold</button>
</form>

</div>

<div class="building">
<h3>Casino</h3>
<p>(earns /lose 0-50 gold)</p>
<form method="post" action="/getGold">
<input type="hidden" name="building" value= "casino">
<button> Find Gold</button>
</form>

</div>



</body>
</html>