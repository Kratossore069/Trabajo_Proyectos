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
public class Correccionmcm {
    
    static int mcd(int dividendo, int divisor){
        
        int resto, resultado = 1;
        do{
           resto = dividendo % divisor;
           if(resto != 0){
               dividendo = divisor;
               divisor = resto;
           }
        }while(resto != 0);
        
        resultado = divisor;
        
        return resultado;
    }
    
    static int mcm(int a, int b){
        int mcd = mcd(a,b);
        int res = (a*b)/mcd;
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Para cuántos");
        int cantidad = sc.nextInt();
        int num2=1;
        for(int i = 0; i<cantidad; i++){
            System.out.println("Dame un número "+(i+1));
            int num = sc.nextInt();
            num2 = mcm(num, num2);
        }
    }
}
