/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Par<T, E> {
    
    private T clave;
    private E valor;
    
    public Par(T clave, E valor){
        this.clave = clave;
        this.valor = valor;
    }
    
    public String toString(){
        return ""+clave+" => "+valor;
    }
    
    public E getValor(){
        return valor;
    }
    
    public T getClave(){
        return clave;
    }
    
    public void setClave(T clave){
        this.clave = clave;
    }
    
    public void setValor(E valor){
        this.valor = valor;
    }
    
    
}
