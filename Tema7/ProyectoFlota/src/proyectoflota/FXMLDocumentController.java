/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoflota;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import proyectoflota.programa.T;

/**
 * FXML Controller class
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextArea resultados;
    @FXML
    private Button btn00;
    @FXML
    private Button btn33;
    @FXML
    private Button btn32;
    @FXML
    private Button btn31;
    @FXML
    private Button btn30;
    @FXML
    private Button btn23;
    @FXML
    private Button btn22;
    @FXML
    private Button btn21;
    @FXML
    private Button btn20;
    @FXML
    private Button btn13;
    @FXML
    private Button btn12;
    @FXML
    private Button btn11;
    @FXML
    private Button btn10;
    @FXML
    private Button btn03;
    @FXML
    private Button btn02;
    @FXML
    private Button btn01;
    @FXML
    private Button agua1;
    @FXML
    private Button agua16;
    @FXML
    private Button agua15;
    @FXML
    private Button agua14;
    @FXML
    private Button agua13;
    @FXML
    private Button agua12;
    @FXML
    private Button agua11;
    @FXML
    private Button agua10;
    @FXML
    private Button agua9;
    @FXML
    private Button agua8;
    @FXML
    private Button agua7;
    @FXML
    private Button agua6;
    @FXML
    private Button agua5;
    @FXML
    private Button agua4;
    @FXML
    private Button agua3;
    @FXML
    private Button agua2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO No se toca mucho
        
        T tablero = new T(); //Se generan barcos de manera aleatoria, en total 3
        tablero.generarBarcos();
        
    }    

    @FXML
    private void disparoJugador(ActionEvent event) {
        
        
        
        
        
        
    }
    
}
