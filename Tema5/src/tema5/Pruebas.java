/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Random;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Pruebas {
    public static void main(String[] args) {
        Random rd = new Random();
        int ale[] = new int[5];
        int n;
        
        for(int i=0;i<ale.length;i++){
            ale[i]=rd.nextInt(99)+1;
        }
        
        for(int a:ale){
            System.out.println(a);
        }
    }
}
