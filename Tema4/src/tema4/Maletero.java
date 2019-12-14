/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Maletero {
    
    private String maletero[];
    final int SIZE;
    
    public Maletero(){
        SIZE = 10;
        maletero = new String[SIZE];
    }
    
    
    boolean guardar(String objeto){
        boolean guardado = false;
        for (int i = 0; i < maletero.length && !guardado; i++) {
            if(maletero[i]==null){
                maletero[i]=objeto;
                guardado = true;
            }
        }
        return guardado;
    }
    
    boolean sacar(String objeto){
        boolean encontrado = false;
        for (int i = 0; i < maletero.length && !encontrado; i++) {
            if(maletero[i].equals(objeto)){
                maletero[i] = null;
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    String mostrar(){
        String res="";
        for (int i = 0; i < maletero.length; i++) {
            //System.out.println(maletero[i]);
            res += (maletero[i]==null)?"":maletero[i]+"\n";
        }
        return res;
    }
}
