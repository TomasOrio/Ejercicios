/*
 * 1)Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
 * Se deberá definir además dos constructores: uno vacío que inicializa el 
 * título y el autor a cadenas vacías y otro que reciba como parámetros el 
 * título y el autor de la canción. Se deberán además definir los métodos 
 * getters y setters correspondientes.
 */
package ejercex1_cancion;

import ejercex1_cancion.entidad.Cancion;

public class EjercEx1_Cancion {

    public static void main(String[] args) {
        
        Cancion canc1 = new Cancion();
        Cancion canc2 = new Cancion("Hey mor","Ozuna & Feid");
        
        System.out.println("Canción 1: " + canc1.getAutor() + " - " + canc1.getTitulo() + ".");
        System.out.println("Canción 2: " + canc2.getAutor() + " - " + canc2.getTitulo() + ".");
        
        canc1.setAutor("Quevedo"); canc1.setTitulo("Punto G");
        
        System.out.println("Canción 1: " + canc1.getAutor() + " - " + canc1.getTitulo() + ".");
    }
    
}
