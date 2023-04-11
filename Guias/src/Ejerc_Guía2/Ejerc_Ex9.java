/*
 * 9)Simular la división usando solamente restas. Dados dos números enteros
 * mayores que uno, realizar un algoritmo que calcule el cociente y el 
 * residuo usando sólo restas. Método: Restar el dividendo del divisor hasta 
 * obtener un resultado menor que el divisor, este resultado es el residuo, y
 * el número de restas realizadas es el cociente.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros a dividir");
        System.out.println("Dividendo:");
        int dividendo = leer.nextInt();
        System.out.println("Divisor: ");
        int divisor = leer.nextInt(), resto = 0, cociente = 0;
        
        while(dividendo >= divisor){
            cociente += 1;
            resto = dividendo - divisor;
            System.out.println(dividendo + " - " + divisor + " = " + resto + ". " + cociente + " resta(s) realizadas.");
            dividendo -= divisor;
        }
        System.out.println("Dado que " + dividendo + " es menor que " + divisor + " entonces: el residuo es " + resto +
        " y el conciente es " + cociente + ".");
    }
    
}
