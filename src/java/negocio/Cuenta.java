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
@WebServlet(name = "Cuenta", urlPatterns = {"/Cuenta"})
public class Cuenta extends HttpServlet {
    
    private int k_idCuenta;
    private double v_saldo;
    private int socio_k_idSocio;
    private int cuenta_seq;
    
    public Cuenta(){
        
    }

    public int getK_idCuenta() {
        return k_idCuenta;
    }

    public void setK_idCuenta(int k_idCuenta) {
        this.k_idCuenta = k_idCuenta;
    }

    public double getV_saldo() {
        return v_saldo;
    }

    public void setV_saldo(double v_saldo) {
        this.v_saldo = v_saldo;
    }

    public int getSocio_k_idSocio() {
        return socio_k_idSocio;
    }

    public void setSocio_k_idSocio(int socio_k_idSocio) {
        this.socio_k_idSocio = socio_k_idSocio;
    }
    
    public int getCuenta_seq(){
        return cuenta_seq;
    }
    
    public void setCuenta_seq(int cuenta_seq){
        this.cuenta_seq = cuenta_seq;
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
            out.println("<title>Servlet Cuenta</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Cuenta at " + request.getContextPath() + "</h1>");
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
