/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct15 {

    /*
    Práctica 15: Usando el código que dio error en la práctica anterior modifícalo para ahora
usar un iterator y que ahora funcione debidamente
     */
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        String s0 = "yea";
        String s1 = "yea1";
        String s2 = "yea2";
        String s3 = "yea3";
        String s4 = "yea4";
        al.add(s0);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        //Se recorre el arraylist y si se encuentra lo que quiere se borra
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
