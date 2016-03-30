
import negocio.Administrador;
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
        a.agregarCredito((float) 11.1, 190000, "ESTUDIO", 1073696058, 10101010);
    }
    
}
