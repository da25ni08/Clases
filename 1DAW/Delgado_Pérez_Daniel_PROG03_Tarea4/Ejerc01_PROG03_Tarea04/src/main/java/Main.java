
import es.jmpp.prog.aves.Pajaro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1daw17
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pajaro loro = new Pajaro("Pepe");
        System.out.println(loro.getPosx() + " " + loro.getPosy() + " " + loro.getNombre());
        
    }
    
}
