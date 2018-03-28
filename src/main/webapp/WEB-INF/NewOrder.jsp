<%-- 
    Document   : NewOrder
    Created on : 28-03-2018, 18:04:39
    Author     : Nicolai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
         <form name="createOrder" action="FrontController" method="post">
               <input type="hidden" name="command" value="CreateOrder">
            <label>width</label>
            <input type="text"  name="width" />
            <label>length</label>
            <input type="text"   name="length" />
            <label>height</label>
            <input type="text"  name="height" />
            
            <input type="submit" name="submit" />

            <br>


            <a href="customerpage.jsp">Click here to go back</a>
        </form>

        
    </body>
</html>
