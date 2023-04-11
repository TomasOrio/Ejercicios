/*
 * 4)Crea una aplicación que nos pida un número por teclado y con una 
 * función se lo pasamos por parámetro para que nos indique si es o no un 
 * número primo, debe devolver true si es primo, sino false.
 * Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
 * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
 * 17 si es primo.
 */
package Ejerc_Guía3;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para determinar si es primo: ");
        int numero = leer.nextInt();
        System.out.println(primo((numero)));
    }
    
    public static boolean primo(int numero){
        
        int cont = 0;
        boolean salida = false;
        for (int i = 1; i < numero+1; i++) {
            if(numero%i == 0){
                cont+=1;
            }
        }
        if (cont == 2){
            salida = true;
        }
        
        return salida;
    }
    
}
