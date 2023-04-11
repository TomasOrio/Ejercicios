/*
 * 3) Crear una clase llamada Operacion que tenga como atributos privados 
 * numero1 y numero2. A continuación, se deben crear los siguientes métodos:
 *
 * a)Método constructor con todos los atributos pasados por parámetro.
 * b)Método constructor sin los atributos pasados por parámetro.
 * c)Métodos get y set.
 * d)Método para crearOperacion(): que le pide al usuario los dos 
 * números y los guarda en los atributos del objeto.
 * e)Método sumar(): calcular la suma de los números y devolver el 
 * resultado al main.
 * f)Método restar(): calcular la resta de los números y devolver el 
 * resultado al main
 * g)Método multiplicar(): primero valida que no se haga una 
 * multiplicación por cero, si fuera a multiplicar por cero, el método
 * devuelve 0 y se le informa al usuario el error. Si no, se hace la 
 * multiplicación y se devuelve el resultado al main
 * h)Método dividir(): primero valida que no se haga una división por cero, 
 * si fuera a pasar una división por cero, el método devuelve 0 y se le 
 * informa al usuario el error se le informa al usuario. Si no, se hace la 
 * división y se devuelve el resultado al main.
 */
package ejerc3_operacion.entidad;

import java.util.Scanner;


public class Operacion {
    
    Scanner leer = new Scanner(System.in);
    
    private double numero1;
    private double numero2;
    
    
    public Operacion(int numero1, int numero2){
        
    }
    public Operacion() {
        
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
       System.out.println("Ingrese el primer número: ");
       this.numero1 = leer.nextDouble();
       System.out.println("Ingrese el segundo número: ");
       this.numero2 = leer.nextDouble();
    }
    
    public double sumar(){
        double suma = numero1+numero2;
        return suma;
    }
    
    public double restar(){
        double resta = numero1-numero2;
        return resta;
    }
    
    public double multiplicacion(){
        
        double multiplicacion = numero1*numero2;
        
        if(numero1 == 0 || numero2 == 0){
            System.out.println("Error, uno de los números es 0.");
            return 0;
        } else{
            
            return multiplicacion; 
        }
    }
    
    public double division(){
        double division = numero1/numero2;
        
        if(numero1 == 0 || numero2 ==0){
            System.out.println("Error, uno de los números es 0.");
            return 0;
        } else {
            return division;
        }
    }
}
