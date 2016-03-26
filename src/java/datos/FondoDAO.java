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
import negocio.Fondo;
import util.ServiceLocator;

/**
 *
 * @author Cristian
 */
public class FondoDAO {
    
    public FondoDAO(){
        
    }
    
    public void consultarFondo(){
        try{
            Fondo f = new Fondo();
            String strSQL = "SELECT K_IDFONDO,V_CAPITAL_TOT,V_CAPITAL_DISP FROM FONDO";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                rs.getInt(1);
                rs.getDouble(2);
                rs.getDouble(3);
            }
        }catch(SQLException e){
            
        }
    }
    
}
