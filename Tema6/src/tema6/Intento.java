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

abstract class Garaje{
    
    protected int matricula; //Fecha de matrícula
    protected String nombre;

    public Garaje(int matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

   
}

class Cochito extends Garaje{
    
    public Cochito(int matricula, String nombre) {
        super(matricula, nombre);
    }

    
}



public class Intento {}
