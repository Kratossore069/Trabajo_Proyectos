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
    @FXML
    private Button num0;
    @FXML
    private Button numLimpiar;
    
    private int numero1;
    private String operador="";
    
    
    //Constructor
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        calculadora = new Calculadora();
    }    
    
    //Métodos

    
    //¿Cómo decirle al programa qué numero es el primero y cuál es el segundo?

    @FXML
    private void operando(ActionEvent event) { //Números
        
        Button digito = (Button)event.getSource(); //Recogemos el botón y la señal
        String textDigito = digito.getText(); //Recogemos el texto del botón seleccionado
        numero1= Integer.parseInt(textDigito); //Llevamos ese entero a una variable global
        //calculadora.digitos(numero1);
        pantalla.setText(pantalla.getText()+numero1); //Sale por pantalla los números insertados
    }

    @FXML
    private void resultado(ActionEvent event) {
        int res = calculadora.operacion(numero1,numero1, operador); 
        pantalla.setText(""+res);
    }

    @FXML
    private void operador(ActionEvent event) { //Operaciones
        Button operado = (Button)event.getSource();
        operador= operado.getText();
        //calculadora.operacion(numero1,numero1,operador);
        pantalla.setText(operador);
        //pantalla.setText(" ");
        
    }

    @FXML
    private void limpiar(ActionEvent event) {
        pantalla.setText(" ");
        calculadora.operacion(0, 0, "+");
    }
    
    
}

