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
interface ImprimirMayuscula {

    void imprimirMayus(Mujer m);

}

public class Anonima implements ImprimirMayuscula{

    public static void main(String[] args) {
        ImprimirMayuscula<Mujer> iem = new ImprimirMayuscula<Mujer>() {
            @Override
            public void imprimirMayuscula(Mujer mujer) {
                String val = mujer.toString();
                System.out.println(val.toUpperCase());
            }
        };
        
        
        
        iem.imprimirMayuscula(nuevaMujer);
        ArrayList<ImprimirMayuscula> imprimibles = new ArrayList<>();
        imprimibles.add(iem);
    }

    @Override
    public void imprimirMayus(Mujer m) {
        
    }
}
