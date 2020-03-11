/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication87;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */


class Fecha extends Date{

    @Override
    public boolean equals(Object obj) {
        boolean resultado = false;
        try{
            Fecha other = (Fecha) obj;
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String strDateThis= formatter.format(this);
            String strDateOther= formatter.format(other);
            resultado = strDateThis.equals(strDateOther);
        }catch(Exception ex){
            resultado = false;
        }
        return resultado; 
    }

    @Override
    public int hashCode() {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String strDateThis= formatter.format(this); 
        try {
            Date date = formatter.parse(strDateThis);
            //System.out.println("" +date.getTime());
            //System.out.println(date.getTime()/10000);
            return (int)(date.getTime()/10000);
        } catch (ParseException ex) {
            Logger.getLogger(Fecha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return super.hashCode();
        
    }

    
    
    
}

public class HaciendoHash {
    
    
    public static void main(String[] args) {
        
        HashMap<Fecha,ArrayList<Fecha>> fechas = new HashMap<>();
        
        Fecha f1 = new Fecha();
        
        Fecha f2 = new Fecha();
        f2.setTime(f2.getTime() - 1000*3600*24);
        
        
        Fecha f3 = new Fecha();
        f3.setTime(f2.getTime()  -50000);

        Fecha f4 = new Fecha();
        f4.setTime(f1.getTime() - 50000);  
        
        
        
        if( fechas.get(f1) == null ){
            ArrayList<Fecha> fecs = new ArrayList<Fecha>();
            fechas.put(f1, fecs);
            fecs.add(f1);
        }else{
            ArrayList<Fecha> fecs = fechas.get(f1);
            boolean encontrado = false;
            for (int i = 0; i < fecs.size() && !encontrado; i++) {
                if( f1 == fecs.get(i)){
                    encontrado = true;
                }
                
            }
            
            if(!encontrado)
                fecs.add(f1);
        }
        
        
        if( fechas.get(f2) == null ){
            ArrayList<Fecha> fecs = new ArrayList<Fecha>();
            fechas.put(f2, fecs);
            fecs.add(f2);
        }else{
            ArrayList<Fecha> fecs = fechas.get(f2);
            boolean encontrado = false;
            for (int i = 0; i < fecs.size() && !encontrado; i++) {
                if( f2 == fecs.get(i)){
                    encontrado = true;
                }
                
            }
            
            if(!encontrado)
                fecs.add(f2);
        }


        if( fechas.get(f3) == null ){
            ArrayList<Fecha> fecs = new ArrayList<Fecha>();
            fechas.put(f3, fecs);
            fecs.add(f3);
        }else{
            ArrayList<Fecha> fecs = fechas.get(f3);
            boolean encontrado = false;
            for (int i = 0; i < fecs.size() && !encontrado; i++) {
                if( f3 == fecs.get(i)){
                    encontrado = true;
                }
                
            }
            
            if(!encontrado)
                fecs.add(f3);
        }




        if( fechas.get(f4) == null ){
            ArrayList<Fecha> fecs = new ArrayList<Fecha>();
            fechas.put(f4, fecs);
            fecs.add(f4);
        }else{
            ArrayList<Fecha> fecs = fechas.get(f4);
            boolean encontrado = false;
            for (int i = 0; i < fecs.size() && !encontrado; i++) {
                if( f4 == fecs.get(i)){
                    encontrado = true;
                }
                
            }
            
            if(!encontrado)
                fecs.add(f4);
        }      
        
        
        //System.out.println(fechas);
        
        System.out.println(fechas.get(f1));
        System.out.println(fechas.get(f2));
        System.out.println(fechas.get(f3));
        System.out.println(fechas.get(f4));
        System.out.println("");
        System.out.println(fechas);
        
    }
    
}

