/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.RHException;

/**
 *
 * @author David Morales
 */
@WebServlet(name = "Fondo", urlPatterns = {"/Fondo"})
public class Fondo extends HttpServlet {

    private int k_idfondo;
    private double v_capital_tot;
    private double v_capital_disp;
    private Administrador admin;
    

    public Fondo() {
    admin= new Administrador();
    }

    public int getK_idfondo() {
        return k_idfondo;
    }

    public void setK_idfondo(int k_idfondo) {
        this.k_idfondo = k_idfondo;
    }

    public double getV_capital_tot() {
        return v_capital_tot;
    }

    public void setV_capital_tot(double v_capital_tot) {
        this.v_capital_tot = v_capital_tot;
    }

    public double getV_capital_disp() {
        return v_capital_disp;
    }

    public void setV_capital_disp(double v_capital_disp) {
        this.v_capital_disp = v_capital_disp;
    }

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
        PrintWriter out = response.getWriter();
        try {

        } finally {
            out.close();
        }
    }

    public void registrarSocio(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            
            String cedula = request.getParameter("cedula");
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellidos");
            String ocupacion = request.getParameter("ocupacion");
            String tarjeta = request.getParameter("tarjeta");
            String estadoCivil = request.getParameter("ecivil");
            String sexo = request.getParameter("sexo");
            String dirDomic = request.getParameter("dirDomic");
            String dirJob = request.getParameter("dirJob");
            String correo = request.getParameter("correo");
            String telDomic = request.getParameter("telDomic");
            String telJob = request.getParameter("telJob");
            

            admin.agregarSocio(Integer.parseInt(cedula), nombre, apellido, ocupacion, tarjeta, estadoCivil, sexo, dirDomic, dirJob, correo, telDomic, telJob);
            //admin.agregarSocio(Integer.parseInt(cedula1), nombre1, apellido1, ocupacion1, tarjeta1, estadoCivil1, sexo1, dirDomic1, dirJob1, correo1, telDomic1, telJob1);
        
        response.sendRedirect("presentacion/consultaSocio.jsp");
        out.println("<html>");
        out.println("<head><title>Enviar parametros a un Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Enviar parametros a un Servlet</h1>");
        out.println("La primera palabra pasada como parámetro es <cedula>" + cedula + "</strong><br>");
        out.println("La segunda palabra pasada como parámetro es <nombre>" + nombre + "</strong>");
        out.println("y demas");
        out.println("</body></html>");

    }
    catch (RHException ex) {
    }
    finally {            
            out.close();
        }    
     
    //processRequest(request, response);
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
