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
 * 
 */
package guia9_ejercex2_ahorcado;

import guia9_ejercex2_ahorcado.service.AhorcadoService;

public class Guia9_EjercEx2_Ahorcado {

    public static void main(String[] args) {
        AhorcadoService as = new AhorcadoService();
        as.crearJuego();
        as.juego();
    }
    
}
