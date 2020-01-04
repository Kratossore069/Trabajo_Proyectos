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
public class Prct30 {
    /*Práctica 30: Partamos de la siguiente serie:                                                             
    1 - 1/2 + 1/3 - 1/4 + 1/5 - ... - 1/2*n + 1/2*n+1 - ...
    Podemos diseñar un procedimiento recursivo para calcular 
            la suma de los n primeros elementos de la serie, 
                    de modo que usemos una función diferente p
                            ara los elementos pares eimpares.*/
    public static void main(String[] args){
        
    }
    
    public static double par(int a){
        double resul = 0;
        if(a % 2 != 0){
            resul = impar(a);
        }else{
            resul =  impar(a-1)-1/(double)a;
        }
        return resul;
    }
    
    public static double impar(int b){
        double resul=0;
        if(b ==1){
            resul = 1;
        }else if(b % 2 == 0){
            resul = par(b);
        }else{
            resul = par(b-1)+1/(double)b;
        }
        return resul;
    }
}
