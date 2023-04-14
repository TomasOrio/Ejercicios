/*
 * 1)Realizar una clase llamada Cadena, en el paquete de entidades, que 
 * tenga como atributos una frase (String) y su longitud. Agregar 
 * constructor vacío y con atributo frase solamente. Agregar getters y 
 * setters. El constructor con frase como atributo debe setear la longitud 
 * de la frase de manera automática. Crear una clase CadenaServicio en el 
 * paquete servicios que implemente los siguientes métodos:
 * a)Método mostrarVocales(), deberá contabilizar la cantidad de vocales 
 * que tiene la frase ingresada.
 * b)Método invertirFrase(), deberá invertir la frase ingresada y mostrarla 
 * por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
 * c)Método vecesRepetido(String letra), recibirá un carácter ingresado 
 * por el usuario y contabilizar cuántas veces se repite el carácter en la 
 * frase, por ejemplo:
 * Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces
 * d)Método compararLongitud(String frase), deberá comparar la longitud 
 * de la frase que compone la clase con otra nueva frase ingresada por el usuario.
 * e)Método unirFrases(String frase), deberá unir la frase contenida en la clase
 * Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
 * f)Método reemplazar(String letra), deberá reemplazar todas las letras
 * “a” que se encuentren en la frase, por algún otro carácter
 * seleccionado por el usuario y mostrar la frase resultante.
 * g)Método contiene(String letra), deberá comprobar si la frase contiene 
 * una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package guia9_ejerc1_cadena;

import guia9_ejerc1_cadena.entidades.Cadena;
import guia9_ejerc1_cadena.service.CadenaService;
import java.util.Scanner;

public class Guia9_Ejerc1_Cadena {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaService cs = new CadenaService();
        
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        Cadena c1 = new Cadena(frase);
        //System.out.println(c1.getLongitud() + " long /// " + c1.getFrase());
        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        cs.vecesRepetido(c1);
        
        System.out.println("Ingrese una nueva frase: ");
        frase = leer.nextLine();
        Cadena c2 = new Cadena(frase);
        
        cs.compararLongitud(c1, c2);
        cs.unirFrases(c1, c2);
        cs.reemplazar(c1);
        cs.contiene(c1);
    }
    
}
