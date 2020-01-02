/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Ventana extends JFrame {

    // Constructores
    public Ventana() {
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Se cierra la ventana y se cierra el programa
        setTitle("Ventana de Víctor"); //Título
        setBounds(200, 200, 380, 380); //Dónde aparece y tamaño de la ventana
        setLocationRelativeTo(null); //Centra la pantalla
        componentes();
    }

    //Métodos
    private void componentes() {
        JPanel panel = new JPanel();
        getContentPane().add(panel); //Ponemos un panel
        panel.setBackground(Color.black); //Color
        panel.setLayout(null); //Permite poner los textos donde se quiera
        
        JLabel etiqueta = new JLabel("Buenas tardes", SwingConstants.CENTER); //Manda un mensaje y centra el texto
        etiqueta.setForeground(Color.yellow);
        etiqueta.setBounds(5,5,150,50); //Dimensiones de la pantalla y las letras
        etiqueta.setOpaque(true); //Desactivar el diseño por defecto de las etiquetas
        etiqueta.setBackground(Color.red); //Color de fondo de la etiqueta
        etiqueta.setFont(new Font("arial",Font.ITALIC,15)); //Establecemos la fuente de text
        panel.add(etiqueta); //Agregamos la etiqueta
        
        JLabel imagen = new JLabel(new ImageIcon("/home/victor/Escritorio/duck.jpg")); //Creamos un elemento con la imagen
        imagen.setBounds(10, 80, 200, 200); //Redimensionamos la imagen
        panel.add(imagen); //Insertamos la imagen
    }

    //Main
    public static void main(String[] args) {

        Ventana v1 = new Ventana();

        v1.setVisible(true); //La ventana se hace visible
    }
}
