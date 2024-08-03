<%@ page  import="java.util.*, com.luv2code.web.jdbc.*"%>

<html>
<%

List<Student> students=(List<Student>)request.getAttribute("STUDENT_LIST");
%>
<body>
<%= students %>


</body>
</html>