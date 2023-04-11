/*
 * 3)Recorrer un vector de N enteros contabilizando cuántos números son de 
 * 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ejerc_Guía4;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        
        System.out.println("Ingrese números de hasta 5 dígitos para completar el vector: ");
        int cont1D = 0, cont2D = 0, cont3D = 0, cont4D = 0, cont5D = 0;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = leer.nextInt();
            
            if (vector[i]>= 0 && vector[i] < 10){
                cont1D += 1;
            }
            if (vector[i]>= 10 && vector[i] < 100){
                cont2D += 1;
            }
            if (vector[i]>= 100 && vector[i] < 1000){
                cont3D += 1;
            }
            if (vector[i]>= 1000 && vector[i] < 10000){
                cont4D += 1;
            }
            if (vector[i]>= 10000 && vector[i] < 100000){
                cont5D += 1;
            }
        }
        
        System.out.println("Su vector tiene "+ cont1D +" números de 1 dígito, "+ cont2D +" de dos dígitos, "+ cont3D
        + " de tres dígitos, "+ cont4D +" de cuatro dígitos y "+ cont5D +" de cinco dígitos.");
    }
    
}
