/*
 * 11)Escribir un programa que lea un número entero y devuelva el número de 
 * dígitos que componen ese número. Por ejemplo, si introducimos el 
 * número 12345, el programa deberá devolver 5. Calcular la cantidad de 
 * dígitos matemáticamente utilizando el operador de división. Nota: 
 * recordar que las variables de tipo entero truncan los números o resultados.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = leer.nextInt();
        int auxiliar = numero, cont = 0;
        
        while (numero > 0){
            
            numero /= 10;
            cont += 1;
        }
        
        System.out.println("Su número " + auxiliar + " tiene " + cont + " dígitos.");
    }
    
}
