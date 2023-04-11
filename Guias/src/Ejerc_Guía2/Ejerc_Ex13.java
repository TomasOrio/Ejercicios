/*
 * 13) Crear un programa que dibuje una escalera de números, donde cada 
 * línea de números comience en uno y termine en el número de la línea. 
 * Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
 * ingresa el número 3:
 * 1
 * 12
 * 123
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese hasta qué número quiere la escalera :");
        int escalera = leer.nextInt();
        
        for (int i = 1; i <= escalera; i++) {
            for (int j = 1; j <= i; j++) { // <= en ambos casos para no tener que poner "escalera+1" ni "i+1"
                System.out.print(j);       // (al no inicializar los bucles en 0 sino se quedan 1 número cortos)
            }
            System.out.println("");
        }
    }
    
}
