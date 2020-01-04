/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraapp;

/**
 *
 * @author daw
 */
public class prct12 {
    
    public static void main (String[] args){
         
        int a=1;
        int b=2;
        int c=3;
         
        int temp=0;
        
        temp=c;
        c=a;
        a=b;
        b=temp;
        
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
    
}
