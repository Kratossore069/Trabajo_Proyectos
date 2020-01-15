/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainNodo {

    public int dato;
    Nodo next;

    public static void main(String[] args) {

        List lista = new ArrayList();

        lista.add(56);
        lista.add(45);
        lista.add(78);
        lista.add(90);
        lista.add(14);
        
        
        Iterator iterador = lista.iterator();

        while (iterador.hasNext()) {
            System.out.print(iterador.next()+" ");
        }
        System.out.println("");
    }

    /*Scanner sc = new Scanner(System.in);
        int el;
        int numeros[] = new int[100];
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
        Arrays.sort(numeros);//Método para ordenador números en un array.
        for (int a : numeros) {
            if (a != 0) {
                System.out.print(a+" ");
            }
        }
        System.out.println("");*/
 /*System.out.println("Inserte tres números");
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