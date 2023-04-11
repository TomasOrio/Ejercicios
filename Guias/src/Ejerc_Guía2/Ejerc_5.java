/*
 * 5)Escriba un programa en el cual se ingrese un valor límite positivo, y a 
 * continuación solicite números al usuario hasta que la suma de los 
 * números introducidos supere el límite inicial.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor positivo límite: ");
        int num = leer.nextInt(),suma = 0, num1;
        
        for (int i = 0; i < num; i++) {
            
            System.out.println("Ingrese números a sumar para superar el primer número: ");
            num1 = leer.nextInt();
            suma += num1;
            
            if(suma > num){
                System.out.println("El valor inicial (" + num + ") fue superado por la suma del resto: " + suma + ".");
                break;
            }  
        }
    }
    
}
