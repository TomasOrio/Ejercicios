/*
 * Escribir un programa que lea un número entero por teclado y muestre 
 * por pantalla el doble, el triple y la raíz cuadrada de ese número.
 * Nota: investigar la función Math.sqrt().
 */
package Ejerc_Guía1;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número:");
        num = numero.nextInt();
        int numDoble;
        numDoble = num*2;
        System.out.println("El doble de su número es: " + numDoble);
        int numTriple;
        numTriple = num*3;
        System.out.println("El triple de su número es: " + numTriple);
        System.out.println("La raíz cuadrada de su número es: " + Math.sqrt(num));
    }
    
}
