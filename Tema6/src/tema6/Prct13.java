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

abstract class PERsona{ //No se puede poner final ya que choca con abstract
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected int edad;
    protected int altura; //CM
    protected double peso; //KG

    public PERsona(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
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
    
    public final abstract double calcularPesoIdeal(); //Final y abstract no pueden ir juntos
    //Método abstracto que obligatoriamente tendrán las demás clases que hereden
    
}

class HOMbre extends PERsona{ //No puede heredar de una clase final

    public HOMbre(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
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

class MUJer extends PERsona{
    
    public MUJer(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
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


public class Prct13 {
    /*
    Práctica 13: Toma capturas de pantalla modificando Persona para que no sea abstracta y
    establécela a final. Muestra en captura de pantalla los errores en Hombre y Mujer.
    Quita el modificador final de Persona pero ponerlo en calcularPesoIdeal() Tratar de
    redefinirlo en Hombre o en Mujer. Tomar captura de pantalla del error ¿ qué dice el
    mensaje?
    */
}
