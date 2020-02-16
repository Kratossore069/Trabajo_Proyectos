/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class CuentaBancaria {

    //ATRIBUTOS
    private String ncuenta;
    private String propietario;
    private double salario;
    private ArrayList<Movimiento> movimiento;
    private HashMap<Date, Movimiento> mov;
    private LocalDate tiempo;
    
    //CONSTRUCTORES
    public CuentaBancaria(){
        tiempo = LocalDate.now();
    }
    
    //MÉTODOS

    @Override
    public String toString() {
        return "CuentaBancaria{" + '}';
    }
    
    public void mostrarCuentas(){
        for (Date cuentas : mov.keySet()) { //<---- Aquí se ven las fechas de movimientos y los movimientos
            System.out.println("Fecha : "+cuentas+" Operación: "+mov.get(cuentas));
        }
    }
    
    
    
    //GETTER Y SETTER

    public String getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Movimiento> getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(ArrayList<Movimiento> movimiento) {
        this.movimiento = movimiento;
    }

    public HashMap<Date, Movimiento> getMov() {
        return mov;
    }

    public void setMov(HashMap<Date, Movimiento> mov) {
        this.mov = mov;
    }
    
    
    
    
    
}
