/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */

class Vehiculo<T>{
    
    T identificador;
    private int numeroRuedas;
    private double potencia;

    

    public Vehiculo(T identificador, int numeroRuedas, double potencia) {
        this.identificador = identificador;
        this.numeroRuedas = numeroRuedas;
        this.potencia = potencia;
    }
    
    public T getIdentificador() {
        return identificador;
    }

    public void setIdentificador(T identificador) {
        this.identificador = identificador;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    

    
    
    
}
public class Prct24 {
    /*
    Práctica 24: Crear una clase Vehiculo con atributos: int numeroRuedas , double potencia y
T identificador Este identificador pudiera ser como una matrícula ( String ) o un código
numérico ( double, int,... ) o cualquier otro tipo. Debe tener como mínimo los getter y setter
    */
    
    public static void main(String[] args) {
        
    }
}
