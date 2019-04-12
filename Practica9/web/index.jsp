<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="UTF-8">
      <LINK rel=StyleSheet href="css_index.css" type="text/css"> 
      <title>Práctica 9</title>
   </head>
   <body background="imagenes/ima.jpg">
   <center>
       <h1>Empleados</h1>
       <form action="Proceso" method="POST">
            <table>
                <tr>
                    <td>
                        <p>Nombre</p>
                    </td>
                    <td>
                        <input type="text" name="nombre"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Usuario</p>
                    </td>
                    <td>
                        <input type="text" name="usuario"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Contraseña</p>
                    </td>
                    <td>
                        <input type="password" name="contrasena"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Tipo de Empleado</p>
                    </td>
                    <td>
                        <select name="tipo">
                          <option value="administrador">Administrador</option>
                          <option value="normal">De Planta</option>
                          <option value="invitado">Invitado</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Acción a realizar</p>
                    </td>
                    <td>
                        <select name="accion">
                            <option value="registrar">Registrar Empleado</option>
                            <option value="eliminar">Eliminar Empleado</option>
                        </select>
                    </td>
                </tr>
            </table>
           <table>
               <tr>
                   <td>
                       <input type="submit" name="enviar" value="Enviar">
                   </td>
               </tr>
           </table>
       </form>
   </center>
   </body>
</html>