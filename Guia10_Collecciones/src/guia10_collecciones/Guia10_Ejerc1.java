/*
 * 1)Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 * salir, se mostrará todos los perros guardados en el ArrayList.
 * 
 * 
 * 2)Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
 * un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
 * está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
 * ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará la lista ordenada.
 */
package guia10_collecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Guia10_Ejerc1 {

    public static void main(String[] args) {
        
        ArrayList<String> razas = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        String respuesta = "";
        while(!respuesta.equalsIgnoreCase("n")){
            System.out.println("Ingrese una raza de perro: ");
            String perro = leer.next();
            perro = perro.toUpperCase();
            razas.add(perro);
            
            System.out.println("¿Desea ingresar otro perro? (S/N)");
            respuesta = leer.next();
            
            if(respuesta.equalsIgnoreCase("n")){
                System.out.println("Saliendo...");
                System.out.println("Lista de perros guardados: ");
                
                for(String raza:razas){
                    System.out.println("-"+raza);
                }     
            }
        }
        //termina ejercicio 1
        
        Iterator<String> it = razas.iterator();
        System.out.println("Ingrese una raza a buscar y eliminar: ");
        String perro = leer.next();
        perro = perro.toUpperCase();
        
        int cont = 0;
        int aux = razas.size(); //utilizo aux y no directamente razas.size() en el if porque si remueve una se jode el if
        while (it.hasNext()) {
            
            if(it.next().equals(perro)){
                cont --;
                it.remove();
            }
            cont ++;
            if (cont == aux){
                System.out.println("Esa raza no se encuentra en la lista.");
            }
        }
        
        Collections.sort(razas);
        System.out.println("Lista ordenada: ");
        for (String raza : razas) {
            System.out.println("-"+raza);
        }
    }
}
