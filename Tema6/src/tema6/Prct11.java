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
class PruebaAbstractito {

    public static void main(String[] args) {
        Pajaro p = new Pajaro();
        //Animal a = new AnImal();
    }

}

 abstract class AnImal { //SI NO ES ABSTRACTA NO SE PUEDE HACER OVERRIDE

    protected String nombre;
    protected int edad;
    protected int peso;

    public AnImal() {
        System.out.println("jajaja! soy un animal!!!!");
    }

    public abstract String emitirSonido(); //NO SE PUEDE COMBINAR ABSTRACT Y PRIVATE
}

class PErro extends AnImal { //AQUÍ HAY QUE IMPLEMENTAR MÉTODOS ABSTRACTOS

    int dientes;

    @Override
    public String emitirSonido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class PAjaro extends AnImal {

    double ala;

    @Override
    public String emitirSonido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class Prct11 {
    /*
    Práctica 11: Quita los comentarios del método emitirSonido() ¿ da algún error el IDE ?
    Toma captura de pantalla. ¿Se puede combinar private y abstract? Cambia private a public ¿
    el IDE da algún mensaje? Pon el cursor en la línea que declaras la clase Pajaro y pulsa:
    ALT + INTRO y selecciona la opción “implement all abstract methods” Haz lo propio con
    la clase Perro pero esta vez utiliza ALT + INSERT ( toma captura de pantalla de las
    ventanas que salgan ) . Quita el modificador abstract de donde se define la clase Animal
    pero deja ese modificador en el método emitirSonido(). Toma captura de pantalla delmensaje 
    contextual del IDE. Pulsa ALT + INTRO toma captura de pantalla de la ventana
    que muestra y sigue su recomendación de hacer la clase abstracta
     */
}
