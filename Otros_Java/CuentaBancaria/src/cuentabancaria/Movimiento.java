/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import java.util.Date;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Movimiento {

    //ATRIBUTOS
    
    private double cuantia;
    private Date fecha;
    public String asunto;
    
    //CONSTRUCTOR
    
    public Movimiento(){
        
    }
    
    //MÉTODOS
    
    public void asunto(String a){
        asunto = a;
    }
    
    public void fecha(){
        
    }
    
    public void dinero(double dinero){
        cuantia += dinero;
    }
    
    public void mostrar(){
        System.out.println("Asunto: "+asunto+"\n"
                + "Fecha: "+fecha+"\n"
                + "Dinero: "+cuantia+"\n");
    }
    
    //GETTER Y SETTER
    
    public double getCuantia() {
        return cuantia;
    }

    public void setCuantia(double cuantia) {
        this.cuantia = cuantia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    
    
    
}
