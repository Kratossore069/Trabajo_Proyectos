/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainCuenta {
    
    
    public static void main(String[] args) {
        Movimiento move = new Movimiento();
        Scanner sc = new Scanner(System.in);
    
        System.out.println("¿Asunto?");
        String asunto = sc.nextLine();
        move.asunto(asunto);
        
        move.mostrar();
    }
}
