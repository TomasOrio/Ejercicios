/*
 * 6) Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 
 * caracteres y, a medida que el usuario las va ingresando, construya una 
 * “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las 
 * palabras se ubicarán todas en orden horizontal en una fila que será 
 * seleccionada de manera aleatoria. Una vez concluida la ubicación de las 
 * palabras, rellene los espacios no utilizados con un número aleatorio del 0 
 * al 9. Finalmente imprima por pantalla la sopa de letras creada.
 * Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
 * siguientes funciones de Java substring(), Length() y Math.random().
 */
package Ejerc_Guía4;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 5 palabras entre 3 y 5 caracteres: ");
        String palabraEntrada;
        String[][] matriz = new String[20][20];
        String[] palabras = new String[5];
        
        for (int i = 0; i < palabras.length; i++) {
            palabraEntrada = leer.next();
            while (palabraEntrada.length()< 3 || palabraEntrada.length()> 5 ){
                System.out.println("Incorrecto, ingrese una palabra entre 3 y 5 caracteres: ");
                palabraEntrada = leer.next();
            }
            palabras[i] = palabraEntrada;
        }
        
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("[" + palabras[i] + "]");
        }
        //No lo hice, incompleto
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                
               
                
                
            }
        }
    }
    
}
