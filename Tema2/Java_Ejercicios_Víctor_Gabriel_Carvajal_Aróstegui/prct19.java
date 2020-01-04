/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraapp;

/**
 *
 * @author Víctor
 */
import java.util.Scanner;
public class prct19 {
    public static void main(String[] args){
        //Práctica 19:  Realizar un programa que sirva para convertir grados 
        //Farenheit en centígradosEl usuario introducirá los grados Farenheit y 
        //se le mostrará la equivalencia en centígrados.La fórmula es:.C = ( F – 32 ) * 5/9   
        //donde C es grados centígrados y F es Farenheit
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los grados en Farenheit -> ");
        int gradosFaren = sc.nextInt();
        
        float centigrados = (gradosFaren - 32)*5/9.0f;
        
        System.out.println("Grados Farenheit "+gradosFaren+" pasados a centígrados -> "+centigrados);
        
    }
}
