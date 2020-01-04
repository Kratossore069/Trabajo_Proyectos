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
public class prct17 {
    public static void main(String[] args){
        //Práctica 17:  Crea un programa que calcule el IGIC (7%) de un producto 
        //dado su precio de venta sin IGIC que introduzca el usuario por teclado.
        
        final double IGIC = 0.07;
        System.out.println("Introduce un precio para calcular IGIC -> ");
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextInt();
        
        double total = numero * IGIC;
        System.out.println("El IGIC del precio dado es "+total);
        double total2 = numero + total;
        System.out.println("Precio total de IGIC es ->"+total2);
    }
}
