/*
 * 2)Programa Nespresso. Desarrolle una clase Cafetera en el paquete 
 * Entidades con los atributos capacidadMáxima (la cantidad máxima de 
 * café que puede contener la cafetera) y cantidadActual (la cantidad 
 * actual de café que hay en la cafetera). Agregar constructor vacío y con 
 * parámetros así como setters y getters. Crear clase CafeteraServicio en 
 * el paquete Servicios con los siguiente:
 * a)Método llenarCafetera(): hace que la cantidad actual sea igual a la 
 * capacidad máxima. 
 * b)Método servirTaza(int): se pide el tamaño de una taza vacía, el 
 * método recibe el tamaño de la taza y simula la acción de servir la 
 * taza con la capacidad indicada. Si la cantidad actual de café “no 
 * alcanza” para llenar la taza, se sirve lo que quede. El método le 
 * informará al usuario si se llenó o no la taza, y de no haberse llenado 
 * en cuanto quedó la taza.
 * c)Método vaciarCafetera(): pone la cantidad de café actual en cero.
 * d)Método agregarCafe(int): se le pide al usuario una cantidad de café, 
 * el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package guia8_ejerc2_nespresso.service;

import guia8_ejerc2_nespresso.entidades.Cafetera;
import java.util.Scanner;

public class CafeteraService {
    Scanner leer = new Scanner(System.in);
    Cafetera c1 = new Cafetera();
    
    public void llenarCafetera(){
        int max = c1.getCapacidadMaxima();
        c1.setCantidadActual(max);
        System.out.println("Cafetera al máximo: ("+max+").");
    }
    
    public int servirTaza(){
        System.out.println("Ingrese el tamaño de la taza vacía: ");
        int taza = leer.nextInt();
        int cafe = c1.getCantidadActual();
        if(cafe >= taza){
            System.out.println("Se llenó su taza");
            c1.setCantidadActual(cafe-taza);
            return cafe-taza;
        } else {
            System.out.println("No alcanzó a llenar su taza ("+cafe+" de "+taza+").");
            return 0;
        }
    }
    
    public void vaciarCafetera(){
        c1.setCantidadActual(0);
    }
    
    public int agregarCafe(){
        System.out.println("Ingrese una cantidad de café a añadir (máximo 100): ");
        int cantidad = leer.nextInt();
        int capacidadMax = c1.getCapacidadMaxima();
        int actual = c1.getCantidadActual();
        if(cantidad > capacidadMax){
            System.out.println("Su número es mayor a 100, se llenará y desechará el resto. ");
            c1.setCantidadActual(100);
            return 100;
        } else if (cantidad+actual>capacidadMax){
            System.out.println("La suma de lo ingresado y la cantidad actual supera el máximo, se desechará el resto ("+
                    (cantidad+actual-capacidadMax)+").");
            c1.setCantidadActual(100);
            return 100;
        } else {
            c1.setCantidadActual(cantidad+actual);
            System.out.println("Llenada con éxito, cantidad actual: "+c1.getCantidadActual());
            return cantidad+actual;
        }
    }
}
