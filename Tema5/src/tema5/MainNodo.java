/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainNodo {
    public static void main(String[] args) {
        
        Nodo inicio = new Nodo();
        inicio.dato=3;
        
        Nodo dato1 = new Nodo();
        dato1.dato = 9;
        
        inicio.next = dato1;
        
        Nodo dato2 = new Nodo();
        dato2.dato = 23;
        
        dato1.next = dato2;
        
        //Recorrer lista
        Nodo recorrer = inicio; //Apuntador para recorrer la lista
        while(recorrer != null){
            System.out.println(recorrer.dato);
            recorrer = recorrer.next;
        }
        
        while(inicio != null){
            System.out.println(inicio.dato);
            inicio = inicio.next;
        }
        
        //12
        Nodo dato3 = new Nodo();
        dato3.dato = 12;
        
        //dato1.
    }
}
