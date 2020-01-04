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
import java.util.Random;
import java.util.Scanner;
public class prct36 {
    public static void main(String[] args) {
        /*Práctica 36:  Hacer un programa que se emule un juego de lanzar 3 dados. 
        En cada iteración se muestra el resultado sacado en cada uno de los dados 
        y cuánto es el acumulado de esa tirada de 3 dados. Cuando el usuario pulse 
        en “f” o “F” el programa finaliza y muestra el acumulado de puntos de 
        sumar todas las tiradas y el número de tiradasNota: se puede utilizar 
        Random para el número aleatorio:Random rnd = new Random();rnd.nextInt(6); 
        */
        Scanner sc = new Scanner (System.in);
        Random rnd = new Random();
        char entrada;
        int puntosTotales = 0, tiradasTotales = 0, totalTirada = 0;
        
        do{
        
        tiradasTotales++;
        
        int ale1 = rnd.nextInt(6)+1;
        int ale2 = rnd.nextInt(6)+1;
        int ale3 = rnd.nextInt(6)+1;
        
        System.out.println("Dado 1 -> "+ale1);
        System.out.println("Dado 2 -> "+ale2);
        System.out.println("Dado 3 -> "+ale3);
        
        totalTirada = ale1+ale2+ale3;
        
        System.out.println("Puntos totales: "+totalTirada);
        puntosTotales += totalTirada;
        System.out.println("¿Tirar de nuevo?");
        
        entrada = sc.next().charAt(0);
        
        }while(entrada != 'f' && entrada != 'F');
        
        System.out.println("Acumulado -> "+puntosTotales);
        System.out.println("Tiradas -> "+tiradasTotales);
    }
}
