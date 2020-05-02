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
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javax.xml.ws.Action;

/**
 * FXML Controller class
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class FXMLDocumentController implements Initializable {

    //Atributos creados o salidos del FXML
    @FXML
    private GridPane grid;

    private Tablero tablero;
    @FXML
    private TextArea resultados;
    @FXML
    private Button btn00;
    @FXML
    private Button btn01;
    @FXML
    private Button btn02;
    @FXML
    private Button btn10;
    @FXML
    private Button btn11;
    @FXML
    private Button btn12;
    @FXML
    private Button btn20;
    @FXML
    private Button btn21;
    @FXML
    private Button btn22;
    @FXML
    private Button btn30;
    @FXML
    private Button btn31;
    @FXML
    private Button btn32;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tablero = new Tablero();
       /* ObservableList<Node> children = grid.getChildren();
        for (Node node : children) {
            Button btn = (Button)node;
        }*/
    }    
    
    //Métodos
    
    @FXML
    private void disparo(){
        //btn00.
    }
    
}
