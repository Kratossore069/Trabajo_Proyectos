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
import java.util.Scanner;
public class Ejadicional1 {
    
    static boolean cambio(String cad){
        boolean chivato = true;
        
            if(cad.charAt(0) == '-'){
                for(int i = 1; i<cad.length(); i++){
                    char c = cad.charAt(i);
                    chivato = !(c<'0' || c>'9'); //Si esto NO es verdad es true, si lo es, es false
                }
            }else{
                for(int i = 0; i<cad.length(); i++){
                    char c = cad.charAt(i);
                    chivato = !(c<'0' || c>'9');
                }
            }
        return chivato;
    }

    
    public static void main(String[] args) {
        // Insertar un número y valorarlo ->
        
        System.out.println("Inserte un número.");
        Scanner sc = new Scanner (System.in);
        String cadena = sc.nextLine();
        boolean resultado = cambio(cadena);
        if(resultado == true){
            System.out.println("Su cadena introducida es un número.");
        }else{
            System.out.println("Su cadena introducida no es un número.");
        }
    }

    
}
