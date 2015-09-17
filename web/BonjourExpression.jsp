<%-- 
    Document   : BonjourExpression
    Created on : 16 sept. 2015, 22:55:24
    Author     : Mihary
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- page HTML utilisant la valeur de l'expression nom --%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Bonjour Expression</title>
    </head>
    <body>
        <%-- calcul de la chaine correspondant au prenom (vide si pas fourni) --%>
        <% String nom = request.getParameter("prenom");
        if (nom == null) nom = ""; // si pas de parametre , on cree une chaine vide
        %>
        BONJOUR <%=nom %>
    </body>
</html>
