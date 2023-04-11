/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerc_Guía4;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Guia_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String equipo[] = new String [6];
        
        System.out.println("Ingresa los nombres de tus compañeros de equipo: ");
        
        for (int i = 0; i < 6; i++) {
            equipo[i] = leer.next();
        }
    }
    
}
