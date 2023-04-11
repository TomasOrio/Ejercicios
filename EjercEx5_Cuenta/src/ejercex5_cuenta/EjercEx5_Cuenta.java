/*
 * 5)Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad
 * de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
 * negativo después de realizar una transacción de retiro.
 */
package ejercex5_cuenta;

import ejercex5_cuenta.entidad.Cuenta;
import java.util.Scanner;

public class EjercEx5_Cuenta {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Cuenta cuenta1 = new Cuenta();
        System.out.println("Ingrese el nombre del titular: ");
        cuenta1.setTitular(leer.nextLine());
        cuenta1.retirar_dinero();
    }
    
}
