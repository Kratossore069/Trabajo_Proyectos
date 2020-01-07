/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */

//PRÁCTICA PENSADA PARA ENTENDER LA HERENCIA
class Persona{

    
    private int edad;
    private String nombre;
    private int dni;
    
    public Persona(String nombre, int edad, int dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
}
public class Heredar extends Persona{ //Heredar hereda de Persona
    private int numero;
    
    public Heredar(int edad, String nombre, int dni, int numero){
        super(nombre, edad, dni); //Necesario para nombrar a la otra clase
        this.numero = numero;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nDni: "+getDni()+
                "\nNúmero: "+numero); //Requiere o usar protected o los getter
    }
    
    public static void main(String[] args) {
        Heredar estudiante = new Heredar(15,"Juan",125478, 50);
        
        estudiante.mostrar();
    }
}
