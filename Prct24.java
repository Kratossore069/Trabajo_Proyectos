/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Víctor
 */
public class Prct24 {

    /*  Práctica 24
: Sumar las cifras de un número mediante recursión: 135 → 1+3+5 → 9*/
    public static void main(String[] args) {
        int num = 135;
        try{
        int resul = sumatorio(num);
        System.out.println(resul);
        }catch (java.lang.StackOverflowError ex){
            //ex.printStackTrace();
            System.out.println("ERROR -> Sigue dividiendo sin fin.");
        }finally{
            System.out.println("Sumatorio de las cifras de "+num);
        }
    }

    public static int sumatorio(int a) {
        int resul;
        if (a % 10 == 1) {
            resul = 1;
        } else {
            resul = a%10 + sumatorio(a/10);
        }
        return resul;
    }
}


