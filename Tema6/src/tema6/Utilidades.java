/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Utilidades {
    
    public static void ordenar(int array[]){
        
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) { //j es el i+1
                
                if(array[i].esMayorQue(array[j])){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                
                
                
            }
        }
    }
    
    public static void main(String[] args) {
        int a[] = {2,8,9,4};
        
        Conejo con[] = {new Conejo(20), new Conejo(30), new Conejo(7), new Conejo(15)};
        
        Persona p = new Hombre("a","b",2,33,44);
        Persona q = new Hombre("aa","cc",2,33,44);
        Persona r = new Hombre("bbb","ccc",2,33,44);
        Persona s = new Hombre("aaaa","bbbb",2,33,44);
        
        Utilidades.ordenar(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
    
}
