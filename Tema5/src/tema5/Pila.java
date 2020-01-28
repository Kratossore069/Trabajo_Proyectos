/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Pila {
    
    private final int SIZE;
    int array[];
    int siguiente;
    
    public Pila(int size){
        SIZE = size;
        array = new int[SIZE];
    }
    
    public Pila(){
        this(10); //Llama al constructor de arriba. Se llaman entre constructores.
    }
    
    public int pop() throws Exception{
        int devuelto=0;
        if(siguiente<=0){
            throw new Exception();
        }else{
            devuelto = array[--siguiente];
        }
        return array[--siguiente]; //Si es 0, falla.
    }
    
    public boolean add(int dato){
        
        boolean agregado = false;
        
        if(array.length > siguiente){
            array[siguiente] = dato;
            siguiente++;
            agregado = true;
        }else{
            agregado = false;
        }
        
        try{
            
            array[siguiente] = dato; //La pila se desborda y se ensancha.
            agregado = true;
            siguiente++;
            
        }catch(Exception ex){
            
            agregado = false;
            
        }
        
         
        
        return agregado;
    }
    
    
}
