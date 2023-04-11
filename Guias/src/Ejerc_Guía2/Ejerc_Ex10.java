/*
 * 10)Realice un programa para que el usuario adivine el resultado de una 
 * multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
 * El programa debe indicar al usuario si su respuesta es o no correcta. En 
 * caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
 * su respuesta nuevamente. Para realizar este ejercicio investigue como 
 * utilizar la función Math.random() de Java.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numRandom = (int) (Math.random()*10), numRandom2 = (int) (Math.random()*10);
        int numero, salida = numRandom * numRandom2;
        
        System.out.println("random 1: "+ numRandom + ", random 2: " + numRandom2 + ", salida: " + salida);
        System.out.println("Adivine el resultado de la multiplicación de 2 números entre 0 y 10: ");
        numero = leer.nextInt();
        while (numero != salida){
            System.out.println("Número incorrecto, intente nuevamente: ");
            numero = leer.nextInt();
        }
        
        System.out.println("Felicidades, adivinó el número " + salida);
    }
    
}
