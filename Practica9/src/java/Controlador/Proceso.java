package Controlador;

import Modelo.EmpleadoDOO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Proceso extends HttpServlet {


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
            EmpleadoDOO edoo;
            edoo = new EmpleadoDOO (nombre, usuario, contrasena, tipo);
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

                    case "eliminar":
                        if(edao.existeUsuario(edoo)){
                        edao.eliminarEmpleado(edoo);
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Eliminar</title>");
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1>Empleado Eliminado Exitosamente!</h1>");
                        out.println("<a href='index.jsp'>Volver al Inicio</a>");
                        out.println("</body>");
                        out.println("</html>");
                        }
                        else{          
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Eliminar</title>");
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1>No Existe el Usuario!</h1>");
                        out.println("<a href='index.jsp'>Volver al Inicio</a>");
                        out.println("</body>");
                        out.println("</html>");
                        }
                        break;
                }
            }
            /*
            if(nombre==edoo.getNombre()){
                if(usuario==edoo.getUsuario()){
                    if(contrasena==edoo.getContrasena()){
                        if(tipo==edoo.getTipo()){
                            switch (accion){
                                case "registrar":
                                    //response.sendRedirect("ListaMedicamentos.jsp");
                                    out.println("<html>");
                                    out.println("<head>");
                                    out.println("<title>Éxito!</title>");
                                    out.println("</head>");
                                    out.println("<body>");
                                    out.println("<h1>Usuario registrado exitosamente</h1>");
                                    out.println("</body>");
                                    out.println("</html>");
                                    break;


                                case "eliminar":
                                    edao.eliminarEmpleado(edoo);
                                    out.println("<html>");
                                    out.println("<head>");
                                    out.println("<title>Éxito!</title>");
                                    out.println("</head>");
                                    out.println("<body>");
                                    out.println("<h1>Usuario eliminado exitosamente</h1>");
                                    out.println("</body>");
                                    out.println("</html>");

                                default:
                                    response.sendRedirect("ERROR.jsp");
                            }
                        }
                        else{
                            response.sendRedirect("error1.jsp");
                        }
                    }
                    else{
                        response.sendRedirect("error2.jsp");
                    }
                }
                else{
                    response.sendRedirect("error3.jsp");
                }
            }
            */
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
