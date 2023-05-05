package guia10_collecciones.entidades;

public class Libro {
    
    private String titulo;
    private String autor;
    
    public Libro(){
        
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + " Título: '" + titulo + "', Autor: '" + autor + "'}";
    }
    
    
}
