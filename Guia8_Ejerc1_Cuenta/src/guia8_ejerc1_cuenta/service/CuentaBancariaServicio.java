/*
 * 1- Realizar una clase llamada CuentaBancaria en el paquete Entidades con 
 * los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), 
 * saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
 * Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
 * 
 * a)Método para crear cuenta pidiéndole los datos al usuario.
 * b)Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
 * c)Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
 * Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar 
 * la cuenta en 0.
 * d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. 
 * Validar que el usuario no saque más del 20%.
 * e) Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
 * f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package guia8_ejerc1_cuenta.service;

import java.util.Scanner;
import guia8_ejerc1_cuenta.entidades.CuentaBancaria;

public class CuentaBancariaServicio {
    CuentaBancaria c1 = new CuentaBancaria();
    Scanner leer = new Scanner(System.in);
    
    public void crearCuenta(){
        System.out.println("Ingrese su DNI: ");
        c1.setDniCliente(leer.nextLong());
        c1.setNumeroCuenta((int)Math.floor(Math.random()*(9999999-999999)+999999));
        System.out.println("Su número de cuenta es: " + c1.getNumeroCuenta());
        System.out.println("Escriba la cantidad de dinero ingresado: ");
        c1.setSaldoActual(leer.nextDouble());
    }
    
    public double ingresar(){
        System.out.println("Escriba la cantidad de dinero a ingresar: ");
        double ingreso = leer.nextDouble();
        double saldo = c1.getSaldoActual();
        saldo += ingreso;
        c1.setSaldoActual(saldo);
        System.out.println("Saldo actual: " + c1.getSaldoActual());
        return saldo;
    }
    
    public double retirar(){
        System.out.println("Ingrese la cantidad que desea extraer: ");
        double cantidad = leer.nextDouble();
        double saldo = c1.getSaldoActual();
        saldo -= cantidad;
        if (saldo < 0){
            System.out.println("Saldo insuficiente, retirando el saldo disponible ("+c1.getSaldoActual()+").");
            c1.setSaldoActual(0);
            return 0;
        } else {
            System.out.println("Retirando: "+cantidad+", saldo restante: "+saldo+".");
            c1.setSaldoActual(saldo);
            return saldo;
        }     
    }
    
    public void extraccionRapida(){
        System.out.println("Ingrese cuánto dinero desea retirar: ");
        System.out.println("(Como máximo 20% de su saldo, saldo actual: "+ c1.getSaldoActual()+".)");
        double extraccion = leer.nextDouble();
        double saldo = c1.getSaldoActual();
        if(extraccion > saldo*0.2){
            System.out.println("Ingreso más del 20%, se le entregará el 20%("+saldo*0.2+").");
            c1.setSaldoActual(saldo-(saldo*0.2));
        } else {
            System.out.println("Retirando el monto ingresado...");
            c1.setSaldoActual(saldo-extraccion);
        }
        
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual: "+ c1.getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.println("Su número de cuenta: "+ c1.getNumeroCuenta());
        System.out.println("Su número de DNI: "+ c1.getDniCliente());
    }
}
