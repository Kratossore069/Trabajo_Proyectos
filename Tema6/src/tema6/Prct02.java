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
class PersoNA {

    private String nombre;
    private String apellidos;
}

class AlumnO extends PersoNA {

    String curso;
    double notaMedia;
    
    public AlumnO(String nom, String ape){
        //nom = this.n
    }
    
    //DE NINGUNA MANERA PUEDO ACCEDER A LOS ATRIBUTOS DE PERSONA SI ESTÁN EN PRIVATE
}

public class Prct02 {

    /*
    Práctica 2: Poner los atributos de la clase persona a private. Tratar de acceder desde la
clase Alumno a esos atributos que antes heredaba. Toma captura de pantalla de los mensajes
del IDE. Para ello, por ejemplo, puedes crear un método en alumno y llamar a this.nombre
desde el método.
     */
}
