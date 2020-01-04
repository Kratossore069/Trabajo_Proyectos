/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video18;

/**
 *
 * @author Víctor
 */
public class matricesdosdimensiones {
    public static void main(String[] args){
        
        int array[][] = new int[2][3];
        
        int arrayDos[][] = {{1,2,3},{4,5,6}};
        
        array[0][0]=5;
        array[0][1]=10;
        array[0][2]=15;
        
        array[1][0]=20;
        array[1][1]=25;
        array[1][2]=30;
        
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.println("El valor de la posición "+i+j+" es de "+array[i][j]);
            }
        }
        System.out.println("HECHO DE OTRA MANERA");
        
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.println("El valor de la posición "+i+j+" es de "+arrayDos[i][j]);
            }
        }
    }
}
