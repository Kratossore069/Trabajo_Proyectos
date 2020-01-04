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
public class masejercicios {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int i, contador =0, acumulador=0, nota=0;
       
       for(i=0; nota>=0; i++){
           acumulador += nota;
           System.out.println("Introduce nota");
           nota = sc.nextInt();
       }
       System.out.println(acumulador/(double)i);
   }
}
