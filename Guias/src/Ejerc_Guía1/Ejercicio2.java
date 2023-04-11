/*
 * 2) Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package Ejerc_Guía1;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner nombre = new Scanner(System.in);
        String miNombre;
        System.out.println("Ingrese su nombre: ");
        miNombre = nombre.next();
        System.out.println("Hola, " + miNombre + "! Mucho gusto.");
    }
    
}
