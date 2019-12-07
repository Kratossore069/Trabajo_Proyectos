/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Víctor_Gabriel_Carvajal_Aróstegui
 */
public class Persona {
    
    //-------------------------------------------------------GETTER Y SETTER--------------------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    String nombre, apellido;
    int edad;
    
    // ------------------------------------------------CONSTRUCTOR------------------------------------------------------------------------------
    public Persona(String n, String a, int e){
        nombre = n;
        apellido = a;
        edad = e;
    }
}
