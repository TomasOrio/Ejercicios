/*
 * 2)Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
 * alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer con sus 3 notas.
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
 * toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
 * pregunta al usuario si quiere crear otro Alumno o no.
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
 * final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
 * del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
 * promedio final, devuelto por el método y mostrado en el main.
 */
package guia10_collecciones.service;

import guia10_collecciones.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    
    ArrayList<Alumno> alumnos = new ArrayList();
    Scanner leer = new Scanner(System.in);
    
    
    public void crearAlumno(){
        String respuesta = "";
        
        while(!respuesta.equalsIgnoreCase("n")){
            Alumno a = new Alumno();
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = leer.next();
            System.out.println("Ingrese sus 3 notas: ");
            System.out.print("1: ");
            Integer nota1 = leer.nextInt();
            System.out.print("2: ");
            Integer nota2 = leer.nextInt();
            System.out.print("3: ");
            Integer nota3= leer.nextInt();
            
            ArrayList<Integer> aux = new ArrayList();
            aux.add(nota1);aux.add(nota2);aux.add(nota3);
            a.setNombre(nombre);
            a.setNotas(aux);
            alumnos.add(a);
            
            System.out.println("¿Desea crear otro alumno? (S/N)");
            respuesta = leer.next();
        }
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }        
    }
    
    public double calcularNota(String nombre){
        double promedio = 0;
        for (Alumno alumno : alumnos){
            if(alumno.getNombre().equals(nombre)){
                promedio =((alumno.getNotas().get(0)+alumno.getNotas().get(1)
                        + alumno.getNotas().get(2))/3);
            }
        }
        return promedio;
    }
    
    public double notaFinal(){
        System.out.println("Ingrese el nombre de uno de los alumnos para saber el promedio: ");
        String nombre = leer.next();
        double prom = 0;
        int cont = 0;
        for (Alumno alumno : alumnos){
            if(alumno.getNombre().equals(nombre)){
                prom = calcularNota(nombre);
                cont --;
            }
            cont ++;
            if(cont == alumnos.size()){
                System.out.println("El nombre no se encuentra en la lista.");
                break;
            }
        }
        
        return prom;
    }
}
