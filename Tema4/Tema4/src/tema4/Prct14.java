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
class Camioncito {

    private String marca;
    private double potencia;
    private String matricula;

    public Camioncito() {

    }

    public Camioncito(String m) {
        this.marca = m;
    }

    public Camioncito(String marca, double p, String mat) {
        this(); //Cambio realizado
        this.marca = marca;
        this.potencia = p;
        this.matricula = mat;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String setMatricula(String matricula) {
        return this.matricula = matricula;
    }
}

public class Prct14 {

    /* Práctica 14: Modifica la clase Camion de la práctica 12 de tal forma que los diferentes
constructores se apoyen en uno solo haciendo uso de: this()*/

    public static void main(String[] args) {

    }
}
