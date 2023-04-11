/*
 * 5) Realice un programa que compruebe si una matriz dada es antisimétrica. 
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su  
 * propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si 
 * A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
 * obtiene cambiando sus filas por columnas (o viceversa).
 */
package Ejerc_Guía4;


/**
 *
 * @author Tomas
 */
public class Ejerc_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = {{0, -2 ,4},{2, 0, 2}, {-4, -2, 0}}; //inicializo como en el ejemplo
        int[][] matrizT = new int[3][3];                      //sino con randoms se complica

        System.out.println("Matriz 1: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

               //matriz[i][j] = (int) (Math.random() * 10 + 1);

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("Matriz transpuesta: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j] = matriz[j][i];
                System.out.print("[" + matrizT[i][j] + "]");
            }
            System.out.println("");
        }
        
        int cont = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (matriz[i][j]*-1 == matrizT[i][j]){
                    cont += 1;
                }
            }
        }
        if (cont == 9){
            System.out.println("Su matriz es antisimétrica.");
        } else{
            System.out.println("Su matriz NO es antisimétrica.");
        }
    }
}
