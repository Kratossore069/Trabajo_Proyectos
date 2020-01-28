/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainPila {
    public static void main(String[] args) {
        Pila pila = new Pila(20);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame trabajo...");
        System.out.println("");
        int trabajo = sc.nextInt();
        pila.add(trabajo);
        pila.add(3);
        pila.add(5);
        
     //   dato = pila.pop();
        System.out.println("");
        
        try{
            System.out.println(pila.pop());
            System.out.println(pila.pop());
            System.out.println(pila.pop());
        }catch(Exception ex){
            System.out.println("ERROR: pila vacía");
        }
    }
}
