/*
 * 5)Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
 * productos que venderemos y el precio que tendrán. Además, se necesita que la
 * aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
 * eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
 * Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
 * Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package guia10_collecciones.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> productos = new HashMap();
    
    public void menu(){
        introducirProducto();
        Integer rta = 0;
        System.out.println("Menu:");
        do {
            System.out.println("1-INGRESAR PRODUCTO");
            System.out.println("2-MODIFICAR PRECIO");
            System.out.println("3-ELIMINAR PRODUCTO");
            System.out.println("4-MOSTRAR PRODUCTO");
            System.out.println("5-SALIR");
            rta = leer.nextInt();
            
            switch(rta){
                case 1:
                    introducirProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProducto();
                    break;
            }
        } while (rta != 5);
    }
    
    public void introducirProducto(){
        System.out.println("Ingrese el nombre del producto: ");
        String produc = leer.next().toUpperCase();
        System.out.println("Ingrese el precio: ");
        Integer precio = leer.nextInt();
        productos.put(produc, precio);
    }
    
    public void modificarPrecio(){
        System.out.println("Ingrese el nombre del producto a modificar el precio: ");
        String produc = leer.next().toUpperCase();
        if (productos.containsKey(produc)){
            System.out.println("Ingrese el nuevo precio: ");
            Integer precio = leer.nextInt();
            productos.replace(produc, precio);
        } else {
            System.out.println("Producto no encontrado, intente nuevamente.");
            modificarPrecio();
        }    
    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese el nombre del producto a eliminar: ");
        String produc = leer.next().toUpperCase();
        if (productos.containsKey(produc)){
            System.out.println("Producto eliminado.");
            productos.remove(produc);
        } else {
            System.out.println("Producto no encontrado, intente nuevamente.");
            eliminarProducto();
        }
    }
    
    public void mostrarProducto(){
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + ", precio: " + entry.getValue());
        }
    }
}
