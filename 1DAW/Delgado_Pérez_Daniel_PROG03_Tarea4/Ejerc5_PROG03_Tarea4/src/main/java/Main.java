
import java.util.Scanner;

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
        Scanner teclado = new Scanner(System.in);

        String nombre;
        int edad;
        boolean estudias;
        float salario;

        System.out.println("Nombre: ");
        nombre=teclado.nextLine();
        System.out.println("Edad: ");
        edad=teclado.nextInt();
        System.out.println("Estudias: (true o false)");
        estudias=teclado.nextBoolean();
        System.out.println("Salario: ");
        salario= teclado.nextFloat();
        System.out.printf("Nombre: %s || Edad: %d || Estudias: %b || Salario: %.2f", nombre, edad, estudias, salario);
    }
        
    
}
