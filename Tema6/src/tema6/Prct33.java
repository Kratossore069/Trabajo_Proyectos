/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Prct33 {
    
    /*
    Práctica 33: Probar el código anterior. Agrega el código para mostrar lista que se obtuvo
    como resultado en pantalla Toma captura de pantalla del código y la ejecución
    */
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        
        List<Integer> lista = numeros.stream()
            .filter(n -> {
                System.out.println("filtrando " + n);
                return n % 2 == 0;
            })
            .map(n -> {
                System.out.println("mapping " + n);
                return n * n;
            })
            .limit(2)
            .collect(toList());
        
    }

    
}
