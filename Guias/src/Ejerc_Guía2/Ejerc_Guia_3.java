/*
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se 
 * debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El
 * programa deberá calcular y mostrar el resultado de la suma de los números 
 * leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
 * de la sentencia break.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Guia_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, cont, suma;
        cont = 1;
        suma = 0;
        do{
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            if(num == 0){
                System.out.println("Se capturó el número 0.");
                break;
            }
            cont++;
            suma += num;
        } while (cont < 20);

        System.out.println("La suma de los número es: " + suma);
    }
    
}
