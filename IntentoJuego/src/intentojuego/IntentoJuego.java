/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intentojuego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class IntentoJuego extends Canvas implements Runnable {

    //Atributos
    private static JFrame ventana; //Objeto ventana
    private static Thread thread;
    private static final int WIDTH = 800; //Ancho y alto
    private static final int HEIGHT = 800;
    private static final String NAME = "Juego de Víctor"; //Nombre a recibir
    private static volatile boolean enFuncionamiento = false;

    //Constructores
    public IntentoJuego() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        ventana = new JFrame(NAME); //Nombre de la ventana del juego
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //La ventana se cierra junto con el programa
        ventana.setResizable(false); //Evita que el usuario pueda redimensionar la ventana del juego
        ventana.setLayout(new BorderLayout());
        ventana.add(this, BorderLayout.CENTER);
        ventana.pack(); //Se redimensiona el juego a 800x800 y evita cosas raras con la ventana
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true); //Ventana de juego visible cuando ejecutemos el programa
    }

    //Métodos
    @Override
    public void run() {
        
        final int NSPORSEGUNDO = 1000000000;
        final byte APSOBJETIVO = 60;
        final double NSPORUPDATE = NSPORSEGUNDO / APSOBJETIVO;
        
        long referencia = System.nanoTime();
        
        double tiempoTranscurrido;
        double delta = 0;
                
        while (enFuncionamiento) {
            final long INICIOBUCLE = System.nanoTime();
            tiempoTranscurrido = INICIOBUCLE - referencia;
            referencia = INICIOBUCLE;
            delta += tiempoTranscurrido / NSPORUPDATE;
            
            while(delta>=1){
                actualizar();
                delta--;
            }
            
            mostrar();
        }
    }

    public synchronized void iniciar() {
        enFuncionamiento = true;
        thread = new Thread(this, "Gráficos");
        thread.start();
    }

    private synchronized void detener() {
        enFuncionamiento = false;
        try {
            thread.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    private void actualizar(){
        
    }
    
    private void mostrar(){
        
    }

}
