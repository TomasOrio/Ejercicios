/*
 * 3)Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
 * tendremos una clase Pelicula con el título, director y duración de la película (en horas).
 * Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
 * que se pide a continuación:
 * En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula.
 * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
 * crear otra Pelicula o no.
 * Después de ese bucle realizaremos las siguientes acciones:
 * -Mostrar en pantalla todas las películas.
 * -Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 * -Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
 * -Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
 * -Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
 * -Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package guia10_collecciones.service;

import guia10_collecciones.entidades.Pelicula;
import guia10_collecciones.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> pelis = new ArrayList<>();
    
    
    public void crearPelicula(){
        String respuesta = "";
        
        while(!respuesta.equalsIgnoreCase("n")){
            Pelicula p = new Pelicula();
            System.out.println("Ingrese el título de la película: ");
            String titulo = leer.next();
            System.out.println("Ingrese el nombre del director: ");
            String director = leer.next();
            System.out.println("Ingrese la duración (en horas): ");
            Double duracion = leer.nextDouble();
            p.setDirector(director);p.setTitulo(titulo);p.setDuracion(duracion);
            pelis.add(p);
            
            System.out.println("¿Desea cargar otra peli? (S/N)");
            respuesta = leer.next();
        }
    }
    
    public void mostrarPelicula(){
        System.out.println("Lista de películas cargadas:");
        for (Pelicula peli : pelis) {
            System.out.println("-"+peli);
        }
        System.out.println("-------------------------------------");
    }
    
    public void mostrarPelicula1Hora(){
        System.out.println("Lista de películas con más de 1 hora de duración: ");
        for (Pelicula peli : pelis) {
            if(peli.getDuracion() >= 1.0){
                System.out.println("-"+peli);
            }
        }
        System.out.println("-------------------------------------");
    }
    
    public void ordenarDuracionDesc(){
        Collections.sort(pelis, Comparadores.ordenarDuracionDesc);
        System.out.println("Listado ordenado por duración descendente:");
        for (Pelicula peli : pelis) {
            System.out.println("-"+peli);
        }
        System.out.println("-------------------------------------");
    }
    
    public void ordenarDuracionAsc() {
        Collections.sort(pelis, Comparadores.ordenarDuracionAsc);
        System.out.println("Listado ordenado por duración ascendente:");
        for (Pelicula peli : pelis) {
            System.out.println("-" + peli);
        }
        System.out.println("-------------------------------------");
    }
     
    public void ordenarPorTitulo(){
        Collections.sort(pelis, Comparadores.ordenarTitulo);
        System.out.println("Listado ordenado por título:");
        for (Pelicula peli : pelis) {
            System.out.println("-" + peli);
        }
        System.out.println("-------------------------------------");
    }
    
    public void ordernarPorDirector(){
        Collections.sort(pelis, Comparadores.ordenarDirector);
        System.out.println("Listado ordenado por director:");
        for (Pelicula peli : pelis) {
            System.out.println("-" + peli);
        }
        System.out.println("-------------------------------------");
    }
}
