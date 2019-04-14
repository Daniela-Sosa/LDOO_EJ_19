<%@page import="MODELO.UsuarioPLN"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        HttpSession sesion = request.getSession();
        String usuario,contrasena;
        usuario = sesion.getAttribute("username").toString();
        contrasena = sesion.getAttribute("password").toString();
        UsuarioPLN pln = new UsuarioPLN (usuario,contrasena);
%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <LINK rel=StyleSheet href="css_BIENVENIDO.css" type="text/css">
        <title>BIENVENIDO</title>
        <script>
            
        </script>
    </head>
    <body background="imagenes/bienvenido.jpg">
    <center>
        <h1>Bienvenido, <%=pln.getUsuario()%>!</h1>
        <p> Tu contraseña es: <%= pln.getContrasena()%> </p>
        <form action="cerrarSesion.jsp">
            <input type="submit" name="CERRAR SESIÓN" value="CERRAR SESIÓN"/>
        </form>
        <br>

        
        
    </center>
    </body>
</html>
