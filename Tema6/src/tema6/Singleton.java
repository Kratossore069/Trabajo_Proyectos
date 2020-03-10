/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.Random;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Singleton {
    
    static Singleton objetoSingleton;
    
    int clave;
    
    private Singleton(){
        Random rd = new Random();
        clave = rd.nextInt(1000)+1000;//Entre mill y dos mil
    }
    
    public static Singleton getInstance(){
        if(objetoSingleton==null){
            objetoSingleton = new Singleton();
        }
        return objetoSingleton;
    }
    
    
}
