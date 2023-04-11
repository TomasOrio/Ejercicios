/*
 * 7)Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un 
 * método "calcular_area" que calcule y devuelva el área del rectángulo. 
 * Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados 
 * de 4 y 6 y imprime el área del rectángulo.
 */
package ejercex7_rectangulo;

import ejercex7_rectangulo.entidad.Rectangulo;
import java.util.Scanner;

public class EjercEx7_Rectangulo {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println("Ingrese el lado 1 del rectángulo: ");
        rectangulo1.setLado1(leer.nextInt());
        System.out.println("Ingrese el lado 2 del rectángulo: ");
        rectangulo1.setLado2(leer.nextInt());
        //rectangulo1.setLado1(4);rectangulo1.setLado2(6);
        rectangulo1.calcular_area();
    }
    
}
