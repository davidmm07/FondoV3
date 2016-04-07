
import java.util.List;
import negocio.Administrador;
import negocio.Socio;
import util.RHException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Morales
 */
public class Main {
    
    public static void main(String [] args) throws RHException{
        Administrador a = new Administrador();
        List<Socio> socio;
        socio= a.buscarSocioPorID(1073696058);
        for (int i=0;i<socio.size();i++){
        Socio soc ;
        soc=(Socio) socio.get(i);
        System.out.println("socio id: "+ soc.getK_idSocio());
        System.out.println("Nombre socio: "+soc.getN_nomSocio());
        System.out.println("Apellido socio: "+soc.getN_apeSocio());
        System.out.println("Notarjeta socio: "+soc.getN_tarjProfesional());
        
        }
    }
    
}
