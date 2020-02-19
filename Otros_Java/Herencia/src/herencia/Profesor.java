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
public class Profesor extends Trabajador{
     private String especialidad;

    public Profesor(int edad, String nombre, int sueldo, String esp) {
        super(edad, nombre, sueldo);
        especialidad = esp;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override //Con esto se evita que salga la dirección de memoria
    public String toString() {
        return "Sueldo "+super.getSueldo()+" Especialidad "+this.especialidad;
    }
    
    
     
     
}
