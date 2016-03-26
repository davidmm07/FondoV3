/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.SocioDAO;
import util.RHException;

/**
 *
 * @author ASUS
 */
public class Administrador {
    private SocioDAO socioDAO;
    private Socio socio;
    
    public Administrador()
    {
    socioDAO = new SocioDAO();
    }
    
     /**
     * Invoca el m�todo del DAO que permite incluir un nuevo socio
     * @param id
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
    public void agregarSocio(int id, String nombre, String apellido, String ocupacion, String tarjetaPro, String estadoCivil, String sexo, String dirDomicilio, String dirTrabajo, String email, String telDomicilio, String telTrabajo) throws RHException{
        socio = new Socio();
        socio.setK_idSocio(id);
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
}