package MODELO;

public class UsuarioAD {
  private String nombre;
  private String usuario;
  private String contrasena;
  private String tipo;

  public UsuarioAD(String nombre, String usuario, String contrasena, String tipo){
    this.nombre=nombre;
    this.usuario=usuario;
    this.contrasena=contrasena;
    this.tipo=tipo;
}
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getContrasena() {
        return contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
