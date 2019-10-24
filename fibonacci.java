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
public class practicar {
    public static void main(String[] args){
        for(int i = 1; i<=5; i++){
            System.out.println(i);
        }
        
        System.out.println("Ejemplo de while");
        
        int i = 1, j = 99;
        while(i<=5 && j>=94){
            System.out.println(i+" ,"+j);
            i++;
            j--;
        }
        System.out.println("Ejemplo de do while / FIBONACCI");
        int a = 0, b = 1, c = 0 ;
        do{
            System.out.println(a);
            c = b+a;
            a = b;
            b = c;
        }while(a<=34);
    }
    
}
