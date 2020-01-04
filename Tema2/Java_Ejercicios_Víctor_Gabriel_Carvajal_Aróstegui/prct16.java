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
public class prct16 {
    public static void main(String[] args){
        //Práctica 16:   Cálculo del área de una Finca. 
        //La finca es rectangular así que el usuario introducirá el número de metros de cada lado 
        //y se le mostrará el área calculada tanto en metros cuadrados como en centímetros cuadrados.
        
        System.out.println("ÁREA DE UNA FINCA \nIntroduzca la altura en metros ->");
        Scanner sc = new Scanner(System.in);
        int alturaCuadrado = sc.nextInt();
        System.out.println("Introduzca la base en metros ->");
        int base = sc.nextInt();
        
        int area = (alturaCuadrado*base);
        int areaCuadrada = (alturaCuadrado*base);
        int areaCentimetros = ((alturaCuadrado*100)*(base*100));
        
        System.out.println("El área en metros es -> "+area+"\nEl área cuadrada en metros es -> "+areaCuadrada+"\nEl área cuadrada en centímetros es ->"
                +areaCentimetros);
        
        
    }
}
