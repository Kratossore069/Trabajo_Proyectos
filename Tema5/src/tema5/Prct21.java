/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Comparator;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */

class Telegrama{
    
    private String texto, remitente, receptor;
    private double precioPalabra;

    public Telegrama(String texto, String remitente, String receptor, double precioPalabra) {
        this.texto = texto;
        this.remitente = remitente;
        this.receptor = receptor;
        this.precioPalabra = precioPalabra;
    }
    
    public double coste(){
        double precio = this.texto.length() * this.precioPalabra;
        return precio;
    }

    @Override
    public String toString() {
        return "Telegrama{" + "texto=" + texto + 
                ", remitente=" + remitente + 
                ", receptor=" + receptor + 
                ", precioPalabra=" + precioPalabra + '}';
    }
    
    
    
    
    
}

 abstract class ComparadorTelegrama implements Comparator<Telegrama>{
    
}


public class Prct21 {
    /*
    Práctica 21: Crear la clase Telegrama con atributos: String texto, String remitente, String
receptor, double precioPalabra Deberá tener como mínimo un constructor. La longitud del
atributo texto determina el coste del telegrama al multiplicarlo por precioPalabra. Deberá
haber un método: double coste() y un método toString() que ponga una cabecera que diga
quién es el remitente, a quién va dirigido y luego el texto del telegrama. Crear un programa
que use la clase telegrama donde el usuario introduzca los datos de cada telegrama y estos
queden insertados ordenados por coste en una lista. Se debe crear una nueva clase:
ComparadorTelegrama que implemente Comparator para mantener la lista ordenada
    
    Main21
    */
}
