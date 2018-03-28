
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <%@include file="../includes/menu.jsp" %>
        <h1>Hello <%=request.getParameter( "email" )%> </h1>
        You are now logged in as a customer of our wonderful site.
        
     
            <a class="button center" href="FrontController?command=newOrder">Klik her får at komme til bestillingssiden</a>
            <a class="button center" href="FrontController?command=showOrderCommand">Klik her for at komme til dine ordrer</a>


        
    </body>
</html>
