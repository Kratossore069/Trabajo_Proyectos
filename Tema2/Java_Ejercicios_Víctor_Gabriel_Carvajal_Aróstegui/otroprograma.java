/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraapp;

/**
 *
 * @author Víctor
 */
public class otroprograma {
    public static void main(String[] args) {
        
        //Recorrer cadena en binario al revés
        
        String algo = "111";
        int decimal = 0;
        
        for(int i = 0, j=algo.length()-1; i<algo.length(); i++, j=algo.length()-1 -i){
            int digito = algo.charAt(j) - '0';
            decimal += digito * Math.pow(2, i);
        }
        System.out.println(decimal);
        
    }
}
