/*
 * 3)Crear en el Main dos arreglos. El arreglo A de 50 números reales y el 
 * arreglo B de 20 números reales. Crear la clase ArregloService, en el 
 * paquete servicio, con los siguientes métodos:
 * a)Método inicializarA recibe un arreglo por parámetro y lo inicializa con
 * números aleatorios.
 * b)Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
 * c)Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
 * d)Método inicializarB copia los primeros 10 números del arreglo A en el 
 * arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 * En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, 
 * mostrar A y B.
 */
package guia9_ejerc3_arreglo.service;

import java.util.Arrays;

public class ArregloService {
    
    public void iniciarlizarA(double[] arreglo){
        Arrays.fill(arreglo,0,10, 4); //pongo cualquier número en lugar de random para que no sea tan largo
        Arrays.fill(arreglo,10,20, 6);
        Arrays.fill(arreglo,20,30, 7);
        Arrays.fill(arreglo,30,40, 9);
        Arrays.fill(arreglo,40,50, 3);
        //for (int i = 0; i < arreglo.length; i++) {      //con un for permite poner un random lugar por lugar, sino pone el mismo random del 0 al 10 por ej
        //  Arrays.fill(arreglo,i,i+1,Math.random());
        //  System.out.println("["+arreglo[i]+"]");
        //}
    }
    
    public void mostrar(double[] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
    
    public void ordenar(double[] arreglo){
        Arrays.sort(arreglo);
    }
    
    public void inicializarB(double[] arreglo1, double[] arreglo2){
        Arrays.fill(arreglo1,0,10,arreglo2[0]);
        Arrays.fill(arreglo1,10,20, 0.5);
    }
}
