/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

    public void agregarSocio(Socio socio) throws SQLException, RHException {
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
            throw new RHException("EmpleadoDAO", "No pudo crear el empleado" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

    }

}
