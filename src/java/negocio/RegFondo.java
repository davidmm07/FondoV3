/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cristian
 */
@WebServlet(name = "RegFondo", urlPatterns = {"/RegFondo"})
public class RegFondo extends HttpServlet {

    
    private int k_registro;
    private double v_rendNetos;
    private String f_rendNetos;
    private String n_proceso;
    private int cuenta_fondo_k_cta_fondo;
    
    public RegFondo(){
        
    }

    public int getK_registro() {
        return k_registro;
    }

    public void setK_registro(int k_registro) {
        this.k_registro = k_registro;
    }

    public double getV_rendNetos() {
        return v_rendNetos;
    }

    public void setV_rendNetos(double v_rendNetos) {
        this.v_rendNetos = v_rendNetos;
    }

    public String getF_rendNetos() {
        return f_rendNetos;
    }

    public void setF_rendNetos(String f_rendNetos) {
        this.f_rendNetos = f_rendNetos;
    }

    public String getN_proceso() {
        return n_proceso;
    }

    public void setN_proceso(String n_proceso) {
        this.n_proceso = n_proceso;
    }

    public int getCuenta_fondo_k_cta_fondo() {
        return cuenta_fondo_k_cta_fondo;
    }

    public void setCuenta_fondo_k_cta_fondo(int cuenta_fondo_k_cta_fondo) {
        this.cuenta_fondo_k_cta_fondo = cuenta_fondo_k_cta_fondo;
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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegFondo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegFondo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
