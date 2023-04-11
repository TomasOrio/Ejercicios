/*
 * 8) Escriba un programa que lea números enteros. Si el número es múltiplo
 * de cinco debe detener la lectura y mostrar la cantidad de números 
 * leídos, la cantidad de números pares y la cantidad de números impares. 
 * Al igual que en el ejercicio anterior los números negativos no deben 
 * sumarse. Nota: recordar el uso de la sentencia break.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num = 1, numPar = 0, numImpar = 0, cont = 0;
        
        do{
          num = leer.nextInt();
          if(num%2 == 0 && num > 0){
              numPar += 1;
          }
          if (num%2 != 0 && num > 0){
              numImpar += 1;
          }
          if(num%5 == 0 && num > 0){
              cont += 1;
              System.out.println("Se encontró un número múltiplo de 5. La cantidad de números ingresados fue " + cont +
              ", la cantidad de números pares " + numPar + " y la cantidad de números impares: " + numImpar + ".");
              break;
          }
          if (num > 0){
               System.out.println("Ingrese otro número: ");
               cont += 1;
          }
        } while(num > 0);
        
        if (num < 0){
            System.out.println("Incorrecto, el número ingresado no es entero.");
        }
    }
    
}
