<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container"></div>
<table class="table table-dark"></table>
<thead>
   <th>author</th>
   <th>bookname</th>
   <th>language</th>
   <th>pages</th>
</thead>
<tbody>
<c:forEach items="$books" var="book">
<tr>
<td>${book.author}</td>
<td>${book.bookname}</td>
<td>${book.language}</td>
<td>${book.pages}</td>
</tr>
</c:forEach>
</tbody>

</body>
</html>