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

class PersONA {

    private String nombre;
    private String apellidos;
    
    public PersONA(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}

class AlumNO extends PersONA {

    String curso;
    double notaMedia;
    
    public AlumNO(String nom, String ape){
        //nom = this.n
    }
    
    public void mostrar(){
        getApellidos();
        
        //SI LOS MÉTODOS ESTAŃ EN PRIVATE NO PUEDO USARLOS
    }
    
    
}

public class Prct03 {
    
    
    /*
    Práctica 3: Crear getter() y setter() en Persona Hacer uso desde desde estos métodos para
    un objeto de la clase Alumno Tomar captura de pantalla del IDE aparte del código
    */
}
