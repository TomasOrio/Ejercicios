/*
 * 2)Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual 
 * deberá contener como atributos, un vector con la palabra a buscar, la 
 * cantidad de letras encontradas y la cantidad jugadas máximas que 
 * puede realizar el usuario. Definir los siguientes métodos en 
 * AhorcadoService:
 * a)Metodo crearJuego(): le pide la palabra al usuario y cantidad de 
 * jugadas máxima. Con la palabra del usuario, pone la longitud de la 
 * palabra, como la longitud del vector. Después ingresa la palabra en el 
 * vector, letra por letra, quedando cada letra de la palabra en un índice 
 * del vector. Y también, guarda la cantidad de jugadas máximas y el
 * valor que ingresó el usuario.
 * b)Método longitud(): muestra la longitud de la palabra que se debe
 * encontrar. Nota: buscar como se usa el vector.length.
 * c)Método buscar(letra):  este método recibe una letra dada por el
 * usuario y busca si la letra ingresada es parte de la palabra o no.
 * También informará si la letra estaba o no.
 * d)Método encontradas(letra):  que reciba una letra ingresada por el 
 * usuario y muestre cuantas letras han sido encontradas y cuántas le 
 * faltan. Este método además deberá devolver true si la letra estaba y 
 * false si la letra no estaba, ya que, cada vez que se busque una letra 
 * que no esté, se le restará uno a sus oportunidades.
 * e)Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
 * f)Método juego(): el método juego se encargará de llamar todos los 
 * métodos previamente mencionados e informará cuando el usuario 
 * descubra toda la palabra o se quede sin intentos. Este método se 
 * llamará en el main.
 */
package guia9_ejercex2_ahorcado.service;

import guia9_ejercex2_ahorcado.entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    Scanner leer = new Scanner(System.in);
    Ahorcado a = new Ahorcado();
    int contNo = 0;
    
    public void crearJuego(){
        
        System.out.println("Ingrese la frase a adivinar: ");
        String frase = leer.next();
        System.out.println("Ingrese la cantidad de jugadas máximas: ");
        a.setJugadasMax(leer.nextInt());
        String[] fraseVec = new String[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            fraseVec[i] = frase.substring(i, i+1);
        }
        a.setPalabra(fraseVec);
    }
    
    public void longitud(){
        System.out.println("La longitud de la palabra es: " + a.getPalabra().length);
    }
    
    public void buscar(String letra){        
        String palabraAux = "";
        for (int i = 0; i < a.getPalabra().length; i++) {
            palabraAux += a.getPalabra()[i];
        }
        if (palabraAux.contains(letra)){
            System.out.println("La letra se encuentra en la palabra.");
        } else {
            System.out.println("La letra no se encuentra en la palabra.");
        }
    }
    
    public boolean encontradas(String letra){
        String palabraAux = "";
        for (int i = 0; i < a.getPalabra().length; i++) {
            palabraAux += a.getPalabra()[i];
        }
        if (palabraAux.contains(letra)){
            a.setLetrasEncontradas(a.getLetrasEncontradas()+1);
        } else {
            contNo+=1;
        }
        System.out.println("Número de letras (encontradas,faltantes): ("+a.getLetrasEncontradas()+", "+contNo+").");
        
        return palabraAux.contains(letra);
    }
    
    public void intentos(){
        if(a.getJugadasMax() > 0){
            System.out.println("Le quedan " + a.getJugadasMax() + " intentos.");
        }else{
            System.out.println("Ya no hay más oportunidades.");
            System.out.println("La palabra era: ");
            System.out.print("'");
            for (int i = 0; i < a.getPalabra().length; i++) {
                System.out.print(a.getPalabra()[i]);
            }
            System.out.println("'");
        }
    }
    
    public void juego(){
        do{
            System.out.println("Ingrese una letra a buscar: ");
            String letra = leer.next();
            longitud();
            buscar(letra);
            if(!encontradas(letra)){
                a.setJugadasMax(a.getJugadasMax()-1);
            }
            intentos();
            System.out.println("----------------------------------");
            if(a.getLetrasEncontradas() == a.getPalabra().length){
                System.out.println("Felicidades, ganó! La palabra era: ");
                System.out.print("'");
                for (int i = 0; i < a.getPalabra().length; i++) {
                    System.out.print(a.getPalabra()[i]);
                }
                System.out.println("'");
                break;
            }
        }while(a.getJugadasMax() > 0);
    }
}
