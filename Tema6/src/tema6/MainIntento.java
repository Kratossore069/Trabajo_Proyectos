/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainIntento {
    public static void main(String[] args) {
        
        //Primero creamos a parte una clase abstracta de la que heredarán
        //otras clases.
        
        ArrayList<Cochito> coches = new ArrayList<Cochito>(); //ArrayList de la clase que ha heredado Garaje
        
        coches.add(new Cochito(123,"Ford")); //Añadimos cosas
        coches.add(new Cochito(456,"Mustang"));
        coches.add(new Cochito(789,"Camaro"));
        coches.add(new Cochito(023,"Fiesta"));
        
        Comparator<Cochito> com = new Comparator<Cochito>(){ //Clase anónima
            @Override
            public int compare(Cochito c1, Cochito c2) {
                    return Integer.compare(c1.matricula, c2.matricula); //Comparamos por matrículas
                }
        };
        
        
        Collections.sort(coches, com); //Ordenamos
        for (Cochito coch : coches) {
            System.out.println(coch.matricula); //Lo mostramos
        }
        
        System.out.println(coches);
    }
}
