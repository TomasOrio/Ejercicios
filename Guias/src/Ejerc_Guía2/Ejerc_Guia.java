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
public class Ejerc_Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un número: ");
        num1 = num.nextInt();
        System.out.println("Ingrese otro número: " );
        num2 = num.nextInt();
        if(num1>25 && num2>25){
            System.out.println("Ambos números son mayor a 25.");
        } else if(num1>25 || num2 > 25){
            System.out.println("Uno de ellos es mayor a 25.");
        } else {
            System.out.println("Ninguno de ellos es mayor a 25.");
        }
        
        
    }
    
}
