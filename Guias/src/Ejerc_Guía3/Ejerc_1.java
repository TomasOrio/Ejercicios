/*
 * 1)Crea una aplicación que le pida dos números al usuario y este pueda 
 * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener 
 * una función para cada operación matemática y deben devolver sus
 * resultados para imprimirlos en el main. 
 */
package Ejerc_Guía3;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        
        System.out.println("Ingrese una opción: ");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        int opcion = leer.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("La suma da: " + suma(numero1,numero2));
                break;
            case 2:
                System.out.println("La resta da: " + resta(numero1,numero2));
                break;
            case 3:
                System.out.println("La multiplicación da: " + multi(numero1,numero2));
                break;
            case 4:
                System.out.println("La división da: " + division(numero1,numero2));
                break;
        }
    }
    
    
    public static int suma(int numero1, int numero2){
        
        int resultado = numero1 + numero2;
        
        return resultado;
    }
    
    public static int resta(int numero1, int numero2){
        
        int resultado = numero1 - numero2;
        
        return resultado;
    }
     
     public static int multi(int numero1, int numero2){
        
        int resultado = numero1 * numero2;
        
        return resultado;
    }
      
    public static double division(int numero1, int numero2){
       
        double num1 = numero1;
        double num2 = numero2;
        double resultado = num1 / num2;
        
        return resultado;
    }
}
