/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import com.sun.javafx.collections.ElementObservableListDecorator;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
abstract class Vehiculo {

    public String matricula;
    public double cilindrada;

    public Vehiculo(String matricula, double cilindrada) {
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }
}

class Moto extends Vehiculo {

    public boolean sidecar;

    public Moto(String matricula, double cilindrada) {
        super(matricula, cilindrada);
        sidecar = false;
    }
}

class Bus extends Vehiculo {

    public int asientos;

    public Bus(String matricula, double cilindrada, int asientos) {
        super(matricula, cilindrada);
        this.asientos = asientos;
    }
}

public class Prct14 {

    /*
    Práctica 14: Pon el código del ejemplo en el IDE y tratar de acceder directamente desde
    elemento ( la variable de tipo Vehiculo del ejemplo ) al atributo propio de Moto: Ej.
    elemento.sidecar = false;
    Tomar captura de pantalla que muestre el error ¿qué dice el IDE?
    Prueba a escribir en el IDE: elemento.
    Observa las opciones que te permite. Te aparecerá sidecar, seleccionala y toma captura de
    pantalla del código que te haya generado ¿ qué es lo que ha hecho el IDE ?
     */

    public static void main(String[] args) {
        Vehiculo a[] = new Vehiculo[1];
        
        a.matricula = "123A";
        ElementObservableListDecorator
    }
}
