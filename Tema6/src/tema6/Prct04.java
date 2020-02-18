/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */

class Gente {

    protected String nombre;
    protected String apellidos;
    
    public Gente(String nom, String ape){
        nom = nombre;
        ape = apellidos;
    }
}

class Profe extends Gente {

    String curso;
    double notaMedia;
    
    public Profe(String nombre, String apelli, String cur, double not){
        super(nombre, apelli);
        cur = curso;
        not = notaMedia;
        
    }
    
    
}

public class Prct04 {
    
    
    /*
    Práctica 4: Crear un constructor para la clase Profesor que también heredaba de Persona.
    Hacer uso de super() para este constructor
    */
}
