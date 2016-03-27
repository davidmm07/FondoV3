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
@WebServlet(name = "CuentaFondo", urlPatterns = {"/CuentaFondo"})
public class CuentaFondo extends HttpServlet {
    
    private  int k_cta_fondo;
    private double v_aportes;
    private double v_interesXCredito;
    private double v_rendFinan;
    private double v_gFinanciero;
    private double v_creditos;
    private int fondo_k_idfondo;
    
    public CuentaFondo(){
        
    }

    public int getK_cta_fondo() {
        return k_cta_fondo;
    }

    public void setK_cta_fondo(int k_cta_fondo) {
        this.k_cta_fondo = k_cta_fondo;
    }

    public double getV_aportes() {
        return v_aportes;
    }

    public void setV_aportes(double v_aportes) {
        this.v_aportes = v_aportes;
    }

    public double getV_interesXCredito() {
        return v_interesXCredito;
    }

    public void setV_interesXCredito(double v_interesXCredito) {
        this.v_interesXCredito = v_interesXCredito;
    }

    public double getV_rendFinan() {
        return v_rendFinan;
    }

    public void setV_rendFinan(double v_rendFinan) {
        this.v_rendFinan = v_rendFinan;
    }

    public double getV_gFinanciero() {
        return v_gFinanciero;
    }

    public void setV_gFinanciero(double v_gFinanciero) {
        this.v_gFinanciero = v_gFinanciero;
    }

    public double getV_creditos() {
        return v_creditos;
    }

    public void setV_creditos(double v_creditos) {
        this.v_creditos = v_creditos;
    }

    public int getFondo_k_idfondo() {
        return fondo_k_idfondo;
    }

    public void setFondo_k_idfondo(int fondo_k_idfondo) {
        this.fondo_k_idfondo = fondo_k_idfondo;
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
            out.println("<title>Servlet CuentaFondo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CuentaFondo at " + request.getContextPath() + "</h1>");
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
