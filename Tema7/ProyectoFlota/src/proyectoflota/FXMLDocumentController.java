/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoflota;

import java.net.URL;
import java.util.ArrayList;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try{
        //T.generarBarcos();
        }catch(Exception x){
            resultados.setText("No se pudieron poner barcos");
        }
    }    

    @FXML
    private void disparoJugador(ActionEvent event) {
        
        
        
        
        
    }
    
}
