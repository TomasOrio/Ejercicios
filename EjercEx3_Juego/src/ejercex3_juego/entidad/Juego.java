/*
 * 3) Crea una clase "Juego" que tenga un método "iniciar_juego" que permita 
 * a dos jugadores jugar un juego de adivinanza de números. El primer 
 * jugador elige un número y el segundo jugador intenta adivinarlo. El 
 * segundo jugador tiene un número limitado de intentos y recibe una pista 
 * de "más alto" o "más bajo" después de cada intento. El juego termina 
 * cuando el segundo jugador adivina el número o se queda sin intentos. 
 * Registra el número de intentos necesarios para adivinar el número y el 
 * número de veces que cada jugador ha ganado.
 */
package ejercex3_juego.entidad;

import java.util.Scanner;

public class Juego {
    
    Scanner leer = new Scanner(System.in);
    
    private int numero1;
    private int numero2;
    
    
    public Juego(){
        
    }
    
    public int getNumero1(){
        return numero1;
    }
    
    public int getNumero2(){
        return numero2;
    }
    
    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }
    
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
    
    public void iniciar_juego(){
        
        int contJug1 = 0, contJug2 = 0, contIntentos = 0;
        String rta = "";
        
        do{
            System.out.println("Jugador 1, ingrese un número: ");
            numero1 = leer.nextInt();
            
            for (int i = 5; i > 0; i--) {
                System.out.println("Jugador 2, ingrese un número, tiene " + i + " intentos." );
                numero2 = leer.nextInt();
                if(numero2>numero1 && contIntentos < 4){
                    System.out.println("Más bajo que ese número");
                } else if (numero2 < numero1 && contIntentos < 4){
                    System.out.println("Más alto que ese número");
                } else if (numero2 == numero1){
                    contIntentos += 1;
                    System.out.println("Acertó! El número era " + numero1 + ", lo adivinó en " + contIntentos + " intentos.");
                    contJug2 += 1;
                    break;
                }
                contIntentos += 1;
                if (contIntentos == 5){
                    contJug1 += 1;
                }
            }
            contIntentos = 0;
            
            System.out.println("Desean continuar jugando? (s/n)");
            rta = leer.next();
        }while(!rta.equalsIgnoreCase("n"));
        
        System.out.println("El jugador 1 ganó: " + contJug1 );
        System.out.println("El jugador 2 ganó: " + contJug2 );
        
        
    }
    
}
