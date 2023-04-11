/*
 * 4)Los profesores del curso de programación de Egg necesitan llevar un 
 * registro de las notas adquiridas por sus 10 alumnos para luego obtener 
 * una cantidad de aprobados y desaprobados. Durante el período de 
 * cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos 
 * evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
 * -Primer trabajo práctico evaluativo 10%
 * -Segundo trabajo práctico evaluativo 15%
 * -Primer Integrador 25%
 * -Segundo integrador 50%
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el 
 * arreglo. Al final del programa los profesores necesitan obtener por 
 * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta 
 * que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso
 */
package Ejerc_Guía4;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double[] vector = new double[10];
        int primerPrac = 0, segundoPrac = 0, primerInteg = 0, segundoInteg = 0, contAprob = 0, contDesap = 0;
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Ingrese la nota del primero práctico evaluativo del [" + (i+1) + "] alumno.");
            primerPrac = leer.nextInt();
            
            while(primerPrac < 1 || primerPrac > 10){
                System.out.println("Número incorrecto, ingrese nuevamente la nota (1-10):");
                primerPrac = leer.nextInt();
            }
            
            System.out.println("Ingrese la nota del segundo práctico evaluativo del [" + (i+1) + "] alumno.");
            segundoPrac = leer.nextInt();
            
            while(segundoPrac < 1 || segundoPrac > 10){
                System.out.println("Número incorrecto, ingrese nuevamente la nota (1-10):");
                segundoPrac = leer.nextInt();
            }
            
            System.out.println("Ingrese la nota del primer integrador del [" + (i+1) + "] alumno.");
            primerInteg = leer.nextInt();
            
            while(primerInteg < 1 || primerInteg> 10){
                System.out.println("Número incorrecto, ingrese nuevamente la nota (1-10):");
                primerInteg = leer.nextInt();
            }
            
            System.out.println("Ingrese la nota del segundo integrador del [" + (i+1) + "] alumno.");
            segundoInteg = leer.nextInt();
            
            while(segundoInteg < 1 || segundoInteg > 10){
                System.out.println("Número incorrecto, ingrese nuevamente la nota (1-10):");
                segundoInteg = leer.nextInt();
            }
            
            vector[i] = (primerPrac*0.10) + (segundoPrac*0.15) + (primerInteg*0.25) + (segundoInteg*0.50);
            System.out.println("Promedio alumno [" + (i+1) + "]: " + vector[i]);
            
            primerPrac = 0; segundoPrac = 0; primerInteg = 0; segundoInteg = 0;
            
            if (vector[i] >= 7) {
                contAprob += 1;
            } else {
                contDesap += 1;
            }
        }
        
        System.out.println("De los 10 alumnos hubo " + contAprob + " y " + contDesap + " desaprobados." );
    }
    
}
