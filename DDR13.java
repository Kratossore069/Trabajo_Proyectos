/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ddr;

/**
 *
 * @author Víctor
 */
import java.util.Scanner;
public class DDR13 {

    public static void main(String[] args) {
       /* 13) Realiza una aplicación que nos pida un número de ventas a 
                introducir, después nos pedirá tantas ventas por 
                teclado como número de ventas se hayan indicado. Al final
                        mostrara la suma de todas las ventas. Piensa que es 
                                lo que se repite y lo que no.*/
       
        System.out.println("Número de ventas a incluir.");
        Scanner sc = new Scanner(System.in);
        int ventas = sc.nextInt();
        int precioVentas[] = new int[ventas];
        try{
        for(int i =0;i<precioVentas.length;i++){
            System.out.println("Precio del "+(i+1));
            precioVentas[i] = sc.nextInt();
        }
        
        for (int i = 0; i < precioVentas.length; i++) {
            System.out.print(precioVentas[i]+" "); //De esta manera sale todo seguido.
        }
        
        int sumatorio = sumaTotal(precioVentas);
        System.out.println("Además, el sumatorio de todas las ventas da "+sumatorio);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally{
            System.out.println("*Diseñado por Víctor*");
        }
    }
    
    public static int sumaTotal(int array[]){
        int resul =0;
        for (int i = 0; i < array.length; i++) {
            resul += array[i];
        }
        return resul;
    }
    
    
    
}
