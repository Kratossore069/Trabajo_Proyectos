/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */

class Complejo25{
    
    //Métodos
    public boolean equals(int num1, int num2){
        boolean res = false;
        if(num1==num2){
            res=true;
        }
        return res;
    }
    
}
public class Prct25 {
/* Práctica 25: crear el método boolean equals(Complejo) para la clase Complejo Que
determinará que son iguales si las partes reales son iguales y las partes imaginarias son
iguales.  */
    
    public static void main(String[] args) {
        
        Complejo25 datos = new Complejo25();
        
        boolean res = datos.equals(10, 10);
        
        if(res){
            System.out.println("Son iguales.");
        }else{
            System.out.println("No son iguales");
        }
        
    }
}
