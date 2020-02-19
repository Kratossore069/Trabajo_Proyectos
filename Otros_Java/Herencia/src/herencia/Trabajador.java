/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Trabajador extends Persona{
    
    private int sueldo;
    
    public Trabajador(int edad, String nombre, int sueldo) {
        super(edad, nombre);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
