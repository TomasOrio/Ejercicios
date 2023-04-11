/*
 * 5)Realizar un programa que llene una matriz de tamaño NxM con valores
 * aleatorios y muestre la suma de sus elementos.
 */
package Ejerc_Guía4;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas de la matriz: ");
        int n = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        int m = leer.nextInt();
        int[][] matriz = new int[n][m];
        
        int suma = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int)(Math.random()*10+1);
                System.out.print("[" + matriz[i][j] + "]");
                suma += matriz[i][j];
            }
            System.out.println("");
        }
        
        System.out.println("La suma de los elementos es: " + suma);
    }
    
}
