/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas
 * y después toda en minúsculas.
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package Ejerc_Guía1;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner frase = new Scanner(System.in);
        String frase1;
        System.out.println("Ingrese una frase:");
        frase1 = frase.nextLine();
        String fraseMayus;
        fraseMayus = frase1.toUpperCase();
        System.out.println("Su frase en mayusculas es: " + fraseMayus);
        String fraseMinus;
        fraseMinus = frase1.toLowerCase();
        System.out.println("Su frase en minusculas es: " + fraseMinus);
    }
    
}
