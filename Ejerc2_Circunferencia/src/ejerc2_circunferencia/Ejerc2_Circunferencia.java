/*
 * 2) Declarar una clase llamada Circunferencia que tenga como atributo 
 * privado el radio de tipo real. A continuación, se deben crear los 
 * siguientes métodos:
 * a) Método constructor que inicialice el radio pasado como parámetro.
 * b) Métodos get y set para el atributo radio de la clase Circunferencia.
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda 
 * en el atributo del objeto.
 * d) Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
 * e) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package ejerc2_circunferencia;

import ejerc2_circunferencia.entidad.Circunferencia;
import java.util.Scanner;


public class Ejerc2_Circunferencia {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Circunferencia radio1 = new Circunferencia(0);
        
        System.out.println("Ingrese el radio: ");
        radio1.crearCircunferencia(leer.nextDouble());
        
        System.out.println("Area: " + radio1.area() );
        System.out.println("Perímetro: " + radio1.perimetro());
    }
    
}
