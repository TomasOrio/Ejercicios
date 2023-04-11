/*
 * 3)Realizar un programa que solo permita introducir frases o palabras
 * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
 * deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en 
 * caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        int lFrase = frase.length();
        //System.out.println(lFrase);
        if(lFrase == 8 ){
            System.out.println("Correcto!");
        }else {
            System.out.println("Incorrecto.");
        }
        
    }

}
