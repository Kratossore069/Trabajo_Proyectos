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
public class Prct10 {
    /*Práctica 10:  Hacer un programa que primero solicita la cantidad de números 
    que se van ainroducir.   Después  de  haberlos   introducido  muestra   
    la  media   y  los   números   que  se  hanintroducido*/
    
    public static void main(String[] args) {
        System.out.println("Define la dimensión del array");
        Scanner sc = new Scanner(System.in);
        int dimension = sc.nextInt();
        int array[] = new int[dimension];
        
        int i = 0, num, suma = 0;
        while(i<dimension){
            System.out.println("Intro num "+i);
            num = sc.nextInt();
            array[i] = num;
            suma += num;
            i++;
        }
        
        double media = suma/(double)dimension;
        double sumaVarianza =0;
        
        for(i=0; i<dimension; i++){
            sumaVarianza += Math.pow(array[i] - media,2);
        }
        
        double varianza = sumaVarianza/array.length;
        System.out.println("varianza = "+varianza);
    }
}
