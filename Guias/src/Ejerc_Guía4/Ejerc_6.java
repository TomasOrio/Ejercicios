/*
 * 6)Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 
 * 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son 
 * idénticas. Crear un programa que permita introducir un cuadrado por 
 * teclado y determine si este cuadrado es mágico o no. El programa 
 * deberá comprobar que los números introducidos son correctos, es decir, 
 * están entre el 1 y el 9.
 * Ej: 2 7 6 = filas, columas y diagonales = 15
 *     9 5 1 
 *     4 3 8
 */
package Ejerc_Guía4;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ejerc_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un número entre 1 y 9 para la posición ["+i+"]["+j+"].");
                int numero = leer.nextInt();
                
                while(numero < 1 || numero > 9){
                    System.out.println("Número incorrecto, ingrese otro número de 1 a 9 para"
                    + "la posición ["+i+"]["+j+"].");
                    numero = leer.nextInt();
                }
                matriz[i][j] = numero;
            }
        }
        
        int sumaColumna = 0, sumaFila = 0, cont = 0;
//        int sumaDiagPrincipal = (matriz[0][0] + matriz[1][1] + matriz[2][2]);
//        int sumaDiagSecundaria = (matriz[0][2] + matriz[1][1] + matriz[2][0]);
//        System.out.println("Diag 1: " + sumaDiagPrincipal);
//        System.out.println("Diag 2: " + sumaDiagSecundaria);

        int diagPrincipal[] = new int[3];
        int diagSecundaria[] = new int[3];
        // cualquier de las dos formas sirve para sacar la suma de las diagonales
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diagPrincipal[i] = matriz[i][j];
                }
                if (i + j == 2) {
                    diagSecundaria[i] = matriz[i][j];
                }
            }
        }

        int sumaDiagPrincipal = 0;
        int sumaDiagSecundaria = 0;

        for (int elemento : diagPrincipal) {
            //System.out.print("[" + elemento + "]");
            sumaDiagPrincipal += elemento;
        }
        //System.out.println("");
        //System.out.println("suma 1: "+ sumaDiagPrincipal);

        for (int elemento : diagSecundaria) {
            //System.out.print("[" + elemento + "]");
            sumaDiagSecundaria += elemento;
        }
        //System.out.println("");
        //System.out.println("suma 2: "+ sumaDiagSecundaria);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
                //System.out.println("fila: "+ sumaFila + "/// columna: "+ sumaColumna);
            }
            if (sumaFila == sumaColumna) {
                if (sumaFila == sumaDiagPrincipal) {
                    if (sumaFila == sumaDiagSecundaria) {
                        cont++;
                        sumaFila = 0;
                        sumaColumna = 0;
                        if (cont == 3) {
                            System.out.println("Su cuadrado es mágico.");
                        }
                    } else {
                        System.out.println("NO es mágico.");
                        return;
                    }
                } else {
                    System.out.println("NO es mágico.");
                    return;
                }
            } else {
                System.out.println("NO es mágico.");
                return;
            }
        }
        
        
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}
