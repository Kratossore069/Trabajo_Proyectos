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
public class Ejadicional5 {

    public static void main(String[] args) {
        double resultado = 0;
        try {
            resultado = division(3, 0.0);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static double division(double a, double b) throws ArithmeticException {
        if(b==0){
            if(a==0){
                throw new ArithmeticException("Dividido por cero");
            }else{
                throw new ArithmeticException("Dividido por cero");
            }
        }else{
            return a / b;
        }
        
    }
}

