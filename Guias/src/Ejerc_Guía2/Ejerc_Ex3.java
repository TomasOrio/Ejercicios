/*
 * 3)Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se 
 * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar 
 * la función equals() de la clase String.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner  leer = new Scanner(System.in);
        System.out.println("Ingrese una letra para ver si es vocal o no: ");
        String letra = leer.nextLine();
        
        if(letra.equalsIgnoreCase("A")||letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") ||
           letra.equalsIgnoreCase("O")||letra.equalsIgnoreCase("U") ){
            
            System.out.println("La letra ingresa es una vocal.");
        } else{
            System.out.println("La letra no es una vocal.");
        }
        
    }
    
}
