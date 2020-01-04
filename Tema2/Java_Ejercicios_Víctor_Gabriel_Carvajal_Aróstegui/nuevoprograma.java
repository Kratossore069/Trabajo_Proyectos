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
import java.util.Scanner;
public class nuevoprograma {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Número en base 10");
        int decimal = sc.nextInt(), division;
        
        String binario = "";
        
        for(division = decimal; division>0; division /= 2){
            binario = (division%2)+binario;
        }
        
        System.out.println("Binario -> "+binario);
       
    }
}
