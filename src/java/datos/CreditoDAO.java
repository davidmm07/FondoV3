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
import negocio.Credito;
import util.RHException;
import util.ServiceLocator;

/**
 *
 * @author Cristian
 */
public class CreditoDAO {

    private MovimientoDAO movimientoDAO;

    public CreditoDAO() {

    }

    // Aprobación del crédito
    public void agregarCredito(Credito credito, int cuenta_k_idCuenta) throws RHException {
        if (movimientoDAO.calcularTiempoDesdeUltimoAporte(cuenta_k_idCuenta) < 1 && movimientoDAO.calcularTiempoDesdeUltimoAporte(cuenta_k_idCuenta) > 0) {

            try {
                String strSQL = "INSERT INTO CREDITO(K_IDCREDITO,P_TASAINTERES,F_APROBACION,V_PRESTADO,"
                        + "N_E_CREDITO_CK,N_MODCREDITO,SOCIO_K_IDSOCIO,CUENTA_K_IDCUENTA) "
                        + "VALUES (CREDITO_SEQ.NEXTVAL,?,TO_DATE(SYSDATE,'DD/MM/YY'),?,'APROBADO',?,?,?)";
                Connection conexion = ServiceLocator.getInstance().tomarConexion();
                PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
                prepStmt.setFloat(1, credito.getP_tasaInteres());
                prepStmt.setDouble(2, credito.getV_prestado());
                prepStmt.setString(3, credito.getN_modcredito_ck());
                prepStmt.setInt(4, credito.getSocio_k_id_socio());
                prepStmt.setInt(5, credito.getCuenta_k_idCuenta());
                prepStmt.executeUpdate();
                prepStmt.close();
                ServiceLocator.getInstance().commit();
            } catch (SQLException e) {
                throw new RHException("EmpleadoDAO", "No se agregó el crédito" + e.getMessage());
            } finally {
                ServiceLocator.getInstance().liberarConexion();
            }
        }
    }

    public void buscarCredito(int socio_k_idsocio) {
        try {
            Credito c = new Credito();
            String strSQL = "SELECT P_TASAINTERES,F_PLAZO,V_PRESTADO,V_SDOPEND,N_E_CREDITO_CK,SOCIO_K_IDSOCIO FROM CREDITO"
                    + "WHERE SOCIO_K_IDSOCIO = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, socio_k_idsocio);
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()) {
                rs.getFloat(1);
                rs.getDate(2);
                rs.getDouble(3);
                rs.getDouble(4);
                rs.getString(5);
                c.setSocio_k_id_socio(rs.getInt(6));
            }
        } catch (SQLException e) {

        }
    }

    // Desembolso del credito
    public void modificarCredito(Credito credito) throws RHException {
        try {
            String strSQL = "UPDATE CREDITO SET F_PLAZO = ?, F_DESEMBOLSO = TO_DATE(SYSDATE,'DD/MM/YY'), V_SDOPEND=V_PRESTADO, "
                    + "N_E_CREDITO_CK = 'VIGENTE' WHERE SOCIO_K_IDSOCIO = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, credito.getF_plazo());
            prepStmt.setInt(2, credito.getSocio_k_id_socio());
            prepStmt.executeQuery();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            throw new RHException("CreditoDAO", "No se desembolsó el credito " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public void cambiarEstadoCredito(Credito credito) throws RHException {
        try {
            String strSQL = "UPDATE CREDITO SET N_E_CREDITO_CK = ? WHERE K_IDCREDITO = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, credito.getN_e_credito_ck());
            prepStmt.setInt(2, credito.getK_idcredito());
            prepStmt.executeQuery();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            throw new RHException("CreditoDAO", "No se pudo cambiar estado del crédito" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public double consultarSaldoCredito(int socio_k_idSocio) {
        try {
            Credito c = new Credito();
            String strSQL = "SELECT V_SDOPEND, SOCIO_K_IDSOCIO FROM CREDITO WHERE SOCIO_K_IDSOCIO = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, socio_k_idSocio);
            ResultSet rs = prepStmt.executeQuery();
            while (rs.next()) {
                rs.getDouble(1);
                c.setSocio_k_id_socio(rs.getInt(2));
            }
            return rs.getDouble(1);
        } catch (SQLException e) {
            return -1;
        }
    }

    public void cancelarCredito(Credito credito, int socio_k_idsocio) throws RHException {
        if (consultarSaldoCredito(socio_k_idsocio) == 0) {
            try {

                String strSQL = "UPDATE CREDITO SET F_ULTPAGO = ?, V_ULTPAGO = ?, N_E_CREDITO_CK = 'CANCELADO'"
                        + "WHERE SOCIO_K_IDSOCIO = ?";
                Connection conexion = ServiceLocator.getInstance().tomarConexion();
                PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
                prepStmt.setDate(1, java.sql.Date.valueOf(credito.getF_ultpago()));
                prepStmt.setDouble(2, credito.getV_ultpago());
                prepStmt.setInt(3, socio_k_idsocio);
                prepStmt.executeQuery();
                prepStmt.close();
                ServiceLocator.getInstance().commit();
            } catch (SQLException e) {
                throw new RHException("CreditoDAO", "No se pudo cancelar el crédito" + e.getMessage());
            } finally {
                ServiceLocator.getInstance().liberarConexion();
            }
        }
    }

}
