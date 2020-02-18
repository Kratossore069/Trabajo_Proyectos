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
//Práctica 12 junto con 15 junto con 13
final class Hombre extends Persona {

    public Hombre(String nombre, String apellidos, int edad, int altura, double peso) {
        super(nombre, apellidos, edad, altura, peso);
        tieneBarba = true;
    }

    @Override
    double calcularPesoIdeal() {
        double k = 4;
        double res = altura - 100 - ((100 - 150) / k);
        return res;
    }

    @Override
    public String toString() {
        return "Hombre{" + '}';
    }

}

class Mujer extends Persona {

    public Mujer(String nombre, String apellidos, int edad, int altura, double peso) {
        super(nombre, apellidos, edad, altura, peso);
    }

    @Override
    double calcularPesoIdeal() {
        double k = 4;
        double res = altura - 100 - ((100 - 150) / k);
        return res;
    }

    @Override
    public String toString() {
        return "Mujer{" + '}';
    }

}

abstract class Persona implements Ordenable<Persona> {

    String nombre;
    String apellidos;
    int edad;
    int altura;
    double peso;
    boolean tieneBarba;

    public Persona() {
    }

    abstract double calcularPesoIdeal();

    protected final double calcularIMC() {
        double alturam = altura / 100.0;
        return peso / (alturam * alturam);
    }

    public Persona(String nombre, String apellidos, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public boolean esMenorQue(Persona or) {
        return or.edad < this.edad;
    }

    @Override
    public boolean esIgualQue(Persona or) {
        return or.edad == this.edad;
    }

    @Override
    public boolean esMayorQue(Persona or) {
        return or.edad > this.edad;
    }

    

}
