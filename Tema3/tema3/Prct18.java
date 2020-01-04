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
import java.util.Scanner;
public class Prct18 {
    public static void main(String[] args) {
        /*Práctica 18
        :  Crear un programa que introduzca 5 números y muestre cuáles son los dos 
        números más cercanos. Por ej. Si:
        14,11,2,10,17 => 11,10  */
        
        try{
            Scanner sc = new Scanner(System.in);  
            int numeros[] = new int[5];
            System.out.println("Inserte cinco números y le diré los más cercanos");
            int i =0, temp, cercano=999, num1=0, num2=0;
            
            while(i<5){
                numeros[i] = sc.nextInt();
                i++;
            }
            
            /*System.out.println("Los números insertados son: "); // <-- Mostrar los números insertados
            for(i=0;i<numeros.length;i++){
                System.out.println(numeros[i]);
            }*/
            
            for(i=0;i<numeros.length;i++){
                for(int j=i+1;j<numeros.length;j++){
                    if(numeros[i]>numeros[j]){
                        temp=numeros[j];
                        numeros[j]=numeros[i];
                        numeros[i]=temp;
                    }
                    
                    int resta = Math.abs(numeros[i]-numeros[j]);
                    if(cercano > resta){
                        cercano = Math.abs(resta);
                        num1 = numeros[i];
                        num2 = numeros[j];
                    }
                }
            }
            System.out.println("Los números más cercanos son "+num1+" y "+num2);
            
        }catch(Exception x){
            x.printStackTrace();
        }finally{
            System.out.println("*Hecho por Víctor*");
        }
    }
}
