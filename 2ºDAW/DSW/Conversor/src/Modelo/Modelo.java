/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Modelo {
    
    /**
     * @param euros son los euros que recibe la función
     * @return retorna los dólares
     */
    public float eurosDolares(float euros)
    {
        float resulDolares = (float)(euros * 1.17);
        
        return resulDolares;
        
    }
    
    /**
     * @param dolares son los dolares para transformarlos en euros
     * @return retorna los euros
     */
    public float dolaresEuros(float dolares)
    {
        
        float resulEuros = (float)(dolares * 0.86);
        
        return resulEuros;
        
    }
    
}
