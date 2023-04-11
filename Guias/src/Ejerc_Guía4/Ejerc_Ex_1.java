/*
 * 1)Realizar un algoritmo que calcule la suma de todos los elementos de un 
 * vector de tamaño N, con los valores ingresados por el usuario.
 */
package Ejerc_Guía4;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        
        int suma = 0;
        System.out.println("Ingrese los números para llenar el vector: ");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        
        System.out.println("La suma de los " + tamaño + " números es: " + suma);
    }
    
}
