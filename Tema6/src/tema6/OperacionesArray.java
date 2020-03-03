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
public class OperacionesArray<T> {
    
    void porCadaUno(T array[], Operable op){
        for (T elemento : array) {
            op.unoPoruno(elemento);
        }
    }
    
    String arrayToText(T array[]){
        String res="";
        for (T t : array) {
            res += t.toString()+"\n";
        }
        return res;
    }
    
    T reduccion(T array[], Convert2to1<T> lambda){
        T res=array[0];
        for (int i = 1; i < array.length; i++) {
            res = lambda.suma(res, array[i]);
        }
        return res;
    }

    ArrayList<Integer> filtrado(Integer[] array, Filtrar<Integer> lambda) {
        return null;
    }
    
    
    
    
}

interface Convert2to1<T>{
    
    T suma(T a, T b);
    
}

@FunctionalInterface
interface Operable<T>{
    void unoPoruno(T elemento);
}

interface Filtrar<T>{
    boolean filtrado(int num);
}