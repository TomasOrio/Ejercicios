/*
 * 6)Un profesor particular está dando cursos para grupos de cinco alumnos
 * y necesita un programa para organizar la información de cada curso. 
 * Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
 * serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, 
 * turno (mañana o tarde),  precioPorHora y alumnos. Donde alumnos es un
 * arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los 
 * nombres de cada alumno. A continuación, se implementarán los siguientes métodos.
 * a)Un constructor por defecto.
 * b)Un constructor con todos los atributos como parámetro.
 * c)Métodos getters y setters de cada atributo.
 * d)Método cargarAlumnos(): este método le permitirá al usuario ingresar 
 * los alumnos que asisten a las clases. Nosotros nos encargaremos de 
 * almacenar esta información en un arreglo e iterar con un bucle, 
 * solicitando en cada repetición que se ingrese el nombre de cada alumno.
 * e)Método crearCurso(): el método crear curso, le pide los valores de 
 * los atributos al usuario y después se le asignan a sus respectivos 
 * atributos para llenar el objeto Curso. En este método invocamos al 
 * método cargarAlumnos() para asignarle valor al atributo alumnos
 * f)Método calcularGananciaSemanal(): este método se encarga de 
 * calcular la ganancia en una semana por curso. Para ello, se deben 
 * multiplicar la cantidad de horas por día, el precio por hora, la 
 * cantidad de alumnos y la cantidad de días a la semana que se repite 
 * el encuentro.
 */
package guia9_ejerc6_profesor.entidades;

import java.util.Scanner;

public class Curso {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String[] alumnos = new String[5];
    
    public Curso(){
        
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public String isTurno() {
        return turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    public void cargarAlumnos(){
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno [" + (i+1) + "].");
            alumnos[i] = leer.next();
        }
    }
    
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso: ");
        nombreCurso = leer.next();
        System.out.println("Ingrese la cantidad de horas por día: ");
        cantidadHorasPorDia = leer.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana: ");
        cantidadDiasPorSemana = leer.nextInt();
        System.out.println("Ingrese el turno (M/T): ");
        turno = leer.next();
        while(!turno.equalsIgnoreCase("m") && !turno.equalsIgnoreCase("t")){ 
            System.out.println("Turno incorrecto, ingrese nuevamente (M/T): ");
            turno = leer.next();
        }
        System.out.println("Ingrese el precio por hora: ");
        precioPorHora = leer.nextInt();
        cargarAlumnos();
        return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, alumnos);
    }
    
    public double calcularGananciaSemanal(){
        double resultado = cantidadHorasPorDia*precioPorHora*5*cantidadDiasPorSemana;
        return resultado;
    }
}
