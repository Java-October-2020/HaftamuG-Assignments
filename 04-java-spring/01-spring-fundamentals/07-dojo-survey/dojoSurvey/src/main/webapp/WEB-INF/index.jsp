<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"  href="css/dojo.css" >
</head>
<body>
<div class="index">
<form method="POST" action="/new">

<p>Name: <input type="text" name="name"></p>

<label for="location">Dojo Location:</label>
  <select name="location" id="states">
    <option value="San Jose">San Jose</option>
    <option value="Dallas">Dallas</option>
    <option value="Raleigh">Raleigh</option>
    <option value="Plano">Plano</option>
  </select>
  <br><br>
  <label for="language">Favorite Language:</label>
    <select name="language" id="language">
    <option value="English">French</option>
    <option value="French">French</option>
    <option value="Spanish">Spanish</option>
    <option value="Amharic">Amharic</option>
  </select>
  
  <br><br>
  <label for="language">Comment(optional):</label>
 <textarea rows="4" cols="50" name="comment"></textarea>
 <br><br>

 <input class="submit" type="submit" value="Submit">
</form>
</div>
</body>
</html>