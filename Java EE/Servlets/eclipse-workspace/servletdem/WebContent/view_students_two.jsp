<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<br/><br/>
<table border="1">
<tr>
<th>First Name<th/>
<th>Last Name<th/>
<th>Email <th/>
</tr>

<c:forEach var ="tempStudent" items="${student_list}">
<tr>
<td>${temp_Student.firstName}</td>
<td>${temp_Student.lastName}</td>
<td>${temp_Student.email}</td>

</tr>
</c:forEach>

</body>

</html>