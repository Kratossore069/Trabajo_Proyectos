/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.ArrayList;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class PruebaDeClase {
    
    static ArrayList<Double> valores = new ArrayList<>();

    public static void main(String[] args) {
        

        double array[] = {0, 2.5, 5, 7.5, 10};

        obtener(array, 1, 0, 0); //Método estático

        valores.stream().
                distinct().
                sorted().
                forEach(p -> System.out.printf("%.2f\n", p));
    }

    static void obtener(double array[], int tareasClase, int contador, double acumulado) {
        if(contador<tareasClase){
            for (int i = 0; i < array.length; i++) {
                double d=array[i];
                obtener(array,tareasClase,contador+1,acumulado+d);
            }
        }else{
           valores.add(acumulado/tareasClase); 
        }
        
        //Hacer un equals casero
    }
}
