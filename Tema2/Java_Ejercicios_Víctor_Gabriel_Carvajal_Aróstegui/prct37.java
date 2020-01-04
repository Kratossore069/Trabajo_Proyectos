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
public class prct37 {
    public static void main(String[] args) {
        /*Práctica 37
        :  Crear un programa que le pregunte al usuario la cantidad de billetes que tiene 
        de 500, luego le pregunte por la cantidad de billetes que tiene de 200, después pregunte por 
        los de 100, 50, 20, 10, 5. Finalmente se le dirá al usuario la cantidad de dinero acumulado 
        que tiene en billetes.*/
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Billetes de 500: ");
        int grandes500 = sc.nextInt();
        System.out.println("Billetes de 200: ");
        int grandes200 = sc.nextInt();
        System.out.println("Billetes de 100: ");
        int grandes100 = sc.nextInt();
        System.out.println("Billetes de 50: ");
        int grandes50 = sc.nextInt();
        System.out.println("Billetes de 20: ");
        int grandes20 = sc.nextInt();
        System.out.println("Billetes de 10: ");
        int grandes10 = sc.nextInt();
        System.out.println("Billetes de 5: ");
        int grandes5 = sc.nextInt();
        
        int totalDinero = (grandes500*500)+(grandes200*200)+(grandes100*100)+(grandes50*50)+(grandes20*20)+(grandes10*10)+(grandes5*5);
        
        System.out.println("El dinero total es de "+totalDinero+" euros.");
    }
}
