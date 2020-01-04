/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Víctor
 */
import java.util.Scanner;
public class Prct22 {
    public static void main(String[] args) {
        /*Práctica 22:  Imaginemos que java no supiera realizar una multiplicación 
                de dos números enteros positivos. En ese caso aún podríamos realizar 
                        una multiplicación usando recursividad aprovechando la siguiente 
                                propiedad de la multiplicación:n*a = (n-1)*a + aAsí pues 
                                        podríamos crear un método que se llame multiplicar()  
                                                donde:n*a = multiplicar(n,a) = multiplicar( n-1, a)
                                                        + ala condición base es que 1*a = aHacer un 
                                                                programa que resuelva las multiplicaciones utilizando recursión*/
        
        System.out.println("Número");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Por");
        int num2 = sc.nextInt();
        int res = multiplicar(num, num2);
        System.out.println(res);
    }
    
    public static int multiplicar(int a, int b){ //Que funcionen con números negativos
        int contador=0;
        if(a<0){
            a = 0-a;
            contador++;
        }
        if(b<0){
            b = 0-b;
            contador++;
        }
        int res =0;
        if(a==0 || b==0){
            res =0;
        }else if(b==1){
            res = 1;
        }else{
            res=multiplicar(a,1)+multiplicar(a,b-1); //5*2+5*1 = 5*3
            if(contador==1){
                res = 0-res;
            }
        }
        return res;
    }
}
