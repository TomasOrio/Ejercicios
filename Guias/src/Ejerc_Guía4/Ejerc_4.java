/*
 * 4) Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
 * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz 
 * A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Ejerc_Guía4;

/**
 *
 * @author Tomas
 */
public class Ejerc_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];
        
        System.out.println("Matriz 1: ");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                matriz[i][j] = (int) (Math.random()*10+1);
                
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz transpuesta: ");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[i][j] = matriz[j][i];
                System.out.print("[" + matrizT[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
