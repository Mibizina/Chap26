<%-- 
    Document   : JspComptantAppels
    Created on : 16 sept. 2015, 23:25:50
    Author     : Mihary
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Bonjour comptant ses appels </title>
    </head>
    <body>
        <%! int compte=0; %>
        <% String nom = request.getParameter("prenom");
            if (nom == null )
            {
                out.println("BONJOUR");
            }
            else
            {
                out.println("BONJOUR " + nom);
            }
            compte++ ;
            out.println("numero : " + compte);
        %>
    </body>
</html>
