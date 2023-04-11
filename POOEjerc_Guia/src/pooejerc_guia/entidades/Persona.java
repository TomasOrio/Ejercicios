package pooejerc_guia.entidades;

public class Persona {
    
    public String nombre;
    public String apodo;
    public int edad;
    public String nacionalidad;

    public Persona() {
    }
    
    //public Persona(String nombre, String apodo, int edad, String nacionalidad) {
    //    this.nombre = nombre;
    //    this.apodo = apodo;
    //    this.edad = edad;
    //    this.nacionalidad = nacionalidad;
    //}

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getNacionalidad(){
        return nacionalidad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apodo=" + apodo + ", edad=" + edad + ", nacionalidad=" + nacionalidad + '}';
    }

    
    
    
    
}
