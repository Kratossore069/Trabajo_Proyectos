/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Ventana extends JFrame {

    // Constructores
    public Ventana() {
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Se cierra la ventana y se cierra el programa
        setTitle("Ventana de Víctor"); //Título
        setBounds(200, 200, 300, 300); //Dónde aparece y tamaño de la ventana
        setLocationRelativeTo(null); //Centra la pantalla
        componentes();
    }

    //Métodos
    private void componentes() {
        JPanel panel = new JPanel();
        getContentPane().add(panel); //Ponemos un panel
        panel.setBackground(Color.black); //Color
        panel.setLayout(null); //Permite poner los textos donde se quiera
        
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Buenas noches");
        etiqueta.setBounds(10,10,90,90);
        panel.add(etiqueta); //Agregamos la etiqueta
    }

    //Main
    public static void main(String[] args) {

        Ventana v1 = new Ventana();

        v1.setVisible(true); //La ventana se hace visible
    }
}
