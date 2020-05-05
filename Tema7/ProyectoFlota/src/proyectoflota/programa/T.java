/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoflota.programa;

import java.util.Random;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class T {

    public Componentes[][] mar = new Componentes[4][4];

    public void oceanoAgua() {

        for (int i = 0; i < mar.length; i++) {
            for (int j = 0; j < mar[0].length; j++) {

                mar[i][j] = Componentes.AGUA;

            }

        }

    }
    
    public void disparo(int x, int y){
        
        if(mar[x][y]==Componentes.AGUA){
            
           mar[x][y]=Componentes.DISPARO; 
           
        }else if(mar[x][y]==Componentes.BARCO){
            
            mar[x][y]=Componentes.TOCADO;
            
        }
        
    }
    
    public void generarBarcos(){
        Random rd = new Random();
        for (int i = 0; i <3; i++) {
            mar[rd.nextInt(4)][rd.nextInt(4)]=Componentes.BARCO;
        }
    }
    
    

}
