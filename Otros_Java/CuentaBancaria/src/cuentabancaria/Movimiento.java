/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Movimiento {

    //ATRIBUTOS
    
    private double cuantia;
    private Date fecha;
    public String asunto;
    private HashMap<String, Double> mov;
    
    //CONSTRUCTOR
    
    public Movimiento(){
        mov = new HashMap<String, Double>();
    }
    
    //MÉTODOS
    
    public void sacarDinero(int a){
        if(cuantia <= 0){
            System.out.println("No puedes sacar dinero porque no tienes.");
        }else{
            cuantia -= a;
        }
    }
    
    public void ingresarDinero(int a){
        cuantia += a;
    }
    
    public void asunto(String a){
        asunto = a;
    }
    
    public void mostrar(){
        for(String datos : mov.keySet()){ //< ----- Y aquí se muestran
            System.out.println("Asunto: "+datos+" Dinero: "+mov.get(datos));
        }
    }
    
    public void fecha(Date a){
        fecha = a;
    }
    
    public void aniadirMovimientos(String a, double b){ //<---- Se recogen aquí uno por uno
        mov.put(a, b);
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
