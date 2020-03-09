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
public class PruebaDeClase{
    public static void main(String[] args) {
        
        ArrayList<Integer> valores = new ArrayList<>();
        
        double array[] = {0,2.5,5,7.5,10};
        
        obtener(array,1,0,0); //Método estático
        
        valores.stream().
                distinct().
                sorted().
                forEach(p->System.out.printf("%.2f\n",p));
    }
    
    static void obtener(double a[], int num1, int num2, int num3){
        
    }
    

    
}
