/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guachingo;

import java.util.Random;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class GuachinGO {

    
    public static void main(String[] args) {
        
        Random rd = new Random();
        String guachinches[] = {"El Albarote", "Tomas de las Costillas", "Pico Viejo", "Isabelina", "El Almirante"};
        int a=rd.nextInt(guachinches.length);
        
        System.out.println("Hoy comemos en "+guachinches[a]);
        System.out.println("Today we eat at "+guachinches[a]);
        
        System.out.println("Ubicación / ubication: \n"+ubicacion(a));
        
        
    }
    
    public static String ubicacion(int num){
        String rest="";
        switch(num){
            case 0:
                rest="Diríjete hasta Santa Úrsula / You need to go to Santa Úrsula";
                break;
            case 1:
                rest="Debes ir hasta Tacoronte / You need to go to Tacoronte.";
                break;
            case 2:
                rest="Debes ir hasta La Corujera / You need to go to La Corujera";
                break;
            case 3:
                rest="Debes ir subiendo la Corujera y lo tendrás a mano izquierda / When you go up the"
                        + " Corujera, see at your left.";
                break;
            case 4:
                rest="Este sitio no existe / This place doesnt exists";
                break;
        }
        return rest;
    }
    
}
