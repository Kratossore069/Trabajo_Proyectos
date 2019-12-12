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
class Camion {

    private String marca;
    private double potencia;
    private String matricula;
    
    public Camion(){
        
    }
    
    public Camion(String m){
        this.marca = m;
    }
    
    public Camion(String marca, double p, String mat){
        this.marca = marca;
        this.potencia = p;
        this.matricula=mat;
    }

    public String getMatricula() {
        return this.matricula; // return matricula; valdria tambien
    }

    public String setMatricula(String matricula) {
        //como matricula es un parametro que recibe el método se puede confundir
        //con el atributo matricula. Aqui es necesario this para diferenciar
        return this.matricula = matricula;
    }
}

public class Prct12 {

    /*Práctica 12: Completar la clase Camion con varios constructores.Uno para cuando no se le pasan paramentros, otro para únicamente la marca, otro con todos,
    … Se deberá usar la
    palabra reservada this para cada vez que nombremos un atributo en los constructores o en
    los métodos*/
    public static void main(String[] args) {
        
    }
    
}
