/*
 * 1)Dado un tiempo en minutos, calcular su equivalente en días y horas. Por 
 * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su 
 * equivalente: 1 día, 2 horas.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos a convertir: ");
        int minuto = leer.nextInt();
        int hora = 0;
        int dia = 0;
        
        
        while (minuto >= 60) {
            if (minuto >= 1440) {
                dia += 1;
                minuto -= 1440;
            } else {
                if (minuto >= 60) {
                    hora += 1;
                    minuto -= 60;
                }
            }

        }
        System.out.println("Esa cantidad son: " + dia + " dia(s) y " + hora + " horas.");
    }
}