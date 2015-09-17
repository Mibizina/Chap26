<%-- 
    Document   : JspComptantAppels2
    Created on : 16 sept. 2015, 23:40:36
    Author     : Mihary
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- code Java de détermination du prenom et de comptage des appels --%>
<%! int compte=0; // nombre d'appels %>
<%  String nom = request.getParameter("prenom");
    if (nom == null) nom ="";
    compte++;
%>
<%-- construction de la page html --%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Bonjour comptant ses appels </title>
    </head>
    <body>
        BONJOUR <%= nom%>
        <br><br>
        APPEL numero : <%= compte%>
    </body>
</html>
