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

class Perro{
    double peso;
    String nombre, raza;
    private String pulmones;
    private int edad;
    
    void operarPulmones(String nuevosPulmones){
        pulmones = nuevosPulmones;
    }
    
    void cumpleanios(){
        edad++;
    }
    
    void mostrar(){
        System.out.println("Nombre: "+nombre+" Raza: "+raza+" Peso: "+peso+" Edad: "+edad);
        System.out.println("Pulmones: "+pulmones);
    }
}
public class MiMain {
    public static void main(String[] args) {
        
        Perro perro = new Perro();
        
        perro.nombre = "Fufi";
        perro.peso = 30;
        perro.raza = "Labrador";
        perro.operarPulmones("Nuevos pulmones");
        
        perro.mostrar();
        perro.cumpleanios();
        
        //Persona p = new Persona();
        //Persona a = new Persona();
        
       /* p.apellido = "Martín";
        p.nombre = "Juan";
        p.edad = 21;
        
        System.out.println(p.apellido+" "+p.nombre+" "+p.edad);*/
    }
}
