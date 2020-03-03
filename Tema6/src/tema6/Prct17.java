/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */

interface ORdenable{

    public boolean esMayorQue();
    public boolean esMenorQue();
    public boolean esIgualQue();
    
}

class PERSona implements ORdenable{
    
    //Lanza un error que pide que hay que implementar los métodos abstractos de la interfaz ORdenable
    @Override
    public boolean esMayorQue() {
        
    }

    @Override
    public boolean esMenorQue() {
        
    }

    @Override
    public boolean esIgualQue() {
        
    }
    
}



public class Prct17 {
    /*
    Práctica 17: Crear la interfaz: Ordenable
    e incluir como métodos: boolean
    esMayorQue() , esMenorQue(), esIgualQue() Implementar el interfaz en la clase Persona
    (tomaremos la clase abstracta que ya hemos usado en esta unidad ) ¿ qué ocurre en el IDE
    cuándo escribimos: Persona implements Ordenable ? ( tomar captura de pantalla )
    mediante alt+enter hacer el override
    */
}
