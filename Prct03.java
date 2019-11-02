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
import java.util.Random;
public class Prct03 {
    /*Práctica 3
    :  Crear un programa con un método llamado aleatorio() que reciba dos números
    enteros   positivos   y   devuelva   un   número   aleatorio   que   esté   entre   esos   dos   números.   El
    main() del programa:*/
    
    static int aleatorio(int a, int b){
        Random rd = new Random();
        int resul = rd.nextInt(b-a)+a;
        return resul;
    }
    
    
    public static void main(String[] args) {
       int num;
       do{
           num = aleatorio(25,45);
           System.out.println(num);
       }while( num != 35 );
   }
}
