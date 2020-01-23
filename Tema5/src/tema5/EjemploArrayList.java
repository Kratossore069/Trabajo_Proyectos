/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class EjemploArrayList {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> al = new ArrayList<>(10000);
        for (int i = 0; i < 8; i++) {
            //al.add(rnd.nextInt(100));
            al.add(i); //Inserta los números.
        }
        
        al.remove(3); //Elimina el tercero.
        
        for (int num : al) {
            System.out.println(num);
        }
    }
}
