/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Víctor
 */
public class Ejerciciodeclase2 {

    public static void main(String[] args) {
        System.out.println("Ejercicio de crear un nuevo array a partir de las posiciones del primero.");
        int creada[] = {0, 1, 0, 2, 1};
        int helper[] = new int[creada.length+1]; //+1 porque, si inserto un número de más, me dará error
        int i = 0;

        for (i = 0; i < creada.length;i++) {
            if (creada[i] == 0) {
                //i++;
            }else{
                helper[i]=creada[i];
                //helper[i]++;
            }
        }
        
        for(i=0;i<helper.length;i++){
            System.out.println(helper[i]); //VISUALIZO EL HELPER
        }
        
    }
}
