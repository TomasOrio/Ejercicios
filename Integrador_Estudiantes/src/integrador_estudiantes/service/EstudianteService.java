/*
 * Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el 
 * examen final. La escuela nos ha pedido que calculemos el promedio de notas 
 * final de todos sus alumnos y saber qué alumnos han recibido una nota por 
 * encima de ese promedio.
 *
 * Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos 
 * van a ser nombre y nota (representando la nota obtenida en el final). 
 * 
 * La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 
 * estudiantes con sus respectivas notas.
 * 
 * Una vez creado los estudiantes deberemos guardar los estudiantes en un 
 * arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las 
 * dos tareas que nos ha pedido la escuela.
 * a)Calcular y mostrar el promedio de notas de todo el curso
 * b)Retornar otro arreglo con los nombre de los alumnos que recibieron una 
 * nota mayor al promedio del curso
 * c)Por último, deberemos mostrar todos los estudiantes con una nota 
 * mayor al promedio.
 * 
 * Nota: para crear un vector de objetos la definición es la siguiente:
 * Objeto nombreVector[] = new Objeto[];
 */
package integrador_estudiantes.service;

import integrador_estudiantes.entidades.Estudiante;
import java.util.Scanner;

public class EstudianteService {
    Scanner leer = new Scanner(System.in);
    
    public void calcularPromedio(Estudiante e[]) {
        int suma = 0;
        double prom;
        
        for (int i = 0; i < e.length; i++) {
            suma += e[i].getNota();
        }
        prom = suma/8;
        System.out.println("El promedio total de los alumnos es: " + prom);
        
        System.out.println("Alumnos con nota mayor al promedio: ");
        int cont = 1;
        
        for (int i = 0; i < e.length; i++) {
            if(e[i].getNota() > prom){
                System.out.println(cont+"- "+e[i].getNombre());
                cont++;
            }
        }
        
    }
}