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


class SerVivo{
    int patas;          //Tiene que ser protected para heredarlo.
    String ruido;       //Si es private, solo afectará a su clase.
    int edad;
    boolean morir;
    
    public SerVivo(){
        System.out.println("Soy un ser vivo");
    }
}

public class Animal extends SerVivo {
    
    String nombre;

    public Animal(int patas, String ruido){     //El de la izquierda se queda con lo de la derecha.
        patas = this.patas;
        ruido = this.ruido;
    }
    
    public Animal(){
        System.out.println("Soy un animal");
    }
    
    
}


