/*
 * 1)Crear una clase llamada Libro que contenga los siguientes atributos: 
 * ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
 * atributos pasados por parámetro y un constructor vacío. Crear un 
 * método para cargar un libro pidiendo los datos al usuario y luego informar
 * mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
 */
package ejerc1_libro.entidad;


public class Libro {
    
    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroPag;

    public Libro(int ISBN, String titulo, String autor, int numeroPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
    }
    
    public Libro(){
        
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    
    
    
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPag=" + numeroPag + '}';
    }
    
    
    
}
