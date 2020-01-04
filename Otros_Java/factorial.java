package video18;

import java.util.*;
public class video22 {
    public static void main(String[] args){
        
        int resultado=1;
        System.out.println("PRUEBA DE FACTORIALES \nInserte un número a factorizar: ");
        Scanner en = new Scanner(System.in);
        int numero=en.nextInt();
        
        for(int i=numero; i>0; i--){
            resultado=resultado*i;
        }
        
        System.out.println("El factorial de "+numero+" es "+resultado);
    }
}