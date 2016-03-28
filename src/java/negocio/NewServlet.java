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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.RHException;

/**
 *
 * @author David Morales
 */
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private Administrador admin;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            String cedula = request.getParameter("cedula").toUpperCase();
            String nombre = request.getParameter("nombre").toUpperCase();
            String apellido = request.getParameter("apellidos").toUpperCase();
            String ocupacion = request.getParameter("ocupacion").toUpperCase();
            String tarjeta = request.getParameter("tarjeta").toUpperCase();
            String estadoCivil = request.getParameter("ecivil").toUpperCase();
            String sexo = request.getParameter("sexo").toUpperCase();
            String dirDomic = request.getParameter("dirDomic").toUpperCase();
            String dirJob = request.getParameter("dirJob").toUpperCase();
            String correo = request.getParameter("correo").toUpperCase();
            String telDomic = request.getParameter("telDomic").toUpperCase();
            String telJob = request.getParameter("telJob").toUpperCase();
            admin.agregarSocio(Integer.parseInt(cedula), nombre, apellido, ocupacion, tarjeta, estadoCivil, sexo, dirDomic, dirJob, correo, telDomic, telJob);
            response.sendRedirect("../consultaSocio.jsp");
             out.println("<html>");
            out.println("<head><title>Enviar parametros a un Servlet</title></head>");
            out.println("<body>");
            out.println("<h1>Enviar parametros a un Servlet</h1>");
            out.println("La primera palabra pasada como parámetro es <cedula>" + cedula + "</strong><br>");
            out.println("La segunda palabra pasada como parámetro es <nombre>" + nombre + "</strong>");
            out.println("y demas");
            out.println("</body></html>");
        } catch (RHException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
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
