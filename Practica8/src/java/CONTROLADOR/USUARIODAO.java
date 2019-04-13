package CONTROLADOR;

import MODELO.USUARIO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class USUARIODAO {
    Connection conexion;

    public void abrirConexion() throws SQLException {
        String dbURI = "jdbc:derby://localhost:1527/login";
        String username = "daniela";
        String password = "1234";

        conexion = DriverManager.getConnection(dbURI, username, password);

    }

    public void cerrarConexion() throws SQLException {
        conexion.close();
    }
    
    public void insertar(USUARIO u) {
        try {
            abrirConexion();
            String sql = "INSERT INTO LOGIN(USUARIO,CONTRASENA) VALUES ('"+u.getUsuario()+"','"+u.getContrasena()+"')";
            Statement stmt = conexion.createStatement();
            stmt.executeUpdate(sql);
            cerrarConexion();
        } 
        catch (SQLException sqle) {
            System.out.println(sqle);
        }
    }
    
    public boolean existeUsuario(USUARIO u){
        ResultSet rs;
        boolean bo = false;
        try {
            abrirConexion();
            String sql;
            sql= "SELECT * FROM LOGIN WHERE USUARIO = '"+u.getUsuario()+"' AND CONTRASENA ='"+u.getContrasena()+"'";
            Statement stmt = conexion.createStatement();
            rs = stmt.executeQuery(sql);
            bo = rs.next();
            cerrarConexion();
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return bo;
    }
}