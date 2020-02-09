/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class CuentaBancaria {

    private String ncuenta;
    private String propietario;
    private double salario;
    private ArrayList<Movimiento> movimiento;
    private HashMap<Date, Movimiento> mov;
    
    public CuentaBancaria(){
        
    }
    
    
}
