/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class PruebaHashSet {
    public static void main(String[] args) {
        
        //HashSet evita que haya elementos duplicados.
        //No lleva un orden.
        
        HashSet<Integer> numeros = new HashSet<>();
        Random rd = new Random();
        
        for (int i = 0; i < 10; i++) { //Números aleatorios.
            numeros.add(rd.nextInt(20)+1);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su número de boleto (un número del 1 al 20): ");
        int boleto = sc.nextInt();
        
        for (Integer numero : numeros) {
            if(numeros.contains(boleto)){
                System.out.println("Su número está premiado. Felicidades.");
            }else{
                System.out.println("Pruebe de nuevo.");
            }
        }
        
        
    }
}
