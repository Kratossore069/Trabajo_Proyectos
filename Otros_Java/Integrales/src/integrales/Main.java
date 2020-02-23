/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrales;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Main {

    public static final double INCREMENTO = 1E-4;

    public static double integral(double a, double b, Funcion funcion) {
        double area = 0;
        double modifier = 1;
        if (a > b) {
            double tempA = a;
            a = b;
            b = tempA;
            modifier = -1;
        }
        for (double i = a + INCREMENTO; i < b; i += INCREMENTO) {
            double dFromA = i - a;
            area += (INCREMENTO / 2) * (funcion.f(a + dFromA) + funcion.f(a + dFromA - INCREMENTO));

        }
        return (Math.round(area * 1000.0)/1000.0)*modifier;
    }

    public static void main(String[] args) { //MAIN
        //System.out.println(integral(0,2,x->(return Math.pow(x, 2))));
    }
}
