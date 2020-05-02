/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundirflotagithubb;

import hundirflotagithubb.modelo.Tablero;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class FXMLDocumentController implements Initializable {

    private Tablero tablero;

    @FXML
    private TextArea resultados;
    @FXML
    private GridPane gridJugador;
    @FXML
    private GridPane gridMaquina;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tablero = new Tablero();
        
        //Creamos botones de disparo
        Button button1 = new Button("[0,0]");
        Button button2 = new Button("[0,1]");
        Button button3 = new Button("[0,2]");
        Button button4 = new Button("[1,0]");
        Button button5 = new Button("[1,1]");
        Button button6 = new Button("[1,2]");
        Button button7 = new Button("[2,0]");
        Button button8 = new Button("[2,1]");
        Button button9 = new Button("[2,2]");
        
        Button button10 = new Button("[0,0]");
        Button button11 = new Button("[0,1]");
        Button button12 = new Button("[0,2]");
        Button button13 = new Button("[1,0]");
        Button button14 = new Button("[1,1]");
        Button button15 = new Button("[1,2]");
        Button button16 = new Button("[2,0]");
        Button button17 = new Button("[2,1]");
        Button button18 = new Button("[2,2]");

        //Añadimos al grid propio que toca

        gridJugador.add(button1, 0, 0);
        gridJugador.add(button2, 1, 0);
        gridJugador.add(button3, 2, 0);
        
        gridJugador.add(button4, 0, 1);
        gridJugador.add(button5, 1, 1);
        gridJugador.add(button6, 2, 1);
        
        gridJugador.add(button7, 0, 2);
        gridJugador.add(button8, 1, 2);
        gridJugador.add(button9, 2, 2);
        
        //Añadimos al grid de la máquina
        
        gridMaquina.add(button10, 0, 0);
        gridMaquina.add(button11, 1, 0);
        gridMaquina.add(button12, 2, 0);
        
        gridMaquina.add(button13, 0, 1);
        gridMaquina.add(button14, 1, 1);
        gridMaquina.add(button15, 2, 1);
        
        gridMaquina.add(button16, 0, 2);
        gridMaquina.add(button17, 1, 2);
        gridMaquina.add(button18, 2, 2);
        
        

    }
    /**
     * @return Método que hace que se vea lo que salga en la pantalla.
     */
    private void texto(){
        
    }

}
