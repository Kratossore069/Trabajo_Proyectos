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
public class prct42 {
    public static void main(String[] args) {
        /*Práctica 42
        :   Hay una cuadrilla de trabajadores que aceptar encargos. Pongamos por
        ejemplo que tienen un encargo por 10000€. Al finalizar el trabajo observan que han
        participado 5 componentes de la cuadrilla dedicando cada uno de ellos respectivamente el
        siguiente número de horas:
        10, 100, 100, 20, 20
        Así que en total han invertido 250horas para un trabajo de 10000€ saliendo la hora
        trabajada a: 40€ 
         Hacer un programa que les permita calcular lo que sale cada hora trabajada. Como datos de
        entrada recibirá el dinero total que se pagará por el encargo. El número de participantes de
        la cuadrilla y el número de horas que haya realizado cada uno de los participantes*/
        
        Scanner sc = new Scanner (System.in);
        int array[] = {10, 100, 100, 20, 20};
        
        for(int i = 0; i<array.length; i++){
            System.out.println("El trabajador que hizo "+array[i]+" horas cobrará "+array[i]*40+" euros por su trabajo.");
        }
        
        System.out.println("Han sido un total de "+array.length+" integrantes.");
    }
}
