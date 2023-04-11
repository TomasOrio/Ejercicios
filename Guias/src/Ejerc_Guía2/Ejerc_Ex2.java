/*
 * 2)Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
 * diferente a cada una. A continuación, realizar las instrucciones
 * necesarias para que: B tome el valor de C, C tome el valor de A, A tome
 * el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
 * valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 variables: ");
        int a = leer.nextInt();
        int b = leer.nextInt();
        int c = leer.nextInt();
        int d = leer.nextInt();
        int aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("A: "+ a + " B: "+ b + " C: "+ c + " D: " + d);
        
    }
    
}
