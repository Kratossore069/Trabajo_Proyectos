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
public class Recursividad {
    static int factorial(int n){
        int resultado = 0;
        if(n<=1){
            resultado = 1;
        }else{
            resultado = n * factorial(n -1);
        }
        return resultado;
    }
    public static void main(String[] args) {
        int n = 7;
        int res = factorial(7);
        System.out.println(res);
    }
}
