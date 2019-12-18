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

/* Ejercicio 1: Construir un programa que calcule el área y el perímetro de un 
    cuadrilátero dada la longitud de sus dos lados. Los valores de la longitud 
    deberán introducirse por línea de ordenes. Si es un cuadrado, sólo se 
    proporcionará la longitud de uno de los lados al constructor.*/


public class Rectangulo {
    
    //Atributos
    private int lado1, lado2;
    
    //Constructor
    public Rectangulo(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public Rectangulo(int lado1){
        this.lado1 = this.lado2 = lado1;
    }
    
    //Getter y Setter
    public float getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    //Métodos
    public void area(){
        int area = this.lado1*this.lado2;
        System.out.println("El area del rectángulo es "+area);
    }
    
    public void area(int lado1){
        int area = 2*lado1;
        System.out.println("Solo me has pasado un lado, así que es un cuadrado y su área es "+area);
    }
    
    public void perimetro(){
        int per = (2*this.lado1)+(2*this.lado2);
        System.out.println("El perímetro del rectángulo es "+per);
    }
}
