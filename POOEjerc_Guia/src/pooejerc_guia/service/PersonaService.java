package pooejerc_guia.service;

import pooejerc_guia.entidades.Persona;

public class PersonaService {
    
    public void MostrarPersona(Persona p1){
        
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Apodo: " + p1.getApodo());
        System.out.println("Nombre: " + p1.getNacionalidad());
        
        
    }
    
}
