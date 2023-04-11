/*
 * 3)Realizar una clase llamada Persona en el paquete de entidades que 
 * tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ 
 * para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro 
 * atributo, puede hacerlo. Agregar constructores, getters y setters.
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 metodos: 
 * a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La 
 * función devuelve un booleano.
 * b)Metodo crearPersona(): el método crear persona, le pide los valores 
 * de los atributos al usuario y después se le asignan a sus respectivos 
 * atributos para llenar el objeto Persona. Además, comprueba que el 
 * sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se 
 * deberá mostrar un mensaje.
 * c)Método calcularIMC(): calculara si la persona está en su peso ideal 
 * (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un 
 * valor menor que 20, significa que la persona está por debajo de su 
 * peso ideal y la función devuelve un -1. Si la fórmula da por resultado 
 * un número entre 20 y 25 (incluidos), significa que la persona está en 
 * su peso ideal y la función devuelve un 0. Finalmente, si el resultado 
 * de la fórmula es un valor mayor que 25 significa que la persona tiene 
 * sobrepeso, y la función devuelve un 1.
 * A continuación, en la clase main hacer lo siguiente:
 * - Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la 
 * persona está en su peso ideal, tiene sobrepeso o está por debajo de su
 * peso ideal e indicar para cada objeto si la persona es mayor de edad.
 * - Por último, guardaremos los resultados de los métodos calcularIMC y 
 * esMayorDeEdad en distintas variables(arrays), para después calcular un 
 * porcentaje de esas 4 personas cuantas están por debajo de su peso, 
 * cuantas en su peso ideal y cuantos, por encima, y también calcularemos 
 * un porcentaje de cuantos son mayores de edad y cuantos menores. Para
 * esto, podemos crear unos métodos adicionales.
 */
package guia8_ejerc3_persona.service;

import guia8_ejerc3_persona.entidades.Persona;
import java.util.Scanner;

public class PersonaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int[] vecPeso = new int[4];
    int[] vecEdad = new int[4];
    int contPeso = 0;
    int contEdad = 0;
    //int contMenorEdad = 0; lo rehice porque había que hacerlo con array el % de mayores de edad.
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        //p1.setNombre(leer.nextLine());
        System.out.println("Edad: ");
        int edad = leer.nextInt();
        //p1.setEdad(leer.nextInt());
        System.out.println("Sexo (H/M/O): ");
        String sexoRta = leer.next();
        while(!sexoRta.equalsIgnoreCase("h")&&!sexoRta.equalsIgnoreCase("m")&&!sexoRta.equalsIgnoreCase("o")){
            System.out.println("Opción incorrecta, Hombre(H), Mujer(M), Otro(O)");
            sexoRta = leer.next();
        }
        //p1.setSexo(sexoRta);
        System.out.println("Peso: ");
        double peso = leer.nextDouble();
        //p1.setPeso(leer.nextDouble());
        System.out.println("Altura: ");
        double altura = leer.nextDouble();
        //p1.setAltura(leer.nextDouble());
        
        return new Persona(nombre, edad, sexoRta, peso, altura);
    }
       
    public boolean esMayorDeEdad(Persona p){
        if (p.getEdad() >= 18) {
            vecEdad[contEdad] = 1;
            contEdad+=1;
            return true;
        } else {
            vecEdad[contEdad] = 0;
            contEdad+=1;
            return false;
        }
    }
    
    public double calcularIMC(Persona p){
        double peso = p.getPeso();
        double altura = p.getAltura();
        double imc = peso/(Math.pow(altura, 2));
        System.out.println(imc);
        
        if(imc < 20){
            System.out.println("Está por debajo de su peso ideal.");
            vecPeso[contPeso] = -1;
            contPeso += 1;
            return -1;
        } else if(imc >= 20 && imc <= 25){
            System.out.println("Está en su peso ideal.");
            vecPeso[contPeso] = 0;
            contPeso += 1;
            return 0;
        } else {
            System.out.println("Tiene sobrepeso/obesidad.");
            vecPeso[contPeso] = 1;
            contPeso += 1;
            return 1;
        }
    }
    
    public void promedioEdad(){
        int acumulador = 0;
        for (int i = 0; i < 4; i++) {
            acumulador += vecEdad[i];
            //System.out.println("Acumulador: " + acumulador);
        }
        
        System.out.println("El "+(acumulador*100/4)+"% de las personas son mayor de edad.");  
//       if(p.getEdad()>=18){
//           contEdad+=1;
//       } else {
//           contMenorEdad+=1;
//       }
//       
//       if(contEdad+contMenorEdad==4){
//        System.out.println("El "+(contEdad*100/4)+"% de las personas son mayor de edad.");   
//       }
    }
    
    public void promedioIMC(){
        int contBajo = 0;
        int contNormal = 0;
        int contSobrepeso = 0;
        
        for (int i = 0; i < 4; i++) {
            
            switch(vecPeso[i]){
                case -1:
                    contBajo+=1;
                    break;
                case 0:
                    contNormal+=1;
                    break;
                case 1:
                    contSobrepeso+=1;
                    break;
            }
//            if(vecPeso[i] == -1){
//                contBajo += 1;
//            } else if(vecPeso[i] == 0){
//                contNormal += 1;
//            } else{
//                contSobrepeso += 1;
//            }
        }
        
        System.out.println("Porcentaje de personas con bajo IMC: " + (contBajo*100/4) + "%.");
        System.out.println("Porcentaje de personas con IMC normal: " + (contNormal*100/4) + "%.");
        System.out.println("Porcentaje de personas con sobrepeso u obesidad: " + (contSobrepeso*100/4) + "%.");
    }
}
