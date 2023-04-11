/*
 * 5)Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad
 * de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
 * negativo después de realizar una transacción de retiro.
 */
package ejercex5_cuenta.entidad;

import java.util.Scanner;


public class Cuenta {
    
    Scanner leer = new Scanner(System.in);
    private String titular;
    private double saldo = 10000;

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void retirar_dinero(){
        String rta;
        double monto;
        do{
        System.out.println("Ingrese el monto a retirar: (" + saldo + " disponible.)");
        monto = leer.nextDouble();
        if(monto > saldo){
            System.out.println("Saldo insuficiente (" + saldo + ")");
        } else {
            System.out.println("Extracción exitosa.");
            saldo -= monto;
        }
        
        System.out.println("Desea realizar otra operación? (s/n)");
        rta = leer.next();
        }while(!rta.equalsIgnoreCase("n"));
    }
    
}
