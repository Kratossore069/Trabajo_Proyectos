/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */

class Profesor{
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean soltero;
    private boolean especialista;
    
    public Profesor(String n, String a, int e, boolean s, boolean esp){ //CONSTRUCTOR QUE RECIBE PARÁMETROS
        n = nombre;
        a = apellidos;
        e = edad;
        s = soltero;
        esp = especialista;
    }
    
    public Profesor(){ //CONSTRUCTOR QUE NO RECIBE NADA
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSoltero() {
        return soltero;
    }

    public void setSoltero(boolean soltero) {
        this.soltero = soltero;
    }

    public boolean isEspecialista() {
        return especialista;
    }

    public void setEspecialista(boolean especialista) {
        this.especialista = especialista;
    }
}

public class Prct07 {
    public static void main(String[] args){
        /*Práctica 7: Define una clase Profesor con atributos: nombre (String), apellidos (String),
        edad (int), soltero (boolean), especialista (boolean). Define un constructor que reciba los
        parámetros necesarios para la inicialización y otro constructor que no reciba parámetros.
        Crea los métodos getter y setter para poder establecer y obtener los valores de los atributos.*/
        
        
    }
}
