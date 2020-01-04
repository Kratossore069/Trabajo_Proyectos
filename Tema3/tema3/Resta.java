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
public class Resta {
    
    static int resta(int num, int num2){
        return num - num2;
    }
    
    static int multiplica(int num, int num2){
        return num * num2;
    }
    
    static int dividir(int num, int num2){
        return num / num2;
    }
    
    public static void cajaTexto(String str){
        int n = str.length();
        for (int i = 0; i < n + 4; i++){  
            System.out.print("#");            
        }            
        System.out.println();           
        System.out.println("# " + str + " #");
        for (int i = 0; i < n + 4; i++){ 
            System.out.print("#");   
        }          
        System.out.println();  
    }
    
    
    public static void main(String[] args) {
        int a = 5, b = 3;
        int resultado = resta(a, b);
        System.out.println(a+" - "+b+" = "+resultado);
        cajaTexto("Hola pimpollo");
    }
}
