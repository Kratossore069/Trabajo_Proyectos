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
public class Prct07 {
    /*Práctica 7
    :   Crear un programa con un tipo enumerado para las estaciones y mostrar en
    pantalla el dato enumerado correspondiente a la actual estación.*/
    
    public enum Estaciones {PRIMAVERA, VERANO, OTONIO, INVIERNO}

    
    public static void main(String[] args){
       Estaciones actual = Estaciones.OTONIO;
       
        System.out.println("Estamos en "+actual);
    }
}
