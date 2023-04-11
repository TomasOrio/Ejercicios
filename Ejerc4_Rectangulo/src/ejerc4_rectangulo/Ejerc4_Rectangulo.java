/*
 * 4)Crear una clase Rectángulo que modele rectángulos por medio de un 
 * atributo privado base y un atributo privado altura. La clase incluirá un 
 * método para crear el rectángulo con los datos del Rectángulo dados por
 * el usuario. También incluirá un método para calcular la superficie del 
 * rectángulo y un método para calcular el perímetro del rectángulo. Por 
 * último, tendremos un método que dibujará el rectángulo mediante 
 * asteriscos usando la base y la altura. Se deberán además definir los 
 * métodos getters, setters y constructores correspondientes.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejerc4_rectangulo;

import ejerc4_rectangulo.entidad.Rectangulo;

public class Ejerc4_Rectangulo {

    public static void main(String[] args) {
        
        Rectangulo rectan1 = new Rectangulo();
        rectan1.crearRectangulo();
        System.out.println("Superficie: " + rectan1.superficie());
        System.out.println("Perímetro: " + rectan1.perimetro());
        System.out.println("Rectángulo: ");
        rectan1.dibujarRectangulo();
    }
    
}
