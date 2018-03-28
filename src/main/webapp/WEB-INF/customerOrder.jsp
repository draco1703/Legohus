<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../includes/menu.jsp" %>
        <h1>Hello World!</h1>
        <p>your length ${length}</p>
        <p>your Width ${width}</p>
        <p>your Height ${height}</p>
        
        <%= request.getAttribute("bricks")%>

        <form name="confirmorder" action="FrontController" method="post">
               <input type="hidden" name="command" value="confirmorder">
            
            
            <input type="submit" name="submit" />
         </form>
    </body>
</html>

<%--  <p><%=// request.getAttribute("h") %></p> --%>