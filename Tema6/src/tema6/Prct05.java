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

class Animalillo{
    
    protected int patas;

    public Animalillo(int patas) {
        this.patas = patas;
    }
    
    
    
}

class Pajarillo extends Animalillo{
    
    public Pajarillo(int patas) {
        super(patas); //EL PROPIO IDE TE DICE QUE DEBES PONER UN CONSTRUCTOR
    }
    
    
    
}

class Perrillo extends Animalillo{
    
    public Perrillo(int patas) {
        super(patas);
    }
    
}



public class Prct05 {
    
    /*
    Práctica 5: Crear un constructor para Animal y un constructor para Pajaro y Perro. Hacer
uso de super() para esos constructores
    */
    
}
