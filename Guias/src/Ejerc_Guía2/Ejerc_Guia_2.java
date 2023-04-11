/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Guia_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int nota = 0;
        
        while (nota < 1 || nota > 10) {
            
            System.out.println("Ingrese una nota entre 0 y 10: ");
            nota = leer.nextInt();
        }
    }
    
}
