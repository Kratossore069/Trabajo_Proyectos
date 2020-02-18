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
public class Abstracto {

    public static void main(String[] args) {
        Pajaro p = new Pajaro();
    }
}

abstract class Animalito {

    protected String nombre;
    protected int edad;
    protected int peso;

    public Animalito() {
        System.out.println("jajaja! soy un animal!!!!");
    }
//private abstract String emitirSonido();
}

class Perro extends Animal {

    int dientes;
}

class Pajaro extends Animal {

    double ala;
}
