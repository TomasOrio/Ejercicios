/*
 * 7)Realizar un programa que simule el funcionamiento de un dispositivo 
 * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las 
 * cadenas deben llegar con un formato fijo: tienen que ser de un máximo 
 * de 5 caracteres de largo, el primer carácter tiene que ser X y el último 
 * tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, 
 * la secuencia especial “&&&&&” marca el final de los envíos (llamémosla 
 * FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de 
 * lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
 * deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 */
package Ejerc_Guía2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase, frase1 = "&&&&&";
        int contCo = 0, contInco = 0;
        do{
            System.out.println("Ingrese una frase: ");
            frase = leer.nextLine();
            int longi = frase.length();
            String sub = frase.substring(0,1);
            String subLast = frase.substring(longi-1,longi);
            //System.out.println("1ra: " + sub + " 2da: " + subLast);
            if(sub.equals("X")){
                if(subLast.equals("O")){
                    if(longi>1 & longi <= 5){
                        contCo++;
                    }
                }
            }else{
                contInco++;
            }
            
            
        } while (!frase.equals(frase1));
        contInco-=1;
        System.out.println("Se realizaron " + contCo + " lecturas correctas.");
        System.out.println("Se realizaron " + contInco + " lecturas incorrectas.");
    }
    
}
