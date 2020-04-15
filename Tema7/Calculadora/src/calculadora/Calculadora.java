/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Calculadora {
    
    public void operacion(int n1, int n2,String op){
        switch(op){
            case "+":
                suma(n1, n2);
                break;
                
            case "-":
                resta(n1, n2);
                break;
                
            case "*":
                multiplica(n1, n2);
                break;
                
            case "/":
                divide(n1, n2);
                break;
            
        }
    }
    
    public static int suma(int n1, int n2){
        return n1+n2;
    }
    
    public static int resta(int n1, int n2){
        return n1-n2;
    }
    
    public static int multiplica(int n1, int n2){
        return n1*n2;
    }
    
    public static double divide(int n1, int n2){
        return n1/n2;
    }
    
}
