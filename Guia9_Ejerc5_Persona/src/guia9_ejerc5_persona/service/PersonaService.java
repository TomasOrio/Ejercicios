/*
 * 5)Implemente la clase Persona en el paquete entidades. Una persona tiene 
 * un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
 * constructor parametrizado, get y set. Crear una clase PersonaService, 
 * en el paquete servicio, con los siguientes métodos:
 * a)Método crearPersona que pida al usuario Nombre y fecha de 
 * nacimiento de la persona a crear. Retornar el objeto Persona creado.
 * b)Método calcularEdad que calcule la edad del usuario utilizando el 
 * atributo de fecha de nacimiento y la fecha actual.
 * c)Método menorQue recibe como parámetro una Persona y una edad. 
 * Retorna true si la persona es menor que la edad consultada o false en caso contrario.
 * d)Método mostrarPersona que muestra la información de la persona deseada.
 */
package guia9_ejerc5_persona.service;

import guia9_ejerc5_persona.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    
    Scanner leer = new Scanner(System.in);
    Date d = new Date();
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el día de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int anio = leer.nextInt();
        
        return new Persona(nombre, new Date(anio-1900,mes-1,dia,10,40,28));
    }
    
    public int edad(Persona p){
        
        int edad = d.getYear() - p.getFechaNacimiento().getYear();
        if(p.getFechaNacimiento().getMonth()>=d.getMonth()){
            if(p.getFechaNacimiento().getDate()>=d.getDate()){
                edad-=1;
            }
        }
        return edad;
    }
    
    public boolean menorQue(Persona p, int edad){ 
        System.out.println("Ingrese una edad a consultar: ");
        int edad1 = leer.nextInt();
        return edad < edad1;
    }
    
    public void mostrarPersona(Persona p, int edad){
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + p.getFechaNacimiento());
        System.out.println("Edad: " + edad);
    }
}
