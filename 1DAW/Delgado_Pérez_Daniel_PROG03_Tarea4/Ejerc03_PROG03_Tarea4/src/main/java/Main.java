
import es.jmpp.prog.aves.Pajaro;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1daw10
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStreamReader inRead = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(inRead);
        
        try {
            Pajaro paj1, paj2;
            System.out.println("Inserte el nombre del pájaro 1: ");
            String nombre = buffer.readLine();

            System.out.println("Inserte la posición x del pájaro 1: ");
            int posX = Integer.parseInt(buffer.readLine());
            System.out.println("Inserte la posición y del pájaro 1: ");
            int posY = Integer.parseInt(buffer.readLine());
            paj1 = new Pajaro(nombre, posX, posY);
            System.out.println("Inserte el nombre del pájaro 2: ");
            nombre = buffer.readLine();

            System.out.println("Inserte la posición x del pájaro 2: ");
            posX = Integer.parseInt(buffer.readLine());
            System.out.println("Inserte la posición y del pájaro 2: ");
            posY = Integer.parseInt(buffer.readLine());
            paj2 = new Pajaro(nombre, posX, posY);
            paj1.volar(50, 30);
            paj2.volar(60, -35);
            System.out.println("La posición del pajaro 1 es: (" + paj1.getPosx() + ", " + paj1.getPosy() + ")");
            System.out.println("La posición del pajaro 2 es: (" + paj2.getPosx() + ", " + paj2.getPosy() + ")");
        } catch (IOException ex) {
            System.out.println(ex);
           
        }
        
        
    }
    
}
