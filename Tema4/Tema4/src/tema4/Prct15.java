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
class Complejo {

    public double real, imag;
    private static String constructor;

    //Constructores
    
    public Complejo(String constructor){
        //NO SÉ QUÉ HAY QUE HACER
    }
    
    public Complejo(double real, double imag) {
        
        this.real = real;
        this.imag = imag;
        
        int n;
        if (real != 0 && imag != 0) {
            n = 2;
        } else if (real != 0 && imag == 0) {
            n = 1;
        } else {
            n = 0;
        }
        System.out.println("Ha llamado al de "+n+" parámetros.");
    }

    public Complejo(double real) {
        
        this(real, 0);
        //System.out.println("Ha llamado al de un parámetro.");
    }

    public Complejo() {
        this(0);
        //System.out.println("Ha llamado al de 0 parámetros.");
    }
    
    public static Complejo suma(Complejo a, Complejo b){
        double real = a.real + b.real;
        double imaginario = a.imag + b.imag;
        return new Complejo(real,imaginario);
    }
    
    public Complejo opuesto(){
        return new Complejo(-this.real, -this.imag);
    }
    
    public static Complejo opuesto(Complejo a){
        return new Complejo(-a.real);
    }
    
    public static Complejo resta(Complejo a, Complejo b){
        double real = a.real - b.real;
        double imaginario = a.imag - b.imag;
        return new Complejo(real,imaginario);
    }
}

public class Prct15 {

    /*Práctica 15: Crea la clase Complejo que sirva para utilizar números complejos. Estos
    números disponen de una parte real y una parte imaginaria ( atritubos double real, double
    imag ) Dispondrá de tres constructores:
    Complejo(double real, double imag)
    Complejo(double real) → aquí se establecerá la parte imaginaria a 0
    Complejo() → aquí se establecerán tanto la parte real como la imaginaria a 0*/
    public static void main(String[] args) {
        Complejo com = new Complejo(0,0);
        Complejo dom = new Complejo(2,3);
        Complejo resultado = Complejo.suma(com, dom);
    }
}
