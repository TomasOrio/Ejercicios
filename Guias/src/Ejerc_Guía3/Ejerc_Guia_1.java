/*
 * Escribir un programa que procese una secuencia de caracteres ingresada por 
 * teclado y terminada en punto, y luego codifique la palabra o frase ingresada de 
 * la siguiente manera: cada vocal se reemplaza por el carácter que se indica en 
 * la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se 
 * mantienen sin cambios.
 * a e i o u
 * @ # $ % *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la 
 * codificación correspondiente. Utilice la estructura “según” para la
 * transformación. 
 * Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
 * La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package Ejerc_Guía3;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_Guia_1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase seguida de un punto: ");
        String frase = leer.nextLine();
        
        String fraseModificada = codificadorFrase(frase);
        System.out.println(fraseModificada);
        
    }
    
    public static String codificadorFrase (String frase){
        frase = frase.replace('a','@').replace('e','#')
               .replace('i','$').replace('o','%').replace('u', '*')
               .replace('A','@').replace('E','#')
               .replace('I','$').replace('O','%').replace('U', '*');
         return frase;
    }
    
}
