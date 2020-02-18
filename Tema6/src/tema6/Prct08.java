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

class Coche{
    protected String marca;
    protected String modelo;
    protected int potencia;
    protected int puertas;
    protected String matricula;

    public Coche(String marca, String modelo, int potencia, int puertas, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.puertas = puertas;
        this.matricula = matricula;
    }
    
    
}

class CocheSEAT extends Coche{
    
    //CONSTRUCTOR
    public CocheSEAT(String marca, String modelo, int potencia, int puertas, String matricula) {
        super(marca, modelo, potencia, puertas, matricula);
    }
    
    //GETTER Y SETTER

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}

public class Prct08 {
    /*
    Práctica 8: Tomando la clase Coche con atributos marca, modelo, potencia, puertas,
    matricula Crear la clase CocheSEAT Los modelos de esta marca siempre empezarán por
    “se-” agregando ese texto siempre al modelo que se le pase al constructor o al setter ( salvo
    que ya se le esté pasando, cosa que se debe validar )
    Observar que el atributo marca en coche no tiene mucho sentido que sea heredado por
    CocheSEAT
    */
}
