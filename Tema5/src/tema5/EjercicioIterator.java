/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class EjercicioIterator {
    public static void main(String[] args) {
        //Genere 10 aleatorios y los meta en un ArrayList. Luego, borrar todos los números impares.
        Random rd = new Random();
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) { //Números aleatorios de 0 a 100.
            numeros.add(rd.nextInt(101));
        }
        
        for (Integer numero : numeros) { //Muestran los números.
            System.out.print(numero+" ");
        }
        System.out.println("");
        
        System.out.println("Eliminamos impares.");
        Iterator<Integer> iterator = numeros.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%2==0){
                System.out.println("Par, no se borra");
            }else{
                iterator.remove();
            }
        }
        
        System.out.println("Números solamente pares.");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        
        
        
    }
}
