/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author Víctor
 */
public class Ejeradicional5 {
    
    public static boolean isInt(String text){
        boolean resultado = true;
        int i =0;
        if(text.charAt(0)=='-' || text.charAt(0)=='+'){
            i++;
        }
        
        for(;i<text.length();i++){
            if(text.charAt(i)<'0' || text.charAt(i)>'9'){
                resultado = false;
            }
        }
        return resultado;
    }
    
    public static int textToInt(String str){
        int i =0, numero=0;
        boolean resultado=false;
        String sincero = "";
        while(i<str.length() && str.charAt(i) == '0'){
            i++;
        }
        for(;i<str.length();i++){
            sincero += str.charAt(i);
        }
        
        numero = Integer.parseInt(sincero);
        return numero;
        
    }
    public static void main(String[] args) {
        
    }
}
