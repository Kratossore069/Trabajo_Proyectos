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
import java.util.Random;
public class Prct03 {
    
    static int aleatorio(int num, int num2){
        Random rd = new Random();
        int resultado = rd.nextInt(num2-num)+num;
        return resultado;
    }
    
    public static void main(String[] args) {
       /* Práctica 3:  Crear un programa con un método llamado aleatorio() que 
        reciba dos númerosenteros   positivos   y   devuelva   un   número  
        aleatorio   que   esté   entre   esos   dos   números.   Elmain() del programa:
        public static void main(String[] args) { */      
            
        int num;    
        
        do{           
            num = aleatorio(25,45);           
            System.out.println(num);      
        }while( num != 35 );   
    }
}
