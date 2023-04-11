/*
 * Dada una cantidad de grados centígrados se debe mostrar su 
 * equivalente en grados Fahrenheit. La fórmula correspondiente es:
 * F = 32 + (9 * C / 5).
 */
package Ejerc_Guía1;

import java.util.Scanner;


/**
 *
 * @author Tomas
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner cent = new Scanner(System.in);
        double centi;
        System.out.println("Ingrese una cantidad de grados Centígrados: "); //Ingresar con coma no punto
        centi = cent.nextDouble();
        double faren;
        faren = 32 + (9*centi/5);
        System.out.println("El equivalente es grados Farenheit es: " + faren);
    }
    
}
