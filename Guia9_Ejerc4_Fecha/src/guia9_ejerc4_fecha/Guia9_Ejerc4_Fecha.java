/*
 * 4)Vamos a usar la clase Date que ya existe en Java. Crearemos la clase 
 * FechaService, en paquete Servicios, que tenga los siguientes métodos:
 * a)Método fechaNacimiento que pregunte al usuario día, mes y año de 
 * su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
 * El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = 
 * new Date(anio, mes, dia);
 * b)Método fechaActual que cree un objeto fecha con el día actual. Para 
 * esto usaremos el constructor vacío de la clase Date. Ejemplo: Date 
 * fechaActual = new  Date();
 * El método debe retornar el objeto Date.
 * c)Método diferencia que reciba las dos fechas por parámetro y retorna 
 * la diferencia de años entre una y otra (edad del usuario).
 */
package guia9_ejerc4_fecha;

import guia9_ejerc4_fecha.service.FechaService;
import java.util.Date;

public class Guia9_Ejerc4_Fecha {

    public static void main(String[] args) {
        FechaService fs = new FechaService();
        Date d = fs.fechaNacimiento();
        Date actual = fs.fechaActual();
        System.out.println("Su edad es: " + fs.diferencia(d, actual));
    }
    
}
