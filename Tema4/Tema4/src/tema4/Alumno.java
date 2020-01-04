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
public class Alumno {
    
    String nombre;
    int edad;
    public static final String DIRECCION = "Calle de Las Cabezas Nº7";
    
    void mostrar(){
        System.out.println("Nombre: "+nombre+" Edad: "+edad+" Dirección: "+DIRECCION);
    }
    
    public static void aprobar(){
        System.out.println(1+(int)Math.random()*10);
    }
    
    public String toString(String algo){
        return algo.toString();
    }
}
