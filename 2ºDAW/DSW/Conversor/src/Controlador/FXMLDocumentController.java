package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import Modelo.Modelo;

/**
 * FXML Controller class
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextArea pantalla;
    @FXML
    private Button eurosDolares;
    @FXML
    private Button dolaresEuros;
    
    Modelo modelo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        modelo = new Modelo();
    }    

    @FXML
    private void eurosDolares(ActionEvent event) {
        
        float num = Float.parseFloat(pantalla.getText());
        
        float res = modelo.eurosDolares(num);
        
        pantalla.setText(Float.toString(res));
        
    }

    @FXML
    private void dolaresEuros(ActionEvent event) {
        
        float num = Float.parseFloat(pantalla.getText());
        
        float res = modelo.dolaresEuros(num);
        
        pantalla.setText(Float.toString(res));
        
    }
    
}
