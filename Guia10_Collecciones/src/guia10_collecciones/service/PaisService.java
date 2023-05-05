/*
 * 4)Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
 * usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
 * conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
 * si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
 * los servicios en la clase correspondiente)
 * Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
 * cómo se ordena un conjunto.
 * Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
 * buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
 * usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará al usuario.
 */
package guia10_collecciones.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisService {
    HashSet<String> paises = new HashSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void ingresarPais(){
        String respuesta = "";
        
        while (!respuesta.equalsIgnoreCase("n")){
            System.out.println("Ingrese un país: ");
            String pais = leer.next().toUpperCase();
            paises.add(pais);
            
            System.out.println("¿Desea ingresar otro país?(S/N)");
            respuesta = leer.next();
        }
        
        mostrarPais();
    }
    
    public void mostrarPais(){
        
        System.out.println("Conjunto de países: ");
        for (String var : paises) {
            System.out.println("-" + var);
        }
    }
    
    public void ordenarPais(){
        ArrayList<String> listaPais = new ArrayList(paises);
        Collections.sort(listaPais);
        
        System.out.println("Conjunto países ordenado: ");
        for (String var : listaPais) {
            System.out.println("-"+var);
        }
    }
    
    public void eliminarPais(){
        System.out.println("Ingrese un país a eliminar: ");
        String elim = leer.next().toUpperCase();
        int cont = 0;
        int aux = paises.size();
        
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            if(it.next().equals(elim)){
                it.remove();
                cont --;
            }
            cont ++;
            if(cont==aux){
                System.out.println("El país ingresado no se encuentra en la lista");
            }
        }
        mostrarPais();
    }
}
