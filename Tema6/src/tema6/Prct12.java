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

abstract class PErsona{
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected int edad;
    protected int altura; //CM
    protected double peso; //KG

    public PErsona(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    } //Constructor obligatorio por todas las clases que heredan

    @Override
    public String toString() {
        return "PErsona{" + "nombre=" + nombre + ""
                + ", apellido1=" + apellido1 + ""
                + ", apellido2=" + apellido2 + ""
                + ", edad=" + edad + ", altura="
                + altura + ", peso=" + peso + '}';
    } //Como un mostrar
    
    protected double calcularIMC(){
        double res;
        res = peso/altura;
        return res;
    }// Método propio de esta clase abstracta
    
    public abstract double calcularPesoIdeal(); 
    //Método abstracto que obligatoriamente tendrán las demás clases que hereden
    
}

class HOmbre extends PErsona{

    public HOmbre(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
        super(nombre, apellido1, apellido2, edad, altura, peso);
    }

    @Override
    public double calcularPesoIdeal() {
        double res;
        res = altura - 100 - ( (100 - 150)/4 );
        return res;
    }

    @Override
    public String toString() {
        return super.toString()+"Peso ideal: "+calcularPesoIdeal(); //super para hacer mención del toString de PErsona
    }
    
    

    
}

class MUjer extends PErsona{
    
    public MUjer(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
        super(nombre, apellido1, apellido2, edad, altura, peso);
    }

    @Override
    public double calcularPesoIdeal() {
        double res;
        res = altura - 100 - ( (100 - 150)/2 );
        return res;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Peso ideal: "+calcularPesoIdeal();
    }
}



public class Prct12 {
    /*
    Práctica 12: Crear una clase Persona que es abstracta y que tiene atributos: nombre,
    apellido1,apellido2, int edad, int altura, double peso La altura está pensada en cm y el peso
    en kg debe tener al menos un constructor con esos 6 parámetros. Sobreescribir toString()
    para que muestre los datos de la persona. Crear el método protected double calcularIMC()
    que devuelve el IMC de la persona. Crear también un método abstracto calcularPesoIdeal()
    Crear las clases Hombre y Mujer y para obtener calcularPesoIdeal tener en cuenta la
    fórmula:
    peso ideal = altura - 100 - ( (100 - 150)/k )
    siendo k=4 si hombre y k=2 si mujer
    el toString() de hombre y mujer debe hacer uso del toString() de Persona y agregar el
    resultado del peso ideal
    */
}
