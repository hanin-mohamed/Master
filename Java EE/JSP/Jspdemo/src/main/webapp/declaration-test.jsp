<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<%!
    String makeItLower(String data){
        return data.toLowerCase();
    }
%>
Lower Case of "Hello World" is :  <%= makeItLower(" HELLO WORLD")%>
</body>
</html>
