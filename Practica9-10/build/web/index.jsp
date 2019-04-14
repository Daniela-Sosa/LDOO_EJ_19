<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="UTF-8">
      <LINK rel=StyleSheet href="css_index.css" type="text/css"> 
      <title>LOGIN</title>
   </head>
   <body background="imagenes/ima.jpg">
   <center>
       <h1>Inicio de Sesión</h1>
       <form action="PROCESO" method="POST">
 
           <table>
                <tr>
                    <td>
                        <p>Usuario: </p>
                    </td>
                    <td>
                        <input type="text" name="usuario"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Contraseña: </p>
                    </td>
                    <td>
                        <input type="password" name="contrasena"/>
                    </td>
                    
                </tr>

                <tr>
                    <td>
                <h2>Tipo de Usuario</h2>
                    </td>
                    
        <tr>            
        <td>           
        <p>Administrador: </p>
       
                  <td>
                       <a href="registro admi.html">Registrar</a>
                  </td>          
        </td>          
        </tr>  
        
        <tr>
        <td> 
        <p>Invitado: </p>
       
                  <td>
                       <a href="registro invitado.html">Registrar</a>
                  </td>
        </td>
        </tr>
        
        <tr>
        <td> 
        <p>Planta: </p>
        
                  <td>
                       <a href="registro planta.html">Registrar</a>
                  </td>
        </td>         
        </tr>
        
        <br>
        <br>
        
           <table>
            <br>  
            
               <tr>
                   <td>
                       <input type="submit" name="ENTRAR" value="LOG IN"/>
                   </td>
               </tr>
               
           </table>
                    
       </form>
   </center>
   </body>
</html>