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

class Frac implements ORdenable{
    private int numerador;
    private int denominador;

    public Frac(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public Frac(int numerador){
        this.numerador = numerador;
        denominador = 1;
    }
    
    public double toDouble(){
        double res = numerador/denominador;
        return res;
    }

    @Override
    public String toString() {
        return numerador+"/"+denominador;
    }

    @Override
    public boolean esMayorQue() {
        return 
    }

    @Override
    public boolean esMenorQue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esIgualQue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}


public class Prct19 {
    
    /*
    Práctica 19: Crear la clase Fraccion con atributos: int numerador, int denominador un
    constructor que recibe los dos paramentros y otro que recibe únicamente el numerador ( el
    denominador será 1 ) con métodos: double toDouble() que devuelve el resultado de la
    división y un toString() en el formato: 3/5
    donde 3 sería el numerador y 5 el
    denominador. Fraccion implementará la interfaz Ordenable los métodos: esMayorQue() ...
    utilizarán la comparación de los double resultantes al hacer la división para comparar dos
    fracciones, siendo mayor una fracción si el double resultante es mayor
    */
    
    
}
