<%-- 
    Document   : Practica3
    Created on : 4/03/2019, 08:55:12 PM
    Author     : Rolando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica3</title>
    </head>
    <body>
        <%
        String nombre = request.getParameter("nombredelusuario"); 
        String email = request.getParameter("mail");
        String primerapellido = request.getParameter("primerapellido");
        String segundoapellido = request.getParameter("segundoapellido");
        String contraseña = request.getParameter("contraseña");
        String fechadenacimiento = request.getParameter("nacimiento");
        %>
        
        
            <%out.println("<h1> Bienvenido(a), favor de confirmar sus datos:</h1>"); %>
            <%out.println("<h2> Nombre: " + nombre + " </h2>"); %>
            <%out.println("<h2> Primer apellido: " + primerapellido + " </h2>"); %>
            <%out.println("<h2> Segundo apellido: " + segundoapellido + " </h2>"); %>
            <%out.println("<h2> E-mail: " + email + " </h2>"); %>
            <%out.println("<h2> Contraseña: " + contraseña + " </h2>"); %>
            <%out.println("<h2> Fecha de Nacimeinto: " + fechadenacimiento + " </h2>"); %>
 
    </body>
</html>
