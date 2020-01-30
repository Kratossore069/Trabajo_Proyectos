/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct14 {

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
        
        Random rd = new Random();
        for (String elemento : al) {
            if (rd.nextInt(3)==1) {
                System.out.println("Borramos el elemento s2");
                al.remove(s2);
            }else{
                System.out.println("No borramos porque random no es 1");
            }
        }
        for (String elemento : al) {
            System.out.println(elemento);
        }
        
        //SI ELIMINAMOS ALGO DENTRO DE UN FOREACH, ENTONCES VA A FALLAR. ESE ES EL PROBLEMA.
    }
}
