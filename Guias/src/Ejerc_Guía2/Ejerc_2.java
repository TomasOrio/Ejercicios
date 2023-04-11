/*
 * 2) Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
 * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
 * Incorrecto. Nota: investigar la función equals() en Java.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un frase: ");
        String frase = leer.next();
        if(frase.equalsIgnoreCase("eureka")){
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto.");
        }
    }
    
}
