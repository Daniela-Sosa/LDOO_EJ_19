package CONTROLADOR;
import FACTORY.factory;
import MODELO.UsuarioAD;
import MODELO.UsuarioINV;
import MODELO.UsuarioPLN;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Proceso extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            String nombre = request.getParameter("nombre");
            String usuario = request.getParameter("usuario");
            String contrasena = request.getParameter("contrasena");
            String tipo = request.getParameter("tipo");
            String accion = request.getParameter("accion");
            EmpleadoDAO edao = new EmpleadoDAO();
            
            factory mifactory = new factory();
            
            UsuarioAD edoo;
            edoo = new UsuarioAD (nombre, usuario, contrasena, tipo);
            if(nombre.equals("")||usuario.equals("")||contrasena.equals("")){
                response.sendRedirect("ERROR.jsp");
            }
            else{
                switch(accion){
                    case "registrar":
                        if(edao.existeUsuario(edoo)){
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Registrar</title>");
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1>El usuario ya se encuentra registrado</h1>");
                        out.println("<a href='index.jsp'>Volver al Inicio</a>");
                        out.println("</body>");
                        out.println("</html>");
                        }
                        else{
                        edao.insertar(edoo);
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Registrar</title>");
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1>El usuario se ha registrado exitosamentente.</h1>");
                        out.println("<a href='index.jsp'>Volver al Inicio</a>");
                        out.println("</body>");
                        out.println("</html>");
                        }
                        break;
                        
                               }
            }
                     
                       
                    UsuarioINV inv;    
                    inv = new UsuarioINV (nombre, usuario, contrasena, tipo);
                    if(nombre.equals("")||usuario.equals("")||contrasena.equals("")){
                    response.sendRedirect("ERROR.jsp");
                         }  
                    
                else{
                switch(accion){
                    case "registrar":
                        if(edao.existeUsuario(inv)){
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Registrar</title>");
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1>El usuario ya se encuentra registrado</h1>");
                        out.println("<a href='index.jsp'>Volver al Inicio</a>");
                        out.println("</body>");
                        out.println("</html>");
                        }
                        else{
                        edao.insertar(inv);
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Registrar</title>");
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1>El usuario se ha registrado exitosamentente.</h1>");
                        out.println("<a href='index.jsp'>Volver al Inicio</a>");
                        out.println("</body>");
                        out.println("</html>");
                        }
                        break;
                }
            }
            
             UsuarioPLN pln = null;    
                    pln = new UsuarioPLN (nombre, usuario, contrasena, tipo);
                    if(nombre.equals("")||usuario.equals("")||contrasena.equals("")){
                    response.sendRedirect("ERROR.jsp");
                         }  
                    
                else{
                switch(accion){
                    case "registrar":
                        if(edao.existeUsuario(pln)){
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Registrar</title>");
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1>El usuario ya se encuentra registrado</h1>");
                        out.println("<a href='index.jsp'>Volver al Inicio</a>");
                        out.println("</body>");
                        out.println("</html>");
                        }
                        else{
                        edao.insertar(pln);
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Registrar</title>");
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1>El usuario se ha registrado exitosamentente.</h1>");
                        out.println("<a href='index.jsp'>Volver al Inicio</a>");
                        out.println("</body>");
                        out.println("</html>");
                        }
                        break;
                }
            }      
                    
     
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
