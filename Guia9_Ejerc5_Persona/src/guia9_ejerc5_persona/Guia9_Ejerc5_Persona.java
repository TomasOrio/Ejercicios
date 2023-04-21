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
package guia9_ejerc5_persona;

import guia9_ejerc5_persona.entidades.Persona;
import guia9_ejerc5_persona.service.PersonaService;

public class Guia9_Ejerc5_Persona {

    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();
        int edad = ps.edad(p1);
        System.out.println("La persona es menor que la edad consultada? " + ps.menorQue(p1, edad));
        ps.mostrarPersona(p1, edad);
    }
    
}
