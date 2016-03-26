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
@WebServlet(name = "PlanPago", urlPatterns = {"/PlanPago"})
public class PlanPago extends HttpServlet {
    
    private int k_idconsig;
    private String f_pago;
    private double v_capital;
    private double v_intereses;
    private int q_cuo_pagada;
    private String n_tp_pago;
    private int credito_k_idCredito;
    
    public PlanPago(){
        
    }

    public int getK_idconsig() {
        return k_idconsig;
    }

    public void setK_idconsig(int k_idconsig) {
        this.k_idconsig = k_idconsig;
    }

    public String getF_pago() {
        return f_pago;
    }

    public void setF_pago(String f_pago) {
        this.f_pago = f_pago;
    }

    public double getV_capital() {
        return v_capital;
    }

    public void setV_capital(double v_capital) {
        this.v_capital = v_capital;
    }

    public double getV_intereses() {
        return v_intereses;
    }

    public void setV_intereses(double v_intereses) {
        this.v_intereses = v_intereses;
    }

    public int getQ_cuo_pagada() {
        return q_cuo_pagada;
    }

    public void setQ_cuo_pagada(int q_cuo_pagada) {
        this.q_cuo_pagada = q_cuo_pagada;
    }

    public String getN_tp_pago() {
        return n_tp_pago;
    }

    public void setN_tp_pago(String n_tp_pago) {
        this.n_tp_pago = n_tp_pago;
    }

    public int getCredito_k_idCredito() {
        return credito_k_idCredito;
    }

    public void setCredito_k_idCredito(int credito_k_idCredito) {
        this.credito_k_idCredito = credito_k_idCredito;
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
            out.println("<title>Servlet PlanPago</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PlanPago at " + request.getContextPath() + "</h1>");
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
