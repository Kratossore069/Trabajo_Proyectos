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
public class Prct26 {

    public static void main(String[] args) {

        /*
        Práctica 26: Crear la interfaz funcional: Mates que tiene el método:
        public abstract int calc(int x);
        En el main crear una lambda para obtener el número al cuadrado, otra para calcular el
        factorial. Crea un método parecido al anterior: mostrarResultado(int x, Mates func) que nos
        muestre en pantalla el resultado. Pasarle tanto el factorial como el cuadrado
         *///////////////////////////
        
        int numero = 5;

        Mates cuadrado = (num) -> { //"Declaro" la lambda
            return num * num;
        };

        cuadrado.calc(numero); //La llamo
        
        //////////////////////////////

        Mates factorial = (num) -> {
            int fact=1;
            while (num != 0) {
                fact = fact * num;
                num--;
            }
            return num;
        };
        
        factorial.calc(numero);
        
        /////////////////////////////////
        
        Mates mostrar = (num, funcion) -> {
            
        };
        
        

    }

}
