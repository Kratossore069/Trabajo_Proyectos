/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Víctor
 */
public class DarlaVueltaalaCifra {
    /*Práctica 23
: Invertir las cifras de un número mediante recursión: 123347 → 743321 <--- No tiene recursión*/
    public static void main(String[] args) {
        int num = 123347;
        String resultado = cambiar(num);
        System.out.println(resultado);
    }
        
    public static String cambiar(int a){
        String palabra = Integer.toString(a);
        //int numeraco = Integer.parseInt(palabra);  <-- Para volver a cambiarlo a número
        String resultado = "";
            for (int i = palabra.length() -1; i >= 0; i--) {
		resultado += palabra.charAt(i);
            }
        return resultado;
    }
}
