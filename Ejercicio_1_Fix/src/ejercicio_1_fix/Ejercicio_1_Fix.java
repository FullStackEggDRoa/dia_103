/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1_fix;

import Servicios.serviciosAutor;
import Servicios.serviciosEditorial;
import Servicios.serviciosLibro;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_1_Fix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        serviciosAutor sA = new serviciosAutor();
        serviciosEditorial sE = new serviciosEditorial();
        serviciosLibro sL = new serviciosLibro();
        
        System.out.println("..:: MENU LIBRERIA ::..");
        int opcion=0;
        do {            
            System.out.println("1. Busquedas"); 
            System.out.println("2. Ingresar Autor");
            System.out.println("3. Ingresar Editorial");
            System.out.println("4. Ingresar Libro");
            System.out.print("Elija una Opción: ");
            opcion=leer.nextInt();
            switch (opcion) {
                case 4:
                    try{
                        sL.crearLibro();
                    }catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (true);
    }
    
}
