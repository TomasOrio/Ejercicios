/*
 * 14)Se dispone de un conjunto de N familias, cada una de las cuales tiene 
 * una M cantidad de hijos. Escriba un programa que pida la cantidad de 
 * familias y para cada familia la cantidad de hijos para averiguar la media 
 * de edad de los hijos de todas las familias.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias: ");
        int familias = leer.nextInt(), hijos = 0;
        double cont = 0, contHijos = 0;
        
        for (int i = 0; i < familias; i++) {
            
            System.out.println("Ingrese la cantidad de hijos y luego las edades ");
            hijos = leer.nextInt();
            
            for (int j = 0; j < hijos; j++) {
                int edades = leer.nextInt();
                cont += edades;
            }
            contHijos += hijos;
        }
        
        double prom = cont/contHijos;
        int hijosMensaje = (int) contHijos; // solo para que en el mensaje de abajo no aparezca el número de hijos con decimal
        System.out.println("Las "+ familias +" familias tienen "+ hijosMensaje +" hijos y promedian los "+ prom +" años de edad.");
    }
    
}
