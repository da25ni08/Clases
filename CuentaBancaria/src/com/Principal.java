/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com;

import java.util.Scanner;

/**
 *
 * @author kirin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inserte la opcion que desea realizar:\n 1.- Crear cuenta\n 0.- Salir");
        Scanner input = new Scanner(System.in);
        int opcion;
        boolean exit = false;
        while(!exit) {
            System.out.print("Seleccione su accion:");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Inserte sus datos..........");
                    
                    break;
                    
                case 0:
                    exit = true;
                    break;
                    
                default:
                    System.out.println("Inserte un numero válido ");
            }
        }
        System.out.println("Gracias, vuelva pronto");
    }
    
}
