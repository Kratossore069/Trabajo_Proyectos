/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraapp;

/**
 *
 * @author Víctor
 */
public class fordentrodefor {
    public static void main (String[] args){
        for(int i = 1; i<=10; i++){
            for(int j = 1; j<=10; j++){
                System.out.println("\n"+i+" x "+j+" = "+(i*j));
            }
        }
        
        System.out.println("------------------HECHO DE OTRA FORMA---------------------");
        String m = "";
        for(int i = 0, j = 0; i<10; j++, i += j/10, m = (j==10)?"\n":"", j %= 10){
            System.out.println(m);
            System.out.println((i+1)+"*"+(j+1)+"="+((i+1)*(j+1)));
        }
    }
}
