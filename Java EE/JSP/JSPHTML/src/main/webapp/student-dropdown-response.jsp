<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Confirmation</title>
</head>
<body>
<%
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String country = request.getParameter("country");
%>
The student is confirmed: <%= firstName %> <%= lastName %>
<br><br>
The student's country : <%= country %>
</body>
</html>
