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
    String favLang = request.getParameter("favLang");
%>
The student is confirmed: <%= firstName %> <%= lastName %><br>
<%= firstName %>'s fav language is <%=favLang%>
</body>
</html>
