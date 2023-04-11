/*
 * 1)Vamos a realizar una clase llamada Raices, donde representaremos los
 * valores de una ecuación de 2º grado. Tendremos los 3 coeficientes 
 * como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores 
 * para construir el objeto a través de un método constructor. Luego, en 
 * RaicesServicio las operaciones que se podrán realizar son las siguientes:
 * 
 * a)Método getDiscriminante(): devuelve el valor del discriminante 
 * (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
 * b)Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
 * para que esto ocurra, el discriminante debe ser mayor o igual que 0.
 * c)Método tieneRaiz(): devuelve un booleano indicando si tiene una 
 * única solución, para que esto ocurra, el discriminante debe ser igual que 0.
 * d)Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, 
 * imprime las 2 posibles soluciones.
 * e)Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime 
 * una única raíz. Es en el caso en que se tenga una única solución posible.
 * f)Método calcular(): este método llamará tieneRaices() y a tieneRaíz(),
 * y mostrará por pantalla las posibles soluciones que tiene nuestra 
 * ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo 
 * que devuelvan nuestros métodos y en caso de no existir solución, se
 * mostrará un mensaje.
 * 
 * Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía 
 * el signo delante de -b
 */
package guia8_ejercex1_raices;

import guia8_ejercex1_raices.entidades.Raices;
import guia8_ejercex1_raices.service.RaicesService;
import java.util.Scanner;

public class Guia8_EjercEx1_Raices {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 3 valores para los coeficientes: ");
        System.out.print("A: ");
        double a = leer.nextDouble();
        System.out.print("B: ");
        double b = leer.nextDouble();
        System.out.print("C: ");
        double c = leer.nextDouble();
        Raices r1 = new Raices(a,b,c);
        
        RaicesService rs = new RaicesService();
        double discriminante = rs.getDiscriminante(r1);
        
        rs.calcular(rs, discriminante, r1);
        
    }
    
}
