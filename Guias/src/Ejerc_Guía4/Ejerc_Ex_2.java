/*
 * 2) Escriba un programa que averigüe si dos vectores de N enteros son 
 * iguales (la comparación deberá detenerse en cuanto se detecte alguna 
 * diferencia entre los elementos).
 */
package Ejerc_Guía4;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores a comparar: ");
        int tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        int[] vector1 = new int[tamaño];
        
        System.out.println("Vector 1: ");
        
        for (int i = 0; i < vector.length; i++) {
            //vector[i] = 1; prueba
            //vector1[i] = 1; prueba
            vector[i] = (int) (Math.random()*10+1);
            System.out.print("["+ vector[i] + "]");
            vector1[i] = (int) (Math.random()*10+1);
        }
        System.out.println("");
        System.out.println("Vector 2: ");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+ vector1[i] + "]");
        }
        
        System.out.println("");
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i] == vector1[i]){
                System.out.println("En la posición ["+i+"] coinciden ("+ vector[i] + " y " + vector1[i] + ").");
                cont += 1;
            } else{
                System.out.println("Los vectores no son iguales.");
                break;
            }
                
        }
        
        if (cont == vector.length){
            System.out.println("Los vectores son iguales.");
        }
    }
    
}
