/*
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
 * el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 * 5 *****
 * 3 ***
 * 11 ***********
 * 2 **
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Guia_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, num1, num2, num3;
        
        do{
        System.out.println("Ingrese un número entre 1 y 20: ");
        num = leer.nextInt();
        } while(num<1 || num>20);
        
        System.out.print(num + " ");
        
        for (int i = 0; i < num ; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("====================");
        
          do{
        System.out.println("Ingrese un número entre 1 y 20: ");
        num1 = leer.nextInt();
        } while(num1<1 || num1>20);
        
        System.out.print(num1 + " ");
        
        for (int i = 0; i < num1 ; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("====================");
        
         do{
        System.out.println("Ingrese un número entre 1 y 20: ");
        num2 = leer.nextInt();
        } while(num2<1 || num2>20);
        
        System.out.print(num2 + " ");
        
        for (int i = 0; i < num2 ; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("====================");
        
         do{
        System.out.println("Ingrese un número entre 1 y 20: ");
        num3 = leer.nextInt();
        } while(num3<1 || num3>20);
        
        System.out.print(num3 + " ");
        
        for (int i = 0; i < num3 ; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("====================");
    }
    
}
