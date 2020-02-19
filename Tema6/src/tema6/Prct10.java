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
class PruebaAbstracto {

    public static void main(String[] args) {
        Pajaro p = new Pajaro();
        Animal a = new Animalanimal(); //LAS CLASES ABSTRACTAS NO PUEDEN TENER UN NEW
    }
    //AQUÍ SALE UN ERROR DE NO PODER HACER POSIBLE UN NEW DE PAJARO
    //SE PUEDE USAR OBLIGATORIAMENTE UNA CLASE ABSTRACTA PARA QUE EL RESTO DE SUS HIJOS LO USEN
}

abstract class Animalanimal {

    protected String nombre;
    protected int edad;
    protected int peso;

    public Animalanimal() {
        System.out.println("jajaja! soy un animal!!!!");
    }
//private abstract String emitirSonido();
}

class Perrito extends Animalanimal {

    int dientes;
}

class Pajarito extends Animalanimal {

    double ala;
}

public class Prct10 {
    /*
    Práctica 10: Utiliza el código del ejemplo de abstract Animal en el IDE y ejecútalo. Toma
    captura de pantalla ¿hay alguna salida de pantalla ? ¿se puede utilizar el constructor de una
    clase abstracta ? Ahora trata de crear un objeto: new Animal() y toma captura de pantalla
    del error que da el IDE ¿ qué significa el error ?
     */
}
