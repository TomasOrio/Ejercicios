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
package guia9_ejerc1_cadena.service;

import guia9_ejerc1_cadena.entidades.Cadena;
import java.util.Scanner;

public class CadenaService {
    Scanner leer = new Scanner(System.in);
    
    public void mostrarVocales(Cadena c1){
        int vocales = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            
            if (c1.getFrase().substring(i,i+1).equalsIgnoreCase("a")){
                vocales ++;
            } else if (c1.getFrase().substring(i,i+1).equalsIgnoreCase("e")){
                vocales ++;
            } else if (c1.getFrase().substring(i,i+1).equalsIgnoreCase("i")){
                vocales ++;
            } else if (c1.getFrase().substring(i,i+1).equalsIgnoreCase("o")){
                vocales ++;
            } else if (c1.getFrase().substring(i,i+1).equalsIgnoreCase("u")){
                vocales ++;
            }
        }
        System.out.println("La frase tiene "+vocales+" vocales.");
    }
    
    public void invertirFrase(Cadena c1){
        String frase = c1.getFrase();
        String fraseAux = "";
        for (int i = c1.getLongitud(); i > 0; i--) {
            fraseAux += frase.substring(i-1,i);
            //System.out.println(fraseAux);
        }
        System.out.println("Frase invertida: " + fraseAux);
    }
    
    public void vecesRepetido(Cadena c1){
        String frase = c1.getFrase();
        System.out.println("Ingrese la letra a buscar: ");
        String letra = leer.next();
        int veces = 0;
        
        for (int i = 0; i < c1.getLongitud(); i++) {
            if(frase.substring(i,i+1).equalsIgnoreCase(letra)){
                veces ++;
            }
        }
        if (veces == 0){
            System.out.println("La letra '" + letra + "' no se encontró en su frase.");
        } else if (veces == 1){
            System.out.println("La letra '" + letra + "' se encontró 1 vez.");
        } else if (veces >= 2){
            System.out.println("La letra '" + letra + "' se encontró " + veces + " veces.");
        }
    }
    
    public void compararLongitud(Cadena c1, Cadena c2){
        String frase = c1.getFrase();
        String frase1 = c2.getFrase();
        //int comparacion = frase.compareTo(frase1);
        int comparacion = (frase.length())-(frase1.length());
        
        if(comparacion <= -1){
            System.out.println("La segunda frase es mayor.");
        } else if (comparacion == 0){
            System.out.println("Las frases tienen la misma longitud.");
        } else if (comparacion >= 1){
            System.out.println("La primer frase es mayor.");
        }
    }
    
    public void unirFrases(Cadena c1, Cadena c2){
        String frases = c1.getFrase().concat(c2.getFrase());
        System.out.println("Frases unidas: " + frases);
    }
    
    public void reemplazar(Cadena c1){
        String frase = c1.getFrase();
        System.out.println("Ingrese un carácter para reemplazar las 'a': ");
        String letra = leer.next();
        String fraseAux = "";
        
        for (int i = 0; i < frase.length(); i++) {
            
            if(frase.substring(i, i+1).equalsIgnoreCase("a")){
                fraseAux += letra;
            } else{
                fraseAux += frase.substring(i, i+1);
            }
            
        }
        System.out.println("Frase con 'a' reemplazada: ");
        System.out.println(fraseAux);
    }
    
    public void contiene(Cadena c1){
        String frase = c1.getFrase();
        System.out.println("Ingrese un carácter a encontrar: ");
        String letra = leer.next();
        boolean contiene = false;
        for (int i = 0; i < frase.length(); i++) {
            
            if(frase.substring(i,i+1).equalsIgnoreCase(letra)){
                contiene = true;
                break;
            }
        }
        System.out.println("La frase contiene '" + letra + "'? " + contiene);
    }
}
