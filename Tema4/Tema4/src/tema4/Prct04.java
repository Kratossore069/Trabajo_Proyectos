/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Víctor_Gabriel_Carvajal_Aróstegui
 */
class Conversor {

    double tasaDeCambio;
    double euro, dolar;
    
    public Conversor(double e, double d, double t){ //Constructor
        tasaDeCambio = t; 
        euro = e;
        dolar = d;
    }
    
    double moneda1ToMoneda2(double euro){ //DEVUELVE EL CAMBIO
        //System.out.println(tasaDeCambio * euro);
        return euro/tasaDeCambio;
    }
    
    double moneda2ToMoneda1(double dolar){ //DEVUELVE EL CAMBIO
        //System.out.println(tasaDeCambio * euro);
        return tasaDeCambio * dolar;
    }
    
    void establecerTipo(double tipo){ //ESTABLECE EL TIPO DE CAMBIO
        tasaDeCambio = tipo;
    }
    
}

public class Prct04 {

    public static void main(String[] args) {
        /* Práctica 4:  Crear la clase: Conversor   Esta clase sirve para 
                cambiar de euros a dolares y dedolares a euros. Tiene 
                        un constructor que recibe el tipo de cambio 
        (utilizar el cambio actual)Pongamos por ejemplo: 0.8615   y 
                tiene dos métodos: euroToDolar()  y  dolarToEuro() 
                quereciben un double que representa respetivamente 
                        euros y dolares y devuelve la divisatransformada.
                                También   tiene   un   método   
                                        llamado:   */
        // establecerTipo(double   t)     
        /*que   nospermitirá modificar posteriormente el tipo de cambio por si cambia con el tiempo*/
        
        Conversor conversor = new Conversor(1,1,0.8615); //Información que va al constructor
        
        System.out.println("Intro euros");
        Scanner sc = new Scanner(System.in);
        
        double euros = sc.nextDouble();
        
        System.out.println("Tu cambio es de "+conversor.moneda1ToMoneda2(euros));
        
        
        
    }
}
