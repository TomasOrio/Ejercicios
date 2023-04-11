/*
 * 6)Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y 
 * "salario". Luego, crea un método "calcular_aumento" que calcule el 
 * aumento salarial de un empleado en función de su edad y salario actual. 
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30 
 * años o del 5% si tiene menos de 30 años.
 */
package ejercex6_empleado.entidad;

import java.util.Scanner;

public class Empleado {
    
    Scanner leer = new Scanner(System.in);
    
    private String nombre;
    private int edad;
    private int salario;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void calcular_aumento(){
        System.out.println("Ingrese el nombre del empleado: ");
        nombre=leer.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = leer.nextInt();
        System.out.println("Ingrese su salario ");
        salario = leer.nextInt();
        
        if(edad >= 30){
            System.out.println("El empleado " + nombre + " cobra " + salario + ", pasará a cobrar " +
                              (salario + salario*0.10)+ " con el 10% de aumento.");
            
        } else {
            System.out.println("El empleado " + nombre + " cobra " + salario + ", pasará a cobrar " + 
                              (salario + salario*0.05) + " con el 5% de aumento.");
        }
    }
}
