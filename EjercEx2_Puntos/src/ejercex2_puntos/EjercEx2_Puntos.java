/*
 * 2)Definir una clase llamada Puntos que contendrá las coordenadas de dos 
 * puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
 * Generar un objeto puntos usando un método crearPuntos() que le pide al 
 * usuario los dos números y los ingresa en los atributos del objeto. 
 * Después, a través de otro método calcular y devolver la distancia que 
 * existe entre los dos puntos que existen en la clase Puntos. Para conocer 
 * como calcular la distancia entre dos puntos consulte el siguiente link:
 * http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 *
 */
package ejercex2_puntos;

import ejercex2_puntos.entidad.Punto;


public class EjercEx2_Puntos {

    public static void main(String[] args) {
        
        Punto distancia1 = new Punto();
        distancia1.crearPuntos();
        System.out.println("La distancia entre los puntos es: " + distancia1.distancia());
    }
    
}
