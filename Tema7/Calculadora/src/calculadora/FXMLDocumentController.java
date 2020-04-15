/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class FXMLDocumentController implements Initializable {
    
    //Atributos
    
    private Calculadora calculadora;
    
    private Label label;
    @FXML
    private TextArea pantalla;
    @FXML
    private Button num1;
    @FXML
    private Button num2;
    @FXML
    private Button num3;
    @FXML
    private Button num4;
    @FXML
    private Button igual;
    @FXML
    private Button boton5;
    @FXML
    private Button boton6;
    @FXML
    private Button boton7;
    @FXML
    private Button boton8;
    @FXML
    private Button boton9;
    @FXML
    private Button botonrestar;
    @FXML
    private Button botondivide;
    @FXML
    private Button botonsumar;
    @FXML
    private Button botonmulti;
    
   /* private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }*/
    
    //Métodos
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        calculadora = new Ini();
    }    

    @FXML
    private void pulsar1(ActionEvent event) {
        this.pantalla.setText("1");
    }

    @FXML
    private void pulsar2(ActionEvent event) {
        this.pantalla.setText("2");
    }

    @FXML
    private void pulsar3(ActionEvent event) {
        this.pantalla.setText("3");
    }

    @FXML
    private void pulsar4(ActionEvent event) {
        this.pantalla.setText("4");
    }

    @FXML
    private void botonigual(ActionEvent event) {
        this.pantalla.setText("=");
    }

    @FXML
    private void pulsar5(ActionEvent event) {
        this.pantalla.setText("5");
    }

    @FXML
    private void pulsarel6(ActionEvent event) {
        this.pantalla.setText("6");
    }

    @FXML
    private void pulsarboton7(ActionEvent event) {
        this.pantalla.setText("7");
    }

    @FXML
    private void pulsarboton8(ActionEvent event) {
        this.pantalla.setText("8");
    }

    @FXML
    private void pulsarboton9(ActionEvent event) {
        this.pantalla.setText("9");
    }

    @FXML
    private void pulsarrestar(ActionEvent event) {
        this.pantalla.setText("-");
    }

    @FXML
    private void pulsardividir(ActionEvent event) {
        this.pantalla.setText("/");
    }

    @FXML
    private void pulsarsumar(ActionEvent event) {
        this.pantalla.setText("+");
    }

    @FXML
    private void pulsarmultiplicar(ActionEvent event) {
        this.pantalla.setText("*");
    }
    
}
