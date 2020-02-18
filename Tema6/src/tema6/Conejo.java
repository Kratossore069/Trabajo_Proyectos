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
public class Conejo implements Ordenable{
    
    double peso;

    public Conejo(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean esMayorQue(Object or) {
        return this.peso > or.peso;
    }

    @Override
    public boolean esIgualQue(Object or) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean esMenorQue(Object or) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
}
