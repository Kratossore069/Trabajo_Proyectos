/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video18;

/**
 *
 * @author Víctor
 */
import java.util.Scanner;
public class prct38 {
    public static void main(String[] args){
        /*Práctica 38
        :  Hacer un programa que recibe un número de horas, por ejemplo 135.25 y lo
        convierte a un formato de: días, horas, minutos, segundos. Siguiendo el ejemplo anterior:
        5días 15horas  15minutos 0segundos*/
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Inserte el número de horas, aunque sea con decimales.");
        float tiempo = sc.nextFloat();
        
        float dias = tiempo/24;
        float horas = dias*24;
        float minutos = horas*60;
        double segundos = minutos*60;
        
        System.out.println("Días -> "+dias+" Horas -> "+horas+" Minutos -> "+minutos+" Segundos -> "+segundos);
    }
}
