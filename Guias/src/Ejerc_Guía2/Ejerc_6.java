/*
 * 6)Realizar un programa que pida dos números enteros positivos por 
 * teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir 
 * una opción y el programa deberá mostrar el resultado por pantalla y 
 * luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
 * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en 
 * vez de salir del programa directamente, se debe mostrar el siguiente 
 * mensaje de confirmación: ¿Está seguro que desea salir del programa
 * (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso 
 * contrario se vuelve a mostrar el menú.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo: ");
        int num1 = leer.nextInt();
        
        while(num1 < 0){
        System.out.println("Ingrese otro número válido: ");
        num1 = leer.nextInt();
        }
        
        System.out.println("Ingrese un segundo número: ");
        int num2 = leer.nextInt();
        
        while(num2 < 0){
        System.out.println("Ingrese otro número válido: ");
        num2 = leer.nextInt();
        }
        
        do{
            System.out.println("  MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            int opcion = leer.nextInt();
            String opcion1 = " ";
            switch(opcion){
                case 1:
                    System.out.println("La suma da: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta da: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicación da: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La división da: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("Seguro desea salir del programa? 'S/N'");
                    opcion1 = leer.next();
                    if(opcion1.equalsIgnoreCase("S")){
                        System.out.println("Ha salido del programa.");
                        break;
                    } else{
                        System.out.println("Volviendo al menú...");
                    }
                
                
            }
            
            if(opcion1.equalsIgnoreCase("S")){
                break;
            }
            
            
            
            
        }while(num1 != 0);
    }
    
}
