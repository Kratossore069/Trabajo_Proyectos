/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Cohete {
    
    //Atributos
    private String name;
    private boolean fuselaje=false;
    private int cohetes;
    private int tripulantes;
    
    //Constructores
    public Cohete(String name){
        this.name = name;
    }
    
    //Métodos
    public void ponerFuselaje(boolean fus){
        if(!fus){
            this.fuselaje = fus;
            System.out.println("El cohete no puede despegar sin fuselaje.");
        }else{
            this.fuselaje = fus;
            System.out.println("Cuerpo OK");
        }
    }
    
    public void verCohetes(int num){
        if(num<2){
            this.cohetes = num;
            System.out.println("No puede despegar, faltan "+(2-num)+" cohetes.");
        }else{
            this.cohetes = num;
            System.out.println("Cohetes OK");
        }
    }
    
    public void verTripulantes(int num){
        if(num<4){
            this.tripulantes = num;
            System.out.println("Pocos tripulantes, faltan "+(4-num));
        }else{
            this.tripulantes = num;
            System.out.println("Tripulantes OK");
        }
    }
    
    public void despegar(){
       if(this.fuselaje=true && this.cohetes==2 && this.tripulantes==4){
           System.out.println("Despegue inmediato");
       }else{
           System.out.println("Error grave, revisar:\nFuselaje "+this.fuselaje+"\nCohetes "+this.cohetes+"\nTripulantes "+this.tripulantes);
       }
    }
    
    //Getter y Setter
}
