/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import Enumeradores.busquedasLibro;
import Servicios.serviciosAutor;
import Servicios.serviciosEditorial;
import Servicios.serviciosLibro;
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
        serviciosEditorial sE = new serviciosEditorial();
        serviciosLibro sL = new serviciosLibro();
        
        System.out.println("..:: MENU LIBRERIA ::..");
        int opcion=0;
        do {            
            System.out.println("1. Busquedas"); 
            System.out.println("6. Ingresar Autor");
            System.out.println("7. Ingresar Editorial");
            System.out.println("8. Ingresar Libro");
            System.out.print("Elija una Opción: ");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    try{
                        Boolean criterioOk = false;
                        String respuesta = "";
                        do{
                            System.out.print("Criterio de Busqueda: ["+busquedasLibro.Autor+", "+busquedasLibro.Editorial+", "+busquedasLibro.ISBN+", "+busquedasLibro.Titulo+"]: ");
                            respuesta = leer.next();
                            criterioOk = respuesta.equalsIgnoreCase(busquedasLibro.Autor.toString()) || respuesta.equalsIgnoreCase(busquedasLibro.Editorial.toString())
                                    || respuesta.equalsIgnoreCase(busquedasLibro.ISBN.toString()) || respuesta.equalsIgnoreCase(busquedasLibro.Titulo.toString()); 
                            
                        }while(!criterioOk);
                        System.out.println("+------+-------------------------------+");
                        System.out.println("|Codigo|       Nombre de Libro         |");
                        System.out.println("+------+-------------------------------+");
                        switch (respuesta) {
                            case busquedasLibro.Autor.toString():
                                
                                break;
                            default:
                                throw new AssertionError();
                        }
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
                case 8:
                    try{
                        sL.crearLibro();
                    }catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                default:
                    throw new AssertionError();
//            }
            
        } while (true);
        
    }
    
}
