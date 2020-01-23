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
public class Prct12 {

   /* Práctica 12: Modificar el programa anterior para que lo que muestre sea todas las frasesque empiecen con la letra a mayúscula
    : “A*/
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String frase = "";
        int i = 1;
        java.util.ArrayList<String> al = new java.util.ArrayList<String>();
        
        
        System.out.println("Frase: " +i);
        frase = sc.nextLine();

        
        while (frase.toLowerCase().equals("fin") == false) {
            al.add(frase);
            System.out.println("Frase: " + (++i));
            frase = sc.nextLine();
            
        }
        
        for (int j = 0; j < al.size(); j++) {
            if(al.get(j).matches("^[A].*")){
                System.out.println(al.get(j));
            }
        }
        
    }


}
