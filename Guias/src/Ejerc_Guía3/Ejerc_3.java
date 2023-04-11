/*
 * 3)Crea una aplicación que a través de una función nos convierta una 
 * cantidad de euros introducida por teclado a otra moneda, estas pueden 
 * ser a dólares, yenes o libras. La función tendrá como parámetros, la 
 * cantidad de euros y la moneda a convertir que será una cadena, este no 
 * devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
 * El cambio de divisas es:
 * i-* 0.86 libras es un 1 €
 * ii- * 1.28611 $ es un 1 €
 * iii- * 129.852 yenes es un 1 €
 */
package Ejerc_Guía3;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros: ");
        int euro = leer.nextInt();
        System.out.println("Ingrese por qué moneda la quiere cambiar: ");
        System.out.println("1-Libras (L/l)");
        System.out.println("2-Dólares (D/d)");
        System.out.println("3-Yenes (Y/y)");
        String monedaCambio = leer.next();
        if (monedaCambio.equals("L") || monedaCambio.equals("l") || monedaCambio.equals("D") || monedaCambio.equals("d")
            || monedaCambio.equals("Y") || monedaCambio.equals("y") ){
            cambioDivisas(euro, monedaCambio);
            
        }else {
        System.out.println("Opción incorrecta.");
        }
    }
    
    public static void cambioDivisas(int euro, String monedaCambio){
        
        switch(monedaCambio){
            
            case "L":
            case "l":
                System.out.println( + euro + " euros son: " + (euro*0.86) + " libras.");
                break;
            case "D":
            case "d":
                System.out.println( + euro + " euros son: " + (euro*1.28611) + " dólares.");
                break;
            case "Y":
            case "y":
                System.out.println( + euro + " euros son: " + (euro*129.852) + " yenes.");
                break;
        }
    }
}
