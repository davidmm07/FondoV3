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
 * @author Cristian
 */
@WebServlet(name = "Credito", urlPatterns = {"/Credito"})
public class Credito extends HttpServlet {

    
    
    private int k_idcredito;
    private float p_tasaInteres;
    private String f_plazo;
    private String f_aprobacion;
    private String f_desembolso;
    private double v_prestado;
    private double sdo_pend;
    private String f_ultpago;
    private double v_ultpago;
    private String n_e_credito_ck;
    private String n_modcredito_ck;
    private int socio_k_id_socio;
    private int cuenta_k_idCuenta;
    private Administrador admin;
    public Credito(){
        admin= new Administrador();
    }
    
    public int getK_idcredito() {
        return k_idcredito;
    }

    public void setK_idcredito(int k_idcredito) {
        this.k_idcredito = k_idcredito;
    }

    public float getP_tasaInteres() {
        return p_tasaInteres;
    }

    public void setP_tasaInteres(float p_tasaInteres) {
        this.p_tasaInteres = p_tasaInteres;
    }

    public String getF_plazo() {
        return f_plazo;
    }

    public void setF_plazo(String f_plazo) {
        this.f_plazo = f_plazo;
    }

    public String getF_aprobacion() {
        return f_aprobacion;
    }

    public void setF_aprobacion(String f_aprobacion) {
        this.f_aprobacion = f_aprobacion;
    }

    public String getF_desembolso() {
        return f_desembolso;
    }

    public void setF_desembolso(String f_desembolso) {
        this.f_desembolso = f_desembolso;
    }

    public double getV_prestado() {
        return v_prestado;
    }

    public void setV_prestado(double v_prestado) {
        this.v_prestado = v_prestado;
    }

    public double getSdo_pendiente() {
        return sdo_pend;
    }

    public void setSdo_pendiente(double sdo_pendiente) {
        this.sdo_pend = sdo_pendiente;
    }

    public String getF_ultpago() {
        return f_ultpago;
    }

    public void setF_ultpago(String f_ultpago) {
        this.f_ultpago = f_ultpago;
    }

    public double getV_ultpago() {
        return v_ultpago;
    }

    public void setV_ultpago(double v_ultpago) {
        this.v_ultpago = v_ultpago;
    }

    public String getN_e_credito_ck() {
        return n_e_credito_ck;
    }

    public void setN_e_credito_ck(String n_e_credito_ck) {
        this.n_e_credito_ck = n_e_credito_ck;
    }

    public String getN_modcredito_ck() {
        return n_modcredito_ck;
    }

    public void setN_modcredito_ck(String n_modcredito_ck) {
        this.n_modcredito_ck = n_modcredito_ck;
    }

    public int getSocio_k_id_socio() {
        return socio_k_id_socio;
    }

    public void setSocio_k_id_socio(int socio_k_id_socio) {
        this.socio_k_id_socio = socio_k_id_socio;
    }

    public int getCuenta_k_idCuenta() {
        return cuenta_k_idCuenta;
    }

    public void setCuenta_k_idCuenta(int cuenta_k_idCuenta) {
        this.cuenta_k_idCuenta = cuenta_k_idCuenta;
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
            out.println("<title>Servlet Credito</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Credito at " + request.getContextPath() + "</h1>");
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
            
            String tsinteres= request.getParameter("tsinteres");
            String vprestado= request.getParameter("vprestado");
            String mCredito= request.getParameter("mCredito");
            String cedula= request.getParameter("cedula");
            String cuenta= request.getParameter("cuenta");
            
            /* String cedula1 = "1073696058";
            String nombre1 = "David";
            String apellido1= "Morales";
            String ocupacion1 = "Ingeniero de sistemas";
            String tarjeta1 = "ADDMDDDD";
            String estadoCivil1 = "Soltero";
            String sexo1 = "M";
            String dirDomic1 = "Cll 5a a23";
            String dirJob1 = "Cr 42 a 12";
            String correo1 = "daamoralesm@gmail.com";
            String telDomic1 ="261267";
            String telJob1 = "3057063765";*/

            admin.agregarCredito(Float.parseFloat(tsinteres), Double.parseDouble(vprestado), mCredito, Integer.parseInt(cedula), Integer.parseInt(cuenta));
            //admin.agregarSocio(Integer.parseInt(cedula1), nombre1, apellido1, ocupacion1, tarjeta1, estadoCivil1, sexo1, dirDomic1, dirJob1, correo1, telDomic1, telJob1);
        
        response.sendRedirect("presentacion/consultaCredito.jsp");
        out.println("<html>");
        out.println("<head><title>Enviar parametros a un Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Enviar parametros a un Servlet</h1>");
        out.println("La primera palabra pasada como parámetro es <cedula>" + cedula + "</strong><br>");
        //out.println("La segunda palabra pasada como parámetro es <nombre>" + nombre + "</strong>");
        out.println("y demas");
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
