/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video18;

/**
 *
 * @author Víctor
 */
import java.util.Scanner;
public class matrices2 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        String paises[]=new String[5];
        
        for(int i=0; i<paises.length; i++){
            System.out.println("Introduzca el nombre del país número "+(i+1));
            paises[i]=a.nextLine();
        }
        
        for(int i =0; i<paises.length; i++){
            System.out.println("País "+(i+1)+" es "+paises[i]);
        }
        
    }
}
