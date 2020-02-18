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

class Cuenta{
    protected String numero;
    protected String titular;
    protected double saldo;

    public Cuenta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void ingresar(){
        
    }
    
    public void retirar(){
        
    }
}

class CuentaBCTT extends Cuenta{
    
    public CuentaBCTT(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }
    
    //@Override
    public void ingresar(int num){
        saldo += num - 0.50;
    }
    
    //@Override
    public void retirar(int num){
        saldo += (num - 0.02);
    }
    
}

public class Prct07 {
    /*
    Práctica 7: Tomando la clase Cuenta que definimos en la UT sobre clases y objetos:
atributos: String numero, String titular, double saldo, ingresar(), retirar() Crear una clase
hija llamada CuentaBCTT que refleja las cuentas del banco BCTT Este banco por cada
ingreso retiene en comisión 0.50€ y por cada retirada de efectivo un 0.02% del dinero
retirado. Hacer uso de la palabra reservada super
    */
}
