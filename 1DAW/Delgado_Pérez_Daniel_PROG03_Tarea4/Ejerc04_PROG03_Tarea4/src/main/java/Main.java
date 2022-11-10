
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
            System.out.println("Inserta letras: ");
            int numero = Integer.parseInt(buffer.readLine());
            
        } catch (IOException ex) {
            System.out.println(ex);
           
        }
    }
    
}
