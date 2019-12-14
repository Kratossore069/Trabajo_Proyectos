/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */

class Factura{

    double total;
    String detalle;
    
    //Constructores
    
    public Factura(){
        
    }
    
    public Factura(Factura factura2){//Copia
        
    }
    
    //Métodos
    
    public void agregar(String articuloConsumido, double precio){
        this.detalle = articuloConsumido;
        this.total = precio;
    }
    
    public void imprimir(){
        int precioTotal = 0;
        System.out.println(detalle+" "+total);
    }
}

public class Prct17 {
    /*Práctica 17: Crear una clase Factura que tenga como mínimo los atributos: double total,
    String detalle y los métodos agregar(String articuloConsumido, double precio) e imprimir()
    así como un constructor de copia
    agregar() permite añadir al String detalle el nombre del artículo que se ha consumido y el
    precio de ese artículo a la vez que añade al total el precio.
    imprimir() devuelve un String que muestra los artículos consumidos y el precio de cada uno
    de ellos así como el total de la factura*/
    
    public static void main(String[] args) {
        Factura factura = new Factura();
        
        factura.agregar("Papas", 10);
        
        factura.imprimir();
    }
}
