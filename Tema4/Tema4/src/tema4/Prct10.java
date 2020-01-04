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

class Cuenta{
    
    String numero, titular;
    double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    //CONSTRUCTOR
    
    public Cuenta(String n, String t, double s){
        numero = n;
        titular = t;
        saldo = s;
    }
    
    //MÉTODOS
    
    public double ingresar(){
        double res=0;
        return res;
    }
    
    public double retirar(){
        double res=0;
        return res;
    }
}
public class Prct10 {
    public static void main(String[] args) {
        /*Práctica 10: Crear una clase llamada Cuenta que refleje una cuenta bancaria. Tiene por
        atributos: String numero, String titular, double saldo Así como los métodos ingresar() y
        retirar() que servirán para añadir o quitar saldo*/
        
        
    }
}
