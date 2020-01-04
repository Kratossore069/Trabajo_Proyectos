/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Víctor
 */
public class Prct26 {
   /* Práctica 26
: Multiplicar todos los elementos de un array mediante recursión*/
    public static void main(String[] args) {
        int array[]={1,2,3,4,5}; //Debería dar 120
        int resultado =multiplica(array);
        System.out.println("Resultado -> "+resultado);
    }
    
    /*public static int multiplicatorio(int[] array){//CON RECURSIVIDAD
        int resultado;
        if(potencia){
            resultado = array[i]*array[i+1];
        }
        return resultado;
    }*/
    
    public static int multiplica(int array[]){ //SIN RECURSIVIDAD
        int resul=1;
        for(int i=0;i<array.length;i++){
            resul*=array[i];
        }
        return resul;
    }
}
