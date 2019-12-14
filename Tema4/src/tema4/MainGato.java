/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Víctor_Gabriel_Carvajal_Aróstegui
 */
public class MainGato {
    public static void main(String[] args) {
        Gato gato = new Gato("Félix", "Egipcio", 2300);
        
        gato.mostrar();
        gato.setNombre("Antonio");
        
        System.out.println(resta(10,4));
        System.out.println(restaDos("hola mundo","a mundo"));
    }
    
    public static int resta(int num1, int num2){
        return num1-num2;
    }
    
    public static String restaDos(String str1, String str2){
        return str1.substring(0, str1.length()-str2.length());
    }
}
