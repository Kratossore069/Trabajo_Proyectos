/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
class Movimiento {

}

class Fecha extends Date {
    public Fecha(String str){
        super();
    }

    public Fecha(long date) {
        super(date);
    }

    
    
    

    @Override
    public int hashCode() {
        
        int hash;
        int longCodigo=(int)this.getTime()/10000;
        return longCodigo;
        
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

public class AlgoComoEquals {

    public static void main(String[] args) {
        HashMap<Fecha, ArrayList<Movimiento>> movimientosFecha = new HashMap<>();

        Fecha d = new Fecha(2020,3,11); //Fecha de hoy

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        
        
        
        System.out.println(d.getTime());
        
        System.out.println((new Date()).getTime());
    }

}
