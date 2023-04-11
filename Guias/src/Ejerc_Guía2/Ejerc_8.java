/*
 * 8) Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar 
 * lo siguiente:
 * * * * *
 * *     *
 * *     *
 * * * * *
 *
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado: ");
        int lados = leer.nextInt();
        
        
        //línea sup
        for (int i = 0; i < lados; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        //centro (lados-2 ya que no contamos los lados del cuadrado)
         for (int i = 0; i < lados-2; i++) {
            System.out.print("*");
            for (int j = 0; j < lados-2; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            
            System.out.println("");
        }
        
        
        //línea inf
        for (int i = 0; i < lados; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
