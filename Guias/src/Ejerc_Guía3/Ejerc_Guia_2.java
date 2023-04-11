/*
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
 * usuario, validando que el primer número múltiplo del segundo e imprima si el 
 * primer número es múltiplo del segundo, sino informe que no lo son.
 */
package Ejerc_Guía3;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Guia_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numMayor = leer.nextInt();
        System.out.println("Ingrese otro número para ver saber si es múltiplo del primero: ");
        int numMenor = leer.nextInt();
        multiplo(numMayor,numMenor);
        
    }
    
    public static void multiplo(int numMayor, int numMenor){
        
        if(numMayor%numMenor==0) {
            System.out.println("Son múltiplos");
        } else {
            System.out.println("No son múltiplos.");
        }
    }
    
}
