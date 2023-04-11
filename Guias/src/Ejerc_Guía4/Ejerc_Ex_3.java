 /*
 * 3) Crear una función rellene un vector con números aleatorios, pasándole 
 * un arreglo por parámetro. Después haremos otra función o 
 * procedimiento que imprima el vector.
 */
package Ejerc_Guía4;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tamaño para el vector: ");
        int largo = leer.nextInt();
        int[] vector = new int[largo];
        rellenoVector(vector);
        imprimirVector(vector);
        
    }
    
    
    public static void rellenoVector(int[] vector){
            
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*10+1);
        }
        
    }
    
    public static void imprimirVector(int vector[]){
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
}
