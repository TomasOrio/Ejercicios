/*
 * 7) Realice un programa que calcule y visualice el valor máximo, el valor
 * mínimo y el promedio de n números (n>0). El valor de n se solicitará al 
 * principio del programa y los números serán introducidos por el usuario. 
 * Realice dos versiones del programa, una usando el bucle “while” y otra 
 * con el bucle “do - while”.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números de entrada: ");
        int totalNumeros = leer.nextInt();
        int numMax = 0, numMin = 100000;
        double suma = 0, aux = totalNumeros;
//        while(totalNumeros>0){
//            System.out.println("Ingrese " + totalNumeros + " números");
//            int numero = leer.nextInt();
//            
//            if(numero > numMax){
//                numMax = numero;
//            }
//            if(numero < numMin){
//                numMin = numero;
//            }
//            
//            suma += numero;
//            System.out.println(suma);
//            totalNumeros -= 1;
//        }


        do {
            System.out.println("Ingrese " + totalNumeros + " números");
            int numero = leer.nextInt();
            if (numero > numMax) {
                numMax = numero;
            }
            if (numero < numMin) {
                numMin = numero;
            }
            suma += numero;
           //System.out.println(suma);
            totalNumeros -= 1;
                
        }while(totalNumeros>0);
            
        double prom = suma/aux;
        System.out.println("El mayor número introducido fue: " + numMax + ", el menor: " + numMin + 
            " y el promedio de ellos fue de: " + prom);
    }
    
}
