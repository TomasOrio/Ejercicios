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
public class Ejerc_Guia_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner rta = new Scanner(System.in);
        int tipoMotor;
        System.out.println("Ingrese un tipo de bomba del motor (1-4): ");
        tipoMotor = rta.nextInt();
        
        switch(tipoMotor) {
                
            case 1:
                System.out.println("La bomba es una bomba de agua.");
            break;
            
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
            break;
            
            case 3:
                System.out.println("La bomba es una bomba de hormigón.");
            break;
            
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
            break;
            
            default:
                System.out.println("No existe un valor válido para el tipo de bomba.");    
        }
    }
    
}
