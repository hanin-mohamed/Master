<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  String[] cities = {"Cairo", "Alexandria", "Giza", "Sharm El Sheikh"};
  request.setAttribute("cities", cities);
%>
<html>
<head>
  <title>Cities in Egypt</title>
</head>
<body>
<h1>List of Cities in Egypt</h1>
<ul>
  <c:forEach var="city" items="${cities}">
    <li>${city}</li>
  </c:forEach>
</ul>
</body>
</html>
