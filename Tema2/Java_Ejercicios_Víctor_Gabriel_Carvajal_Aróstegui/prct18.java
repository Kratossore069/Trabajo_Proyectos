/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraapp;

/**
 *
 * @author Víctor
 */
import java.util.Scanner;
public class prct18 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de horas trabajadas -> ");
        int horas = sc.nextInt();
        
        int salarioHoras = 18;
        
        int salarioSemanal = horas * salarioHoras;
        
        System.out.println("El salario por lo trabajado es "+salarioSemanal+" por sus "+horas+" horas trabajadas.");
    }
}
