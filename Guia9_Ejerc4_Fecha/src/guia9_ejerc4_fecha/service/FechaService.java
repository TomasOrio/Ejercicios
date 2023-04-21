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
package guia9_ejerc4_fecha.service;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese el día de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de su nacimiento: ");
        int anio = leer.nextInt();
        
        return new Date(anio-1900,mes-1,dia);
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    public int diferencia(Date a, Date b){
        int edad = b.getYear()-a.getYear();
        if(a.getMonth()>=b.getMonth()){
            if(a.getDate()>=b.getDate())
            edad-=1;
        }
        return edad;
    }
}
