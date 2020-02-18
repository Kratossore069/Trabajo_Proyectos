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

class Personita{
    protected int edad;
    protected String nombre;
    protected String apellido;

    public Personita(int edad, String nombre, String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public void imprimirDatos(){
        System.out.println("Edad "+edad
        +" Nombre "+nombre+" Apellido "+apellido);
    }
}

class Alumnazo extends Personita{
    
    public Alumnazo(int edad, String nombre, String apellido) {
        super(edad, nombre, apellido);
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
    }
    
}

public class Prct06 {
    /*
    Práctica 6: Crear un método: void imprimirDatos() en Persona que mostrará en pantalla
    todos los atributos de Persona. Sobreescribir el método en Alumno y que haga uso de
    super.imprimirDatos()
    */
}
