/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Nodo {

    public int dato;
    Nodo next;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int el;
        int numeros[] = new int[20];

        int i = 0;
        do {

            System.out.println("Número "+(i+1)+", 999 para salir.");
            el = sc.nextInt();

            if (el != 999) {
                numeros[i] = el;
                i++;
            }

        } while (el != 999);

        System.out.println("Array en orden: "); 
        Arrays.sort(numeros);//Método para ordenador números en un array
        for (int a : numeros) {
            if (a != 0) {
                System.out.print(a+" ");
            }
        }

        System.out.println("");
        
       /* System.out.println("Inserte tres números");
        Nodo a = new Nodo();
        
        a.dato = sc.nextInt();
        
        Nodo b = new Nodo();
        
        b.dato = sc.nextInt();
        
        a.next = b;
        
        Nodo c = new Nodo();
        
        c.dato = sc.nextInt();
        
        b.next = c;
        
        
        //Recorrer lista
        Nodo recorrer = a; //Apuntador para recorrer la lista
        System.out.println("Se muestran los números introducidos");
        while(recorrer != null){
            System.out.println(recorrer.dato);
            recorrer = recorrer.next;
        }*/
    }
}
