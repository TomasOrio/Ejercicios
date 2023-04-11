package pooejerc_guia;

import pooejerc_guia.entidades.Persona;
import pooejerc_guia.service.PersonaService;



public class POOEjerc_Guia {

    public static void main(String[] args) {
        
        //Persona p1 = new Persona("Tomás", "Tomi", 25, "Argentino");
        Persona p1 = new Persona();
        p1.nombre = "Tomás";
        p1.apodo = "Tomi";
        p1.edad = 25;
        p1.nacionalidad = "Argentino";
        
        System.out.println(p1.toString());
        
        p1.setEdad(20);
        System.out.println(p1.edad);
        p1.setNacionalidad("Arg");
        System.out.println(p1.nacionalidad);
        
        System.out.println(p1.toString());
        PersonaService sm = new PersonaService();
        sm.MostrarPersona(p1);
    }
    
}
