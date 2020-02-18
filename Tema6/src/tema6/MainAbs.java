/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.util.ArrayList;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainAbs {
    public static void main(String[] args) {
        //Perro pipo = new Perro();
        
        ArrayList<Persona> personas = new ArrayList<Persona>();
        
        Hombre h = new Hombre("Paco","Pietro",27,73,105);
        Mujer m = new Mujer("Maria","Mari",22,50,185);
        
        personas.add(h);
        personas.add(m);
        
        for(Persona gente : personas){
            //System.out.println(gente);
            if(gente instanceof Hombre){
                Hombre hombre = (Hombre)gente;
                hombre.tieneBarba=false;
            }
            
            
            
        }
        
        for(Persona per : personas){
            System.out.println(per);
        }
    }
}
