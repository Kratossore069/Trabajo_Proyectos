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
public class Prct06 {
    /*Práctica 6
    :     Crear   un   método   llamado   combinacion()   que   se   le   pasen   dos   números   y
    obtenga   la   combinación   de   esos   dos   números.   Este   método   debe   hacer   uso   del   método
    factorial creado en la práctica anterior. La fórmula de la combinación es:*/
    
    public static int factorial(int a){
        int factor = 1;
        do{
            factor *= a;
            a--;
        }while(a>0);
        return factor;
    }
    
    public static int combinacion(int n, int r){
        //combinacion(n,r) = factorial(n) / ( factorial(n-r) * factorial(r))
        int resultado = factorial(n) / ( factorial(n-r) * factorial(r));
        return resultado;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Primer número");
        int n = sc.nextInt();
        System.out.println("Segundo número");
        int r = sc.nextInt();
        
        int fact = factorial(n);
        System.out.println("Factorial -> "+fact);
        
        int resultado = combinacion(n,r);
        System.out.println("Resultado -> "+resultado);
    }
        
    //TIENE FALLOS
}
