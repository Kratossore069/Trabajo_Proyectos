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
public class Tema3 {

    static int calcularDoble( int num ){
        int resultado = num * 2;
        return resultado;
    }
    
    public static void main(String[] args) {
        int valor, dobleDeValor;    
        valor = 5;    
        dobleDeValor = calcularDoble(valor);    
        System.out.println("El doble de la variable valor es: " + dobleDeValor);
    }
    
}
