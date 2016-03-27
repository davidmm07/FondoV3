/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.CreditoDAO;
import datos.CuentaDAO;
import datos.PlanPagoDAO;
import datos.SocioDAO;
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
@WebServlet(name = "GestionFondo", urlPatterns = {"/GestionFondo"})
public class GestionFondo extends HttpServlet {
    
    private Socio socio;
    private SocioDAO socioDAO;
    private Cuenta cuenta;
    private CuentaDAO cuentaDAO;
    private Credito credito;
    private CreditoDAO creditoDAO;
    private PlanPago planPago;
    private PlanPagoDAO planPagoDAO;
    
    public void incluirSocio(int k_idSocio, String nombre, String apellido, String ocupacion,String nTarjetaProf,String eCivil, String sexo,String dirDom, String dirTrab,String email, String telDomic, String telTrab, String fIngreso, String estado) throws RHException{
        socio = new Socio();
        socio.setK_idSocio(k_idSocio);
        socio.setN_nomSocio(nombre);
        socio.setN_apeSocio(apellido);
        socio.setO_ocupacion(ocupacion);
        socio.setN_tarjProfesional(nTarjetaProf);
        socio.setO_eCivil(eCivil);
        socio.setI_sexo(sexo);
        socio.setO_dir_domic(dirDom);
        socio.setO_dir_trab(dirTrab);
        socio.setO_email(email);
        socio.setO_tel_domic(telDomic);
        socio.setO_tel_trab(telTrab);
        socio.setF_ingreso(fIngreso);
        socio.setN_estado_ck(estado);
        socioDAO.agregarSocio(socio);
    }
    
    public void incluirCuentaSocio(int idCuenta, double saldo, int idSocio) throws RHException{
        cuenta = new Cuenta();
        cuenta.setK_idCuenta(idCuenta);
        cuenta.setV_saldo(saldo);
        cuenta.setSocio_k_idSocio(idSocio);
        cuentaDAO.agregarCuenta(cuenta);
    }
    
    public void incluirCredito(int idCredito,float tasaInteres,String f_plazo,String f_apro,String f_desem, double valorPres,double saldoPend, String estadoCred,String modalidadCred, int idSocio, int idCuenta) throws RHException{
        credito = new Credito();
        credito.setK_idcredito(idCredito);
        credito.setP_tasaInteres(tasaInteres);
        credito.setF_plazo(f_plazo);
        credito.setF_aprobacion(f_apro);
        credito.setF_desembolso(f_desem);
        credito.setV_prestado(valorPres);
        credito.setSdo_pendiente(saldoPend);
        credito.setN_e_credito_ck(estadoCred);
        credito.setN_modcredito_ck(modalidadCred);
        credito.setSocio_k_id_socio(idSocio);
        credito.setCuenta_k_idCuenta(idCuenta);
        creditoDAO.agregarCredito(credito);
    }

    public void incluirPlanPago(int idConsig, double valorCap, double valorInter, int idCredito) throws RHException{
        planPago = new PlanPago();
        planPago.setK_idconsig(idConsig);
        planPago.setV_capital(valorCap);
        planPago.setV_intereses(valorInter);
        planPago.setCredito_k_idCredito(idCredito);
        planPagoDAO.agregarPlanPago(planPago);
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
            out.println("<title>Servlet GestionFondo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GestionFondo at " + request.getContextPath() + "</h1>");
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
