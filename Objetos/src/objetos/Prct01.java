/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author victor
 */
public class Prct01 {

    public static void main(String[] args) {
        /*Práctica 1: Copia el código anterior y toma una captura de pantalla que muestre la salida
        del programa en ejecución. ¿ qué valores muestra para a y b ?*/
        
        int a, b;
        a=7;
        b=a; //en estos momentos b vale 7 porque "copiamos" de a hacia b
        System.out.println("b:"+ b + " a:"+a);
        //modificar b no tiene efecto en a
        b=3;
        System.out.println("b:"+ b + " a:"+a);
    }
    
}
