/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct11 {

    public static void main(String[] args) {
        /* Práctica 11: Crear un programa para la “frase del día
        ”  El usuario introduce al principiotodas las frases que quiera(escribirá la palabra “fin
        ” para finalizar la entrada de frases )Todas las  frases quedarán almacenadas en un ArrayList<String > 
        posteriormente se lemuestra una frase elegida al azar de entre todas las introducidas
        . Diciendo: “la frase del díaes
        :”se debe   garantizar que   todas puedan   ser elegidas   (   un aleatorio   desde   0   hastaarraylist.length() */

        Scanner sc = new Scanner(System.in);
        String frase = "";
        int i = 1;
        ArrayList<String> al = new ArrayList<String>();
        
        
        System.out.println("Frase: " +i);
        frase = sc.nextLine();

        
        while (frase.toLowerCase().equals("fin") == false) {
            al.add(frase);
            System.out.println("Frase: " + (++i));
            frase = sc.nextLine();
            
        }
        
        Random rd = new Random();
        System.out.println(al.get(rd.nextInt(al.size())));

    }
}
