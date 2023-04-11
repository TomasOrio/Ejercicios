/*
 * 3)Realizar una clase llamada Persona en el paquete de entidades que 
 * tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ 
 * para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro 
 * atributo, puede hacerlo. Agregar constructores, getters y setters.
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 metodos: 
 * a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La 
 * función devuelve un booleano.
 * b)Metodo crearPersona(): el método crear persona, le pide los valores 
 * de los atributos al usuario y después se le asignan a sus respectivos 
 * atributos para llenar el objeto Persona. Además, comprueba que el 
 * sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se 
 * deberá mostrar un mensaje.
 * c)Método calcularIMC(): calculara si la persona está en su peso ideal 
 * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un 
 * valor menor que 20, significa que la persona está por debajo de su 
 * peso ideal y la función devuelve un -1. Si la fórmula da por resultado 
 * un número entre 20 y 25 (incluidos), significa que la persona está en 
 * su peso ideal y la función devuelve un 0. Finalmente, si el resultado 
 * de la fórmula es un valor mayor que 25 significa que la persona tiene 
 * sobrepeso, y la función devuelve un 1.
 * A continuación, en la clase main hacer lo siguiente:
 * - Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la 
 * persona está en su peso ideal, tiene sobrepeso o está por debajo de su
 * peso ideal e indicar para cada objeto si la persona es mayor de edad.
 * - Por último, guardaremos los resultados de los métodos calcularIMC y 
 * esMayorDeEdad en distintas variables(arrays), para después calcular un 
 * porcentaje de esas 4 personas cuantas están por debajo de su peso, 
 * cuantas en su peso ideal y cuantos, por encima, y también calcularemos 
 * un porcentaje de cuantos son mayores de edad y cuantos menores. Para
 * esto, podemos crear unos métodos adicionales.
 */
package guia8_ejerc3_persona;

import guia8_ejerc3_persona.entidades.Persona;
import guia8_ejerc3_persona.service.PersonaService;

public class Guia8_Ejerc3_Persona {

    public static void main(String[] args) {
        
        PersonaService ps = new PersonaService();
        
        Persona p1 = ps.crearPersona();
        System.out.println("Es mayor de edad? " + ps.esMayorDeEdad(p1));
        ps.calcularIMC(p1);
        
        
        Persona p2 = ps.crearPersona();
        System.out.println("Es mayor de edad? " + ps.esMayorDeEdad(p2));
        ps.calcularIMC(p2);
        
        
        Persona p3 = ps.crearPersona();
        System.out.println("Es mayor de edad? " + ps.esMayorDeEdad(p3));
        ps.calcularIMC(p3);
        
        
        Persona p4 = ps.crearPersona();
        System.out.println("Es mayor de edad? " + ps.esMayorDeEdad(p4));
        ps.calcularIMC(p4);
        
        ps.promedioEdad();
        ps.promedioIMC();
        
    }
    
}
