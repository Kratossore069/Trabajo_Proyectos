/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasstream;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Vehiculo {

    //Atributos
 
    private String matricula;
    private Modelo modelo;
    private int kilometros;
    private String duenio; //Nuevo atributo
    
    //Constructores
 
    public Vehiculo(String matricula, Modelo modelo, int kilometros, String duenio) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.duenio = duenio; //Nuevo atributo
    }
    
    //Métodos
    
    //Getter y setter
    
    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
 
    public String getMatricula() {
        return matricula;
    }
 
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
 
    public Modelo getModelo() {
        return modelo;
    }
 
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
 
    public int getKilometros() {
        return kilometros;
    }
 
    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
    
    //toString
 
    @Override
    public String toString() {
        return "[ " + matricula + ", " + modelo.toString() + ", " + kilometros + ", "+duenio+" ]";
    }
}