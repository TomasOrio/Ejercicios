/*
 * 5)Una obra social tiene tres clases de socios:
 * -Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
 * -Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
 * -Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
 * -Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente
 *  el costo del tratamiento (previo al descuento)y determine el importe en efectivo a pagar por dicho socio.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su categoría (A/B/C): ");
        String respuesta = leer.nextLine();
        
        if(respuesta.equalsIgnoreCase("A")|| respuesta.equalsIgnoreCase("B") || respuesta.equalsIgnoreCase("C")){
            
            System.out.println("Ingrese el valor real del tratamiento previo al descuento: ");
            int tratamiento = leer.nextInt();
            
            switch(respuesta.toUpperCase()){
                case "A":
                    System.out.println("Usted es clase 'A', el tratamiento con el descuento es de $" + (tratamiento*50/100) + ".");
                    break;
                case "B":
                    System.out.println("Usted es clase 'B', el tratamiento con el descuento es de $" + ((tratamiento)-tratamiento*35/100) + ".");
                    break;
                case "C":
                    System.out.println("Usted es clase 'C', el tratamiento no tiene descuento.");
                    break;
            }
        } else{
            System.out.println("La categoría ingresada es incorrecta.");
        }
    }
    
}
