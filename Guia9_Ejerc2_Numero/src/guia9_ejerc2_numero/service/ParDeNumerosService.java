/*
 * 2)Realizar una clase llamada ParDeNumeros que tenga como atributos dos 
 * números reales con los cuales se realizarán diferentes operaciones 
 * matemáticas. La clase debe tener un constructor vacío, getters y setters.
 * En el constructor vacío se usará el Math.random para generar los dos 
 * números. Crear una clase ParDeNumerosService, en el paquete Servicios,
 * que deberá además implementar los siguientes métodos:
 * a)Método mostrarValores que muestra cuáles son los dos números guardados.
 * b)Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor.
 * c)Método calcularPotencia para calcular la potencia del mayor valor de la clase
 * elevado al menor número. Previamente se deben redondear ambos valores.
 * d)Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
 * Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package guia9_ejerc2_numero.service;

import guia9_ejerc2_numero.entidades.ParDeNumeros;

public class ParDeNumerosService {
    
    public void mostrarValores(ParDeNumeros p1){
        System.out.println("Número 1: " + p1.getNumero1());
        System.out.println("Número 2: " + p1.getNumero2());
    }
    
    public void devolverMayor(ParDeNumeros p1){
        System.out.println("El valor más alto es: " + Math.max(p1.getNumero1(),p1.getNumero2()));
    }
    
    public void calcularPotencia(ParDeNumeros p1){
        double numero1 = (double)(Math.round(p1.getNumero1()));
        double numero2 = (double)(Math.round(p1.getNumero2()));
        double resultado;
        double mayor = Math.max(numero1,numero2);
        double menor = Math.min(numero1, numero2);
        
        resultado = Math.pow(mayor, menor);
        
        System.out.println("La potencia de ["+mayor+"] elevado a ["+menor+"]" +
                " da como resultado: "+resultado);
    }
    
    public void calcularRaiz(ParDeNumeros p1){
        double numero1 = Math.abs(p1.getNumero1());
        double numero2 = Math.abs(p1.getNumero2());
        double mayor = Math.max(numero1, numero2);
        double menor = Math.min(numero1, numero2);
        double resultado;
        
        resultado = Math.sqrt(menor);
        
        System.out.println("La raíz cuadrada del número menor [" + menor + "]"+
                " es: " + resultado);
    }
}
