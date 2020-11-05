<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<c:out value="${langs.name}"/>
<br>
<c:out value="${langs.creator}"/>
<br>
<c:out value="${langs.version}"/>
<br>
<a href="/languages/edit/${langs.id}">Edit</a>
<br>
<a href="/languages/delete/${langs.id}">Delete</a>
<br>
<a href="/languages">Dashboard</a>