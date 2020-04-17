/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafxml;

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
    
    
    //Constructor
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        calculadora = new Calculadora();
    }    
    
    //Métodos


    @FXML
    private void operando(ActionEvent event) { //Números
        
        Button digito = (Button)event.getSource();
        String textDigito = digito.getText();
        int numero = Integer.parseInt(textDigito);
        calculadora.digitos(numero);
        pantalla.setText(pantalla.getText()+numero);
    }

    @FXML
    private void resultado(ActionEvent event) {
       
    }

    @FXML
    private void operador(ActionEvent event) { //Operaciones
        Button operador = (Button)event.getSource();
        String textOperar = operador.getText();
        calculadora.operacion(textOperar);
        pantalla.setText(textOperar);
        pantalla.setText(" ");
        
    }
    
}

