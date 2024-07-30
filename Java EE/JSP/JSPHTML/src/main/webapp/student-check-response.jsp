<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Confirmation</title>
</head>
<body>
<%
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String[]  favlang = request.getParameterValues("favLang");
%>
The student is confirmed: <%= firstName %> <%= lastName %><br>
<%= firstName %>'s fav language is:  <% if(favlang!=null) for (String lang :favlang) out.print(lang+",  "); else  out.print(" no favorite languages"); %>
</body>
</html>
