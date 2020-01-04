/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraapp;

import java.util.Scanner;

/**
 *
 * @author Víctor
 */

public class ejemplodeswitch {
    public static void main(String[] args){
        /*Práctica 24:  Hacer un programa que le pregunte al usuario su idioma preferido. Donde la letra ‘c’ será castellano, ‘i’ inglés,  ‘f’ francés. 
        Según la opción que haya elegido se le mostrará respectivamente: “Buenos días”, “Good morning”,  “Bonjour” y termina. Si el usuario escribe cualquier otra cosa el programa mostrara: 
        “no entiendo tu idioma” y terminaTener en cuenta que Scanner no tiene un método nextChar() 
        en su defecto usar: next().charAt(0)   que va a tomar el primer carácter de la línea de texto introducidaEj. Scanner cin = new Scanner(System.in);char c = cin.next().charAt(0)*/
        
        System.out.println("Introduzca su idioma preferido, siendo: \n'c' castellano\n'i' inglés\n'f' francés");
        Scanner sc = new Scanner(System.in);
        char idioma = sc.next().charAt(0);
        
        switch(idioma){
            case 'c' : 
                System.out.println("Buenos días.");
                break;
            case 'i' : 
                System.out.println("Good morning.");
                break;
            case 'f' : 
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Ha insertado un valor "+idioma+" desconocido");
                
                //Ctrl+shift+i te aydua con los import
                //Ctrl+r te ayuda con los nombres de las variables
                //Ctrl+espacio te aydua con lo que deberías poner en cierta línea
        }
    }
}
