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
public class Fraccion {

    private int numerador;
    private int denominador;

    /* private int mcd(int num1, int num2){
        
    }*/
    
    
   /* public Fraccion(int num1, int num2) {
        int mcd = mcd(num1, num2);
        this.numerador = num1 / mcd;
        this.denominador = num2 / mcd;

    }

    static boolean mayorQue(Fraccion fr1, Fraccion fr2) {
        return fr1.toDouble() > fr2.toDouble();
    }

    static boolean menorQue(Fraccion fr1, Fraccion fr2){
        return fr1.toDouble() < fr2.toDouble();
    }
    
    static boolean igualQue(Fraccion fr1, Fraccion fr2){
        return fr1.toDouble() == fr2.toDouble();
    }
    
    public Fraccion invertir(){
        int nuevoNumerador = this.denominador;
        int nuevoDenominador = this.numerador;
        return new Fraccion(nuevoNumerador,nuevoDenominador);
    
    
    public double toDouble() {
        return numerador / (double) denominador;
    }
    
    public static Fraccion resta(Fraccion fr1, Fraccion fr2){ //ESTO ESTÁ BIEN
        Fraccion fr3 = new Fraccion(fr2.numerador*-1,fr2.denominador);
        return sumar(fr1,fr3);
    }
    
    public static Fraccion multiplicar(Fraccion fr1, Fraccion fr2){
        int nuevoNumerador = fr1.numerador - fr2.numerador;
        int nuevoDenominador = fr1.denominador - fr2.denominador;
        return new Fraccion(nuevoNumerador,nuevoDenominador);
    }
    
    public static Fraccion restar(Fraccion fr1, Fraccion fr2){
        int mcm = (fr1.denominador * fr2.denominador) / mcd(fr1.denominador,fr2.denominador);
        
        int nuevoNumerador, nuevoDenominador;
        
        nuevoDenominador = mcm;
        nuevoNumerador = mcm/fr1.denominador*fr1.numerador - mcm/fr2.denominador *- fr2.numerador;
        
        return new Fraccion(nuevoNumerador, nuevoDenominador);
        
    }
    
    public static Fraccion sumar(Fraccion fr1, Fraccion fr2){
        int mcm = (fr1.denominador * fr2.denominador) / mcd(fr1.denominador,fr2.denominador);
        
        int nuevoNumerador, nuevoDenominador;
        
        nuevoDenominador = mcm;
        nuevoNumerador = mcm/fr1.denominador*fr1.numerador + mcm/fr2.denominador *- fr2.numerador;
        
        return new Fraccion(nuevoNumerador, nuevoDenominador);
        
    }*/

    public static void main(String[] args) {
        /*  Práctica 15:   Crea la clase Complejo que sirva para utilizar 
                números complejos. Estosnúmeros disponen de una parte 
                        real y una parte imaginaria ( atritubos double real, doubleimag ) 
                        Dispondrá de tres constructores: Complejo(double real, double imag) 
                        Complejo(double real)   → aquí se establecerá la parte imaginaria
                                a 0Complejo() → aquí se establecerán tanto la parte real como la imaginaria a */
    }
}
