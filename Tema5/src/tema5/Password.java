/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Password {

    public static void main(String[] args) {
        
        boolean aceptado = false;

        String pas = "AJsy74gk";

        if(pas.length() >= 8){
            if(pas.matches("^.*[0-9].*")){
                if(pas.matches("^.*[A-Z].*")){
                    if(pas.matches("^.*[^\\W].*")){ //Carácter normal.
                        if(pas.matches("^.*[a-z].*")){
                            aceptado = true;
                        }
                    }
                }
            }
        }
        
        System.out.println("La expresión es "+((aceptado)?"válida":"errónea"));

    }

}
