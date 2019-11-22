/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Víctor
 */
public class Prct27 {
    /*Práctica 27
:  Calcular la potencia de forma recursiva:  2⁷  → 128 */
    public static void main(String[] args) {
        int num = 2, poten = 7;
        int resul = potenciaRecursiva(2,7);
        System.out.println("La potencia recursiva de "+num+" elevado a "+poten+" es "+resul);
    }
    
    public static int potenciaRecursiva(int numero, int potencia){
        int resul;
        if(potencia==0){
           resul = 1; 
        }else{
            resul = numero*potenciaRecursiva(numero,potencia-1);
        }
        return resul;
    }
}
