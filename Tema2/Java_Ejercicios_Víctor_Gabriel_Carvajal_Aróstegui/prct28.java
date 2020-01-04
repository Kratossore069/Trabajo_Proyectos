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
public class prct28 {
    public static void main(String[] args) {
        /*Práctica 28 Hacer un programa que el usuario vaya introduciendo números enteros. El
        programa finaliza cuando el usuario introduce el número 0. En ese momento se le muestra
        la suma total de los números positivos y la suma total de los números negativos*/
        
        Scanner sc = new Scanner(System.in);
        int num, positivos = 0, negativos = 0;
        do{
            System.out.println("Introduzca tanto números positivos como negativos hasta 0 -> ");
            num = sc.nextInt();
            if(num<0){
                negativos += num;
            }else{
                positivos += num;
            }
        }while(num != 0);
        
        System.out.println("Positivos -> "+positivos);
        System.out.println("Negativos -> "+negativos);
    }
}
