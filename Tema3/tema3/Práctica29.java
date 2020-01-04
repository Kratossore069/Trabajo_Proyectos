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
public class Prct29 {
    /*Práctica 29
    : sin usar bucles for, while, do while obtener el número menor de un array*/
    
    public static void main(String[] args){
        try{
        int array[] = {90,10,800};
        int menor = menor(array);
        System.out.println("El menor número es "+menor);
        }catch(java.lang.StackOverflowError ex){ //Exception se puede quitar y poner el error
            //ex.printStackTrace();
        }finally{
            System.out.println("*Hecho por Víctor*");
        }
    }
    
    public static int menor(int[] a){
        int resultado=a[0];
        if(a[0] > a[1]){
            resultado = a[1];
        }else if(a[1] < a[2]){
            resultado = a[1];
        }else{
            resultado = a[2];
        }
        return resultado;
    }
}
