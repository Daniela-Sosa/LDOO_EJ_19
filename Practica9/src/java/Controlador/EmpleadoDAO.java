package Controlador;

import Modelo.EmpleadoDOO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpleadoDAO {
    Connection conexion;

    public void abrirConexion() throws SQLException {
        String dbURI = "jdbc:derby://localhost:1527/empleado";
        String username = "daniela";
        String password = "1234";

        conexion = DriverManager.getConnection(dbURI, username, password);

    }

    public void cerrarConexion() throws SQLException {
        conexion.close();
    }
    
    public void insertar(EmpleadoDOO e) {
        try {
            abrirConexion();
            String sql = "INSERT INTO EMPLEADO(NOMBRE,USUARIO,CONTRASENA,TIPO) VALUES ('"+e.getNombre()+"','"+e.getUsuario()+"','"+e.getContrasena()+"','"+e.getTipo()+"')";
            Statement stmt = conexion.createStatement();
            stmt.executeUpdate(sql);
            cerrarConexion();
        } 
        catch (SQLException sqle) {
            System.out.println(sqle);
        }
    }
    
    public boolean existeUsuario(EmpleadoDOO e){
        ResultSet rs;
        boolean bo = false;
        try {
            abrirConexion();
            String sql;
            sql= "SELECT * FROM EMPLEADO WHERE NOMBRE = '"+e.getNombre()+"' AND USUARIO ='"+e.getUsuario()+"' AND CONTRASENA = '"+e.getContrasena()+"' AND TIPO = '"+e.getTipo()+"'";
            Statement stmt = conexion.createStatement();
            rs = stmt.executeQuery(sql);
            bo = rs.next();
            cerrarConexion();
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return bo;
    }
    
    public void eliminarEmpleado(EmpleadoDOO e){
        try{
            abrirConexion();
            String sql= "DELETE FROM EMPLEADO WHERE USUARIO = '"+ e.getUsuario()+"' AND CONTRASENA ='"+e.getContrasena()+"'";
            Statement stmt = conexion.createStatement();
            stmt.executeUpdate(sql);
            cerrarConexion();
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
    }
}