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
public class Arrays {
    public static void main(String[] args){
        int array[] = new int[3];
        array[0] = 5;
        array[1] = 55;
        array[2] = 75;
        
        Random rd = new Random();
        
        for(int i = 0; i<array.length; i++){
            array[i] = rd.nextInt(100);
        }
        
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
        
        int array2[] = {1,2,3,4,5,6};
        
        for(int i = array2.length; i>=0; i--){
            System.out.println(i);
            System.out.println(array2.length);
            System.out.println(array2[i]);
        }
    }
}
