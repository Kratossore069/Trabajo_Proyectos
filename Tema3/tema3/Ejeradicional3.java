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
public class Ejeradicional3 {
    public static void main(String[] args) {
        int array[] = {0,2,1};
        
        int helper[] = new int[array.length+1];
        
        for(int i =0; i<array.length;i++){
            if(array[i]>0){
                helper[i] = i;
                helper[i]--;
                i--;
            }
        }
        
        for(int i =0;i<helper.length;i++){
            System.out.println(helper[i]);
        }
    }
}
