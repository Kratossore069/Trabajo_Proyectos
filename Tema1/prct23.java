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
import java.util.Scanner;
public class prct23 {
    public static void main(String[] args) {
    /*    Práctica 23: Hacer un programa que resuelva ecuaciones de segundo grado. El usuario
    introduce los valores de a,b,c de la fórmula: aX^2+bX+c = 0
    Se debe mostrar las dos posibles soluciones, salvo que haya una raiz negativa en cuyo caso
    se mostrará el mensaje: “no hay solución real”
    Nota. Para resolver podemos hacer uso de: Math.sqrt() para obtener la raíz cuadrada*/
    
    System.out.println("Introduzca los valores de a, b y c en este orden para resolver la ecuación -> ");
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int b =sc.nextInt();
    int c =sc.nextInt();
    
    if(((b*b)-(4*a*c))<0){
        System.out.println("No hay solución real");
    }else{
        float sol1 = (float)(-b+(Math.sqrt((b*b)-(4*a*c)))/(2*a));
        float sol2 = (float)(-b-(Math.sqrt((b*b)-(4*a*c)))/(2*a));
        System.out.println("La primera solución es "+sol1);
        System.out.println("La segunda solución es "+sol2);
    }
    }
    
}
