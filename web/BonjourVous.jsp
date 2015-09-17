<%-- 
    Document   : BonjourVous
    Created on : 16 sept. 2015, 21:30:38
    Author     : Mihary
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Bonjour Vous</title>
    </head>
    <body>
        <%
            String nom = request.getParameter("prenom");
            if (nom == null)
            {
                out.println("BONJOUR");
            }
            else
            {
                out.println("BONJOUR " + nom);
            }
        %>
        <%
            for (int i=0; i<5 ; i++)
            {
                out.println("<br>");
                out.println("Salama Tompoko o!");
                
            }
        %>
        <% for (int i=0;i<3;i++)
        {
        %>
        <br>
        Mbarakaly
        <%
        }    
        %>
    </body>
</html>
