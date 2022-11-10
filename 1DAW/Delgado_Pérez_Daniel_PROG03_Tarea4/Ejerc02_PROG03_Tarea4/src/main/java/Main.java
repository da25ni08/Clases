/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import es.jmpp.prog.aves.Pajaro;
import java.io.*;

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
        System.out.println("Inserte el nombre del pájaro: ");
        String nombre;
        try {
            nombre = buffer.readLine();

            System.out.println("Inserte la posición x del pájaro: ");
            int posX = Integer.parseInt(buffer.readLine());
            System.out.println("Inserte la posición y del pájaro: ");
            int posY = Integer.parseInt(buffer.readLine());
            Pajaro loro = new Pajaro(nombre, posX, posY);
        } catch (IOException ex) {
            System.out.println(ex);
           
        }
        
    }

}
