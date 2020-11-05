<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Language collection dot com</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous"></head>
<body> 
<h1>List of Languages</h1>
<form:form action="/languages" method="POST" modelAttribute="lang">
<table class="table table-dark">
    <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
        </tr>
    </thead>
    <tbody>
		<c:forEach items="${langs}" var="langs">
		<tr>    
		    <td><c:out value="${langs.name}"/></td>
		    <td><c:out value="${langs.creator}"/></td>
		    <td><c:out value="${langs.version}"/></td>
		    <td><a href="/languages/edit/${langs.id}">Edit</a></td>
		    <td><a href="/languages/delete/${langs.id}">Delete</a></td>
		</tr>
        </c:forEach>
    </tbody>
</table>

   

	<p>
		<form:label path="name">Name</form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
	</p>
	<p>
		<form:label path="creator">Creator</form:label>
		<form:errors path="creator"/>
		<form:input path="creator"/>
	</p>
	<p>
		<form:label path="version">Version</form:label>
		<form:errors path="version"/>
		<form:input path="version"/>
	</p>
	<input type="submit" value="Submit"></input>
</form:form>
</body>
</html>