/*
 * 2)Realizar un algoritmo que llene un vector de tamaño N con valores 
 * aleatorios y le pida al usuario un número a buscar en el vector. El 
 * programa mostrará dónde se encuentra el numero y si se encuentra repetido.
 */
package Ejerc_Guía4;

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
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int)Math.floor(Math.random()*10+1);
        }
        
        System.out.println("Ingrese un número entre 1 y 10 a buscar en el vector: ");
        int buscarNumero = leer.nextInt();
        
        for (int i = 0; i < tamaño; i++) {
            if (buscarNumero == vector[i]){
                System.out.println("Se encontró su número " + buscarNumero + " en la posición " + i + " del vector.");
            } else{
                System.out.println("Su número no se encuentra en la posición "+ i + "(" + vector[i] + ").");
            }
        }
    }
    
}
