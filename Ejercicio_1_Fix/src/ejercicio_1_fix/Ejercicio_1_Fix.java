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
            System.out.println("5. Mostrar Autores");
            System.out.println("6. Mostrar Editoriales");
            System.out.println("7. Mostrar Libros");
            System.out.print("Elija una Opción: ");
            opcion=leer.nextInt();
            switch (opcion) {
                
                case 2:
                    try{
                        sA.crearAutor();
                    }catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 3:
                    try{
                        sE.crearEditorial();
                    }catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;    
                case 4:
                    try{
                        sL.crearLibro();
                    }catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 5:
                    try{
                        
                        System.out.println("+------+-------------------------------+");
                        System.out.println("|Codigo|       Nombre de Autor         |");
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
                        
                        System.out.println("+------+-------------------------------+");
                        System.out.println("|Codigo|      Nombre de Editorial      |");
                        System.out.println("+------+-------------------------------+");
                        
                        String Aux = sE.listarEditoriales().toString().replace(",", "+------+-------------------------------+\n");
                        String Aux1 = Aux.replace("[", "|");
                        System.out.println(Aux1.replace("\n]",""));
                        System.out.println("+------+-------------------------------+");
                    }catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;    
                case 7:
                    try{
                        
                        System.out.println("+------+-------------------------------+---------------------+-------------------------------+-------------------------------+-----+");
                        System.out.println("|Codigo|        Titulo del Libro       |    ISBN del Libro   |             Autor             |            Editorial          | Año |");
                        System.out.println("+------+-------------------------------+---------------------+-------------------------------+-------------------------------+-----+");
                        
                        String Aux = sL.listarLibros().toString().replace(",", "+------+-------------------------------+---------------------+-------------------------------+-------------------------------+-----+\n");
                        String Aux1 = Aux.replace("[", "|");
                        System.out.println(Aux1.replace("\n]",""));
                        System.out.println("+------+-------------------------------+---------------------+-------------------------------+-------------------------------+-----+");
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
