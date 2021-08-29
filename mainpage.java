<%-- 
    Document   : mainpage
    Created on : 28-Aug-2021, 8:57:43 pm
    Author     : Akhil Padmanaban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome!!</h1><br>
        <%   
            String name=request.getParameter("user");
            out.println(name);
        %>
    </body>
</html>
