package guia10_collecciones;

import guia10_collecciones.entidades.Libro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class Guia10_Collecciones {

    public static void main(String[] args) {
        //deteccion de errores + ejerc
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> ts = new TreeSet();
        HashMap<Integer,String> personas = new HashMap<>();
        
        //agregar 5 ejemplos de cada uno, list:
        int a = 1; int b = 2; int c = 3; int d = 4; int e = 5;
        listado.add(a); listado.add(b); listado.add(c); listado.add(d); listado.add(e);
        
        //set:
        String A = "a"; String B = "b"; String C = "c"; String D = "d"; String E = "e";
        ts.add(A); ts.add(B); ts.add(C); ts.add(D); ts.add(E);
        
        //map:
        int dniA = 1; int dniB = 2; int dniC = 3; int dniD = 4; int dniE = 5;
        String nombreA = "Tomas"; String nombreB = "Pedro"; String nombreC = "Juan";
        String nombreD = "Agustina"; String nombreE = "Azul";
        personas.put(dniA, nombreA); personas.put(dniB, nombreB); personas.put(dniC, nombreC);
        personas.put(dniD, nombreD); personas.put(dniE, nombreE);
        
        //eliminar 1 de cada uno
        listado.remove(0);
        ts.remove("a");
        personas.remove(1);
        
        //recorrer colecciones
        System.out.println("Lista: ");
        
        for (Integer numero : listado){
            System.out.println(numero);
        }
        System.out.println("---------------");
        System.out.println("Conjunto: ");
        for (String cadena : ts){
            System.out.println(cadena);
        }
        System.out.println("---------------");
        System.out.println("Mapa: ");
        for (Map.Entry<Integer, String> entry : personas.entrySet()){
            System.out.println("Documento: " + entry.getKey()
            + ", nombre: " + entry.getValue());
        }
        
        //detección errores
        HashMap<Integer,String> personas1 = new HashMap<>();
        String n1 = "Albus";
        String n2 = "Severus";
        int llave1 = 1;
        int llave2 = 2;
        personas1.put(llave1,n1);
        personas1.put(llave2,n2);
        
        //detección errores
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }
        
        //EJERCICIO LISTA LIBROS
        ArrayList<Libro> libros = new ArrayList();
        Libro libro1 = new Libro("Hola", "Pepito");
        Libro libro2 = new Libro("Chau", "Juancito");
        libros.add(libro1);
        libros.add(libro2);
        for(Libro ejemplar:libros){
            System.out.println(ejemplar);
        }
        
        
    }
}
