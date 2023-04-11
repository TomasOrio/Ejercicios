/*
 * 6)Leer la altura de N personas y determinar el promedio de estaturas que 
 * se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a promediar su altura: ");
        int persona = leer.nextInt();
        double promedio = 0;
        double suma = 0;
        for (int i = 0; i < persona; i++) {
            System.out.println("Ingrese la altura de la persona: ");
            double altura = leer.nextDouble();
            suma += altura;
            //System.out.println("suma:" + suma);
            promedio = suma/persona;
        }
        System.out.println("Se ingresaron " + persona + " personas y su promedio de alturas es: " + promedio + "mts.");
    }
    
}
