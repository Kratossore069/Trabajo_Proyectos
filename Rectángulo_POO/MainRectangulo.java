/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainRectangulo {
   /* Ejercicio 1: Construir un programa que calcule el área y el perímetro de un 
    cuadrilátero dada la longitud de sus dos lados. Los valores de la longitud 
    deberán introducirse por línea de ordenes. Si es un cuadrado, sólo se 
    proporcionará la longitud de uno de los lados al constructor.*/
    
    public static void main(String[] args){
        
        Rectangulo rectangulo = new Rectangulo(50,25);
        Rectangulo cuadrado = new Rectangulo(60);
        
        rectangulo.area();
        rectangulo.perimetro();
        
        cuadrado.area(60);
        
    }
}
