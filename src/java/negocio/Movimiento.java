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
import util.RHException;

/**
 *
 * @author David Morales
 */
@WebServlet(name = "Movimiento", urlPatterns = {"/Movimiento"})
public class Movimiento extends HttpServlet {
    
    private int k_idMov;
    private String n_tipo;
    private String f_registro;
    private int v_mov; 
    private String n_medPago;
    private int cuenta_k_idCuenta;
    private int cuenta_fondo_k_cta_fondo;
    private Administrador admin;
    public Movimiento(){
        admin= new Administrador();
    }

    public int getK_idMov() {
        return k_idMov;
    }

    public void setK_idMov(int k_idMov) {
        this.k_idMov = k_idMov;
    }

    public String getN_tipo() {
        return n_tipo;
    }

    public void setN_tipo(String n_tipo) {
        this.n_tipo = n_tipo;
    }

    public String getF_registro() {
        return f_registro;
    }

    public void setF_registro(String f_registro) {
        this.f_registro = f_registro;
    }

    public int getV_mov() {
        return v_mov;
    }

    public void setV_mov(int v_mov) {
        this.v_mov = v_mov;
    }

    public String getN_medPago() {
        return n_medPago;
    }

    public void setN_medPago(String n_medPago) {
        this.n_medPago = n_medPago;
    }

    public int getCuenta_k_idCuenta() {
        return cuenta_k_idCuenta;
    }

    public void setCuenta_k_idCuenta(int cuenta_k_idCuenta) {
        this.cuenta_k_idCuenta = cuenta_k_idCuenta;
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
            out.println("<title>Servlet Movimiento</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Movimiento at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         try {
            
            String tipoMov = request.getParameter("tipoMov");
            String valor = request.getParameter("valor");
            String medioPago = request.getParameter("medioPago");
            String ctaSocio = request.getParameter("ctaSocio");
            
            
            admin.agregarMovimiento(tipoMov, Integer.parseInt(valor), medioPago, Integer.parseInt(ctaSocio));
            //admin.agregarSocio(Integer.parseInt(cedula1), nombre1, apellido1, ocupacion1, tarjeta1, estadoCivil1, sexo1, dirDomic1, dirJob1, correo1, telDomic1, telJob1);
        
        response.sendRedirect("presentacion/consultaSocio.jsp");
        out.println("<html>");
        out.println("<head><title>Enviar parametros a un Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Enviar parametros a un Servlet</h1>");
       
        out.println("</body></html>");

    }
    catch (RHException ex) {
    }
    finally {            
            out.close();
        }    
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
