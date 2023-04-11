/*
 * 4)Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se 
 * muestre su equivalente en romano.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 10: ");
        int numero = leer.nextInt();
        
        if(numero >= 1 && numero <= 10){
            switch(numero){
                case 1:
                    System.out.println("Su equivalente en romano es 'I'.");
                    break;
                case 2:
                    System.out.println("Su equivalente en romano es 'II'.");
                    break;
                case 3:
                    System.out.println("Su equivalente en romano es 'III'.");
                    break;
                case 4:
                    System.out.println("Su equivalente en romano es 'IV'.");
                    break;
                case 5:
                    System.out.println("Su equivalente en romano es 'V'.");
                    break;
                case 6:
                    System.out.println("Su equivalente en romano es 'VI'.");
                    break;
                case 7:
                    System.out.println("Su equivalente en romano es 'VII'.");
                    break;
                case 8:
                    System.out.println("Su equivalente en romano es 'VIII'.");
                    break;
                case 9:
                    System.out.println("Su equivalente en romano es 'IX'.");
                    break;
                case 10:
                    System.out.println("Su equivalente en romano es 'V'.");
                    break;
            }
        } else {
            System.out.println("Incorrecto, el número ingresado no está entre 1-10.");
        }
    }
    
}
