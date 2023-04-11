/*
 * 1)Crear una clase llamada Libro que contenga los siguientes atributos: 
 * ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
 * atributos pasados por parámetro y un constructor vacío. Crear un 
 * método para cargar un libro pidiendo los datos al usuario y luego informar
 * mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
 */
package ejerc1_libro;

import ejerc1_libro.entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc1_Libro {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Libro lib1 = new Libro();
        
        System.out.println("Ingrese el ISBN: ");
        lib1.setISBN(leer.nextInt());
        leer.nextLine(); //utilizo esto para que si pongo un nextLine dsp de un int lea todo correctamente con espacio y no salte línea
        System.out.println("Ingrese el título: ");
        lib1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor: ");
        lib1.setAutor(leer.nextLine());
        System.out.println("Ingrese el número de páginas: ");
        lib1.setNumeroPag(leer.nextInt());
        
        
        System.out.println("ISBN: " + lib1.getISBN());
        System.out.println("Título: " + lib1.getTitulo());
        System.out.println("Autor: " + lib1.getAutor());
        System.out.println("Número de páginas: " + lib1.getNumeroPag());
        
        //uno u otro
        
        System.out.println(lib1.toString());
    }
    
}
