/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoflota.programa;

import java.util.Random;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MesaJuego {

    //Atributos
    public Componentes[][] mar = new Componentes[4][4];
    public int maar[][] = new int[4][4];

    //Métodos
    public void oceanoAgua() {

        for (int i = 0; i < mar.length; i++) {
            for (int j = 0; j < mar[0].length; j++) {

                mar[i][j] = Componentes.AGUA;

            }

        }

    }

    /**
     * 
     * @return Disparo del jugador.
     */
    public boolean disparo(int x, int y) {
        boolean disparo = false;

        if (mar[x][y] == Componentes.AGUA) {

            mar[x][y] = Componentes.DISPARO;
            disparo = false;

        } else if (mar[x][y] == Componentes.BARCO) {

            mar[x][y] = Componentes.TOCADO;
            disparo = true;

        }

        return disparo;

    }

    /**
     * @return Barcos aleatorios de la IA.
     */
    public void generarBarcos() {
        Random rd = new Random();
        for (int i = 0; i < 3; i++) {
            mar[rd.nextInt(4)][rd.nextInt(4)] = Componentes.BARCO;
        }
    }
    
    /**
     * 
     * @return Disparo de la máquina
     */
    public void disparoIA() {
        Random rd = new Random();
        int dis1 = rd.nextInt(4);
        int dis2 = rd.nextInt(4);

        if (mar[dis1][dis2] == Componentes.AGUA) {

            mar[dis1][dis2] = Componentes.DISPARO;

        } else if (mar[dis1][dis2] == Componentes.BARCO) {

            mar[dis1][dis2] = Componentes.TOCADO;

        }


    }


}
