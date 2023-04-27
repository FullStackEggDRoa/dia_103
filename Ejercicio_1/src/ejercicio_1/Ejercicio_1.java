/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import Servicios.serviciosAutor;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        serviciosAutor sA = new serviciosAutor();
        System.out.println("..:: MENU LIBRERIA ::..");
        int opcion=0;
        do {            
            System.out.println("1. Busqueda Autor");
            System.out.println("2. Busqueda por ISBN");
            System.out.println("3. Busqueda por Titulo");
            System.out.println("4. Busqueda por Autor");
            System.out.println("5. Busqueda por Editorial");
            System.out.println("6. Ingresar Autor");
            System.out.println("7. Ingresar Editorial");
            System.out.println("8. Ingresar Libro");
            System.out.print("Elija una Opción: ");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    try{
                        System.out.println("+------+-------------------------------+");
                        System.out.println("|Codigo|       Nombre de Autores       |");
                        System.out.println("+------+-------------------------------+");
                        String Aux = sA.listarAutores().toString().replace(",", "+------+-------------------------------+\n");
                        String Aux1 = Aux.replace("[", "|");
                        System.out.println(Aux1.replace("\n]",""));
                        
                        System.out.println("+------+-------------------------------+");
                    }catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 6:
                    try{
                        sA.crearAutor();
                    }catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                    
            }
            
        } while (true);
        
    }
    
}
