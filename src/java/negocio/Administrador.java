/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.SocioDAO;
import datos.CreditoDAO;
import datos.CuentaDAO;
import util.RHException;

/**
 *
 * @author ASUS
 */
public class Administrador {
    private SocioDAO socioDAO;
    private CuentaDAO cuentaDAO;
    private CreditoDAO creditoDAO;
    private Socio socio;
    private Cuenta cuenta;
    private Credito credito;
    
    
    public Administrador()
    {
    socioDAO = new SocioDAO();
    creditoDAO = new CreditoDAO();
    cuentaDAO = new CuentaDAO();
    }
    
     /**
     * Invoca el m�todo del DAO que permite incluir un nuevo socio
     * @param idSocio
     * @param nombre
     * @param apellido
     * @param ocupacion
     * @param tarjetaPro
     * @param estadoCivil
     * @param sexo
     * @param dirDomicilio
     * @param dirTrabajo
     * @param email
     * @param telDomicilio
     * @param telTrabajo
     */
    public void agregarSocio(int idSocio, String nombre, String apellido, String ocupacion, String tarjetaPro, String estadoCivil, String sexo, String dirDomicilio, String dirTrabajo, String email, String telDomicilio, String telTrabajo) throws RHException{
        socio = new Socio();
        socio.setK_idSocio(idSocio);
        socio.setN_nomSocio(nombre);
        socio.setN_apeSocio(apellido);
        socio.setO_ocupacion(ocupacion);
        socio.setN_tarjProfesional(tarjetaPro);
        socio.setO_eCivil(estadoCivil);
        socio.setO_dir_domic(dirDomicilio);
        socio.setO_dir_trab(dirTrabajo);
        socio.setO_email(email);
        socio.setO_tel_domic(telDomicilio);
        socio.setO_tel_trab(telTrabajo);
        socioDAO.agregarSocio(socio);
    }
    
    public void buscarSocioPorID(int id){
        socio = new Socio();
        socio.setK_idSocio(id);
        socio.getN_nomSocio();
        socio.getN_apeSocio();
        socio.getN_tarjProfesional();
        socio.getO_email();
        socio.getF_ingreso();
        socioDAO.buscarSocioPorID(id);        
    }
    
    public void buscarSocioPorNombre(String nombre){
        socio = new Socio();
        socio.setN_nomSocio(nombre);
        socio.getK_idSocio();
        socio.getN_apeSocio();
        socio.getN_tarjProfesional();
        socio.getO_email();
        socio.getF_ingreso();
        socioDAO.buscarSocioPorNombre(nombre);        
    }
    
    public void setSocio(Socio socio){
        this.socio = socio;
    }
    
    public Socio getSocio(){
        return new Socio();
    }

    /*
    Gestión Cuenta
    */    
    public void agregarCuenta(int idCuenta, double saldoCuenta, int idSocio, int seqCuenta) throws RHException{
        cuenta = new Cuenta();
        cuenta.setK_idCuenta(idCuenta);
        cuenta.setV_saldo(saldoCuenta);
        cuenta.setSocio_k_idSocio(idSocio);
        cuenta.setCuenta_seq(seqCuenta);
        cuentaDAO.agregarCuenta(cuenta);
    }
    
    public void buscarCuenta(int idSocio){
        cuenta = new Cuenta();
        cuenta.setSocio_k_idSocio(idSocio);
        cuenta.getK_idCuenta();
        cuenta.getV_saldo();
        cuentaDAO.buscarCuenta(idSocio);
    }
    
    public void modificarSaldo(double saldoCuenta, int idCuenta) throws RHException{
        cuenta = new Cuenta();
        cuenta.setV_saldo(saldoCuenta);
        cuenta.setK_idCuenta(idCuenta);
        cuentaDAO.modificarSaldo(cuenta);
    }
    
    public void setCuenta(Cuenta cuenta){
        this.cuenta = cuenta;
    }
    
    public Cuenta getCuenta(){
        return new Cuenta();
    }
    
    /*
    Gestión Crédito
    */    
    /**
     *
     * @param idCredito
     * @param tasaInt
     * @param plazo
     * @param fechaAprob
     * @param fechaDesem
     * @param valPrestado
     * @param saldoPendiente
     * @param estadoCred
     * @param modCred
     * @param idSocio
     * @param idCuenta
     * @throws util.RHException
     */
    //Revisar tipo setDate recibe sólo el día del mes en CreditoDAO 
    public void agregarCredito(float tasaInt, String plazo, String fechaAprob, float valPrestado, float saldoPendiente, String estadoCred, String modCred, int idSocio, int idCuenta) throws RHException{
        credito = new Credito();
        credito.setP_tasaInteres(tasaInt);
        credito.setF_plazo(plazo);
        credito.setF_aprobacion(fechaAprob);
        credito.setV_prestado(valPrestado);
        credito.setSdo_pendiente(saldoPendiente);
        credito.setN_e_credito_ck(estadoCred);
        credito.setN_modcredito_ck(modCred);
        credito.setSocio_k_id_socio(idSocio);
        credito.setCuenta_k_idCuenta(idCuenta);
        creditoDAO.agregarCredito(credito);
    }
    
    public void buscarCredito(int idSocio){
        credito = new Credito();
        credito.setSocio_k_id_socio(idSocio);
        credito.getP_tasaInteres();
        credito.getF_plazo();
        credito.getV_prestado();
        credito.getSdo_pendiente();
        credito.getN_e_credito_ck();
        creditoDAO.buscarCredito(idSocio);
    }
    
    public void cambiarEstadoCredito(String estadoCred, int idCredito) throws RHException{
        credito = new Credito();
        credito.setN_e_credito_ck(estadoCred);
        credito.setK_idcredito(idCredito);
        creditoDAO.cambiarEstadoCredito(credito);
    }
    
    public double consultarSaldoCredito(int idSocio){
        credito = new Credito();
        credito.setSocio_k_id_socio(idSocio);
        credito.getSdo_pendiente();
        return creditoDAO.consultarSaldoCredito(idSocio);
    }
    
    public void cancelarCredito(int idSocio) throws RHException{
        credito = new Credito();
        credito.setSocio_k_id_socio(idSocio);
        credito.getF_ultpago();
        credito.getV_ultpago();
        credito.setN_e_credito_ck("Cancelado");
        creditoDAO.cancelarCredito(credito, idSocio);
    }
    
     public void setCredito(Credito credito){
        this.credito = credito;
    }
    
    public Credito getCredito(){
        return new Credito();
    }
}