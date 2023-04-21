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
package guia9_ejerc3_arreglo;

import guia9_ejerc3_arreglo.service.ArregloService;

public class Guia9_Ejerc3_Arreglo {

    public static void main(String[] args) {
        ArregloService as = new ArregloService();
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        as.iniciarlizarA(arregloA);
        as.mostrar(arregloA);
        as.ordenar(arregloA);
        as.inicializarB(arregloB, arregloA);
        System.out.println("Arreglo A: ");
        as.mostrar(arregloA);
        System.out.println("Arreglo B: ");
        as.mostrar(arregloB);
        
    }
    
}
