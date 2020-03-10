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
public class Prct37 {
    /*
    Práctica 37: Calcular el máximo utilizando reduce() pero sin usar Integer::max , esto es:
    mediante una función lambda que generemos nosotros
     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        
       /* numbers.stream().reduce((acumulador, numero) -> {
            int maximo=1, min=999, comodin=0;
            for (int i = 0; i < numbers.size(); i++) {
                if(i>maximo){
                    maximo = i;
                }else{
                    maximo = maximo;
                }
            }
            return maximo;
        });*/
        
        int max = numbers.stream().reduce(0, (a,b)->(a>b)?a:b);
        
        System.out.println(max);

    }
}
