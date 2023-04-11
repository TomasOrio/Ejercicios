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
package guia8_ejercex1_raices.service;

import guia8_ejercex1_raices.entidades.Raices;

public class RaicesService {
    
    public double getDiscriminante(Raices r1){
        return Math.pow(r1.getB(),2) - 4 * r1.getA() * r1.getC();
    }
    
    public boolean tieneRaices(double discri){
        return discri > 0;
    }
    
    public boolean tieneRaiz(double discri){
        return discri == 0;
    }
    
    public void obtenerRaices(RaicesService rs, double discri, Raices r){
        if (rs.tieneRaices(discri)== true){
            System.out.println("Primera solución: ");
            System.out.println(-r.getB()+Math.sqrt(discri)/(2*r.getA()));
            System.out.println("Segunda solucion: ");
            System.out.println(-r.getB()-Math.sqrt(discri)/(2*r.getA()));
        }
    }
    
    public void obtenerRaiz(RaicesService rs, double discri, Raices r){
        if (rs.tieneRaiz(discri) == true ){
            System.out.println("Única solución: ");
            System.out.println(-r.getB()/(2*r.getA()));
        }
    }
    
    public void calcular(RaicesService rs, double discri, Raices r){
        if(rs.tieneRaices(discri)){
            rs.obtenerRaices(rs, discri, r);
        } else if(rs.tieneRaiz(discri)){
            rs.obtenerRaiz(rs, discri, r);
        } else {
            System.out.println("No tiene soluciones posibles.");
        }
    }
}
