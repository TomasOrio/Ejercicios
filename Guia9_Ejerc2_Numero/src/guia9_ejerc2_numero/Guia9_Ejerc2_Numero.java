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
package guia9_ejerc2_numero;

import guia9_ejerc2_numero.entidades.ParDeNumeros;
import guia9_ejerc2_numero.service.ParDeNumerosService;

public class Guia9_Ejerc2_Numero {

    public static void main(String[] args) {
        ParDeNumeros p1 = new ParDeNumeros();
        ParDeNumerosService ps = new ParDeNumerosService();
        ps.mostrarValores(p1);
        ps.devolverMayor(p1);
        ps.calcularPotencia(p1);
        ps.calcularRaiz(p1);
    }
    
}
