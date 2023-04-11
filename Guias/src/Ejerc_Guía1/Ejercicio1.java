/*
 * 1) Escribir un programa que pida dos números enteros por teclado y calcule
 * la suma de los dos. El programa deberá después mostrar el resultado de la suma
 * 
 */
package Ejerc_Guía1;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner numeros = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un número: ");
        num1 = numeros.nextInt();
        int num2;
        System.out.println("Ingrese otro número: ");
        num2 = numeros.nextInt();
        int num3;
        num3 = num1+num2;
        System.out.println("El resultado de la suma es: " + num3);
        
                
    }
    
}
