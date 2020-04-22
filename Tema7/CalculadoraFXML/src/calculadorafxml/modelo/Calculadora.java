/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafxml.modelo;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Calculadora {
    
    //Atributos
    
    //Métodos
    
    public int operacion(int num1,int num2,String op){
        int res=0;
        switch(op){
            case "+":
                res=num1+num2;
                break;
                
            case "-":
                res=num1-num2;
                break;
                
            case "*":
               res=num1*num2;
                break;
                
            case "/":
               res=num1/num2;
                break;
            
        }
        return res;
    }
    
    public int digitos(int num1){
        return num1;
    }
    
    
    
    
}
