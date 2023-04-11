/*
 * 2)Diseñe una función que pida el nombre y la edad de N personas e 
 * imprima los datos de las personas ingresadas por teclado e indique si 
 * son mayores o menores de edad. Después de cada persona, el programa 
 * debe preguntarle al usuario si quiere seguir mostrando personas y frenar
 * cuando el usuario ingrese la palabra “No”.
 */
package Ejerc_Guía3;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mostrarInfo();
    }
    
    public static void mostrarInfo(){
        
        Scanner leer = new Scanner(System.in);
        String respuesta = " ";
        
        while(!respuesta.equalsIgnoreCase("no")){
            
            System.out.println("Ingrese el nombre y luego la edad");
            String nombre = leer.nextLine();
            int edad = leer.nextInt();
            
            if (edad >= 18){
                System.out.println("Nombre: " + nombre + ", " + edad + " años. Es mayor de edad.");
            } else{
                System.out.println("Nombre: " + nombre + ", " + edad + " años. Es menor de edad.");
            }
            
            System.out.println("¿Quiere seguir ingresando personas?");
            respuesta = leer.next();
            
        }
        
    }
}
