/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import negocio.Socio;
import util.RHException;
import util.ServiceLocator;

/**
 *
 * @author David Morales
 */
public class SocioDAO {

    public SocioDAO() {

    }

    public void agregarSocio(Socio socio) throws  RHException {
        try {
            String strSQL = "INSERT INTO SOCIO(K_IDSOCIO,N_NOMSOCIO,N_APESOCIO,O_OCUPACION,N_TARJPROFESIONAL,O_ECIVIL,I_SEXO,"
                    + "O_DIR_DOMIC,O_DIR_TRAB,O_EMAIL,O_TEL_DOMIC,O_TEL_TRAB,F_INGRESO,N_ESTADO_CK) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,"
                    + "TO_DATE(SYSDATE,'DD/MM/YY'),'PENDIENTE')";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, socio.getK_idSocio());
            prepStmt.setString(2, socio.getN_nomSocio());
            prepStmt.setString(3, socio.getN_apeSocio());
            prepStmt.setString(4, socio.getO_ocupacion());
            prepStmt.setString(5, socio.getN_tarjProfesional());
            prepStmt.setString(6, socio.getO_eCivil());
            prepStmt.setString(7, socio.getI_sexo());
            prepStmt.setString(8, socio.getO_dir_domic());
            prepStmt.setString(9, socio.getO_dir_trab());
            prepStmt.setString(10, socio.getO_email());
            prepStmt.setString(11, socio.getO_tel_domic());
            prepStmt.setString(12, socio.getO_tel_domic());
            prepStmt.setString(13, socio.getO_tel_trab());
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();

        } catch (SQLException e) {
            throw new RHException("EmpleadoDAO", "No pudo agregar el socio" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

    }

    public void buscarSocio(int k_idSocio) {
        try {
            Socio s = new Socio();
            String strSQL = "SELECT K_IDSOCIO,N_NOMSOCIO,N_APESOCIO,N_TARJPROFESIONAL,"
                    + "O_EMAIL,F_INGRESO FROM SOCIO WHERE K_IDSOCIO = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, k_idSocio);
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()) {
                s.setK_idSocio(rs.getInt(1));
                s.setN_nomSocio(rs.getString(2));
                rs.getString(3);
                rs.getString(4);
                rs.getString(5);
                rs.getDate(6);
            }
        }catch(SQLException e){
            
        }
    }
    
    public void buscarSocio(String n_nomsocio){
        try{
            Socio s = new Socio();
            String strSQL = "SELECT K_IDSOCIO,N_NOMSOCIO,N_APESOCIO,N_TARJPROFESIONAL,"
                    + "O_EMAIL,F_INGRESO FROM SOCIO WHERE N_NOMSOCIO = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, n_nomsocio);
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()) {
                s.setK_idSocio(rs.getInt(1));
                s.setN_nomSocio(rs.getString(2));
                rs.getString(3);
                rs.getString(4);
                rs.getString(5);
                rs.getDate(6);
            }
        }catch(SQLException e){
            
        }
    }
    
    public void cambiarEstadoSocio(Socio socio) throws RHException{
        try{
            String strSQL = "UPDATE SOCIO SET N_ESTADO_CK = ? WHERE K_IDSOCIO = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, socio.getN_estado_ck());
            prepStmt.setInt(2, socio.getK_idSocio());
            prepStmt.executeQuery();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
            if(socio.getN_estado_ck().equals("INACTIVO")){
                desactivarSocio(socio);
            }
        }catch(SQLException e){
            throw new RHException("SocioDAO", "No se pudo cambiar estado del socio" + e.getMessage());
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public void desactivarSocio(Socio socio) throws RHException{
        try{
            String strSQL = "UPDATE SOCIO SET F_RETIRO = TO_DATE(SYSDATE,'DD/MM/YY'), O_CAUS_RETIRO=? WHERE K_IDSOCIO=?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, socio.getO_caus_retiro());
            prepStmt.setInt(2, socio.getK_idSocio());
            prepStmt.executeQuery();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
        }catch(SQLException e){
            throw new RHException("SocioDAO", "No se desactivó el socio" + e.getMessage());
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }
}
