/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasopaso;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Persona {

    private String nombre;
    private String apellido1;
    private int edad;
    private int alturaEnCm;
    private double pesoEnKg;
    private Sexo sexo;

    public Persona(String nombre, String apellido1, int edad, int alturaEnCm, double pesoEnKg, Sexo sexo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.edad = edad;
        this.alturaEnCm = alturaEnCm;
        this.pesoEnKg = pesoEnKg;
        this.sexo = sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAlturaEnCm() {
        return alturaEnCm;
    }

    public void setAlturaEnCm(int alturaEnCm) {
        this.alturaEnCm = alturaEnCm;
    }

    public double getPesoEnKg() {
        return pesoEnKg;
    }

    public void setPesoEnKg(double pesoEnKg) {
        this.pesoEnKg = pesoEnKg;
    }

    @Override
    public String toString() {
        return "{" + " nombre= " + nombre + " , apellido1= " + apellido1 + " , edad= " + edad + " , alturaEnCm= " + alturaEnCm + " , pesoEnKg= " + pesoEnKg + " , sexo= " + sexo + " ]\n";
    }

    
    
    
}
