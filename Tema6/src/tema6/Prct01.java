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

class PersonA{
    protected String nombre; //Protected es necesario para hacer extends
    protected String apellido;
}

class Profesor extends PersonA{
    private int salario;
    private String especialidad;
    
    public Profesor(String nombre, String apellido, int salario, String especialidad){
        nombre = this.nombre;
        apellido = this.apellido;
        salario = this.salario;
        especialidad = this.especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{ nombre= "+this.nombre+"apellido= "+this.apellido+
                "salario=" + salario +
                ", especialidad=" + especialidad + '}';
    }
    
    
    
    
}



public class Prct01 {
    /*
    Práctica 1: Crear una clase Profesor, que hereda de Persona y contará con atributos como
nombre, apellidos, salario y especialidad
    */
    public static void main(String[] args) {
        
        Profesor a = new Profesor("Paco", "Collado", 1800, "Física");
        
        a.toString();
        
    }
    
    
    
}
