/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlesruntime;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author carlos
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private AnchorPane apRaiz;
    @FXML
    private Button button;
    @FXML
    private GridPane grid;
    
        int contadorFilas=0;
    @FXML
    private ScrollPane scroll;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        
        //int columna = 2;
        
        
        //col
        
        
        
        Button boton = new Button();
        
        
        
        //apRaiz.getChildren().add(boton);
        
        boton.setText("un texto");
        boton.setId("btn"+contadorFilas);
        boton.addEventHandler(MouseEvent.MOUSE_CLICKED, evt->{
            Button boton2 = (Button)evt.getSource();
            Label lblDeEsteBoton = mapaControles.get(boton2);
            lblDeEsteBoton.setText("texto puesto al buscar el id");
            //String id = boton2.getId();
            //System.out.println("botón: " +id);
            //Label lookup = (Label)grid.lookup("#lbl" + id.replace("btn", ""));
            //lookup.setText("texto puesto al buscar el id");
            //boton2.setText("hemos pulsado");
            //boton2.setLayoutX(50);
            //boton2.setLayoutY(100);
        
        });
        grid.add( boton , 2, contadorFilas);
        Label lbl = new Label();
        //lbl.setId("lbl"+contadorFilas);
        
        lbl.setText("creado en runtime");
        grid.add( lbl , 1, contadorFilas);
        
        mapaControles.put(boton, lbl);
       
        
        
        /*
          000000000000000000 btn0  00000000000000000000
          0000  btn1  000000000000000000000000000000000
          000000000000000000000000000000 btn2 000000000
        
          HashMap<String,String> dicc 
        dicc.put("hola","hello");
        
        "hello" <--- dicc.get("hola")
            hola    ----> hello
        
            adiós   ----> bye
        
        
        HashMap<Button,Label> mapaControles
         Label <-- mapaControles.get(boton)
        
        */
        
        
        
        
        TextField txt = new TextField();
        
        txt.setText("un text");
        txt.setId("txt"+contadorFilas);
        grid.add( txt , 0, contadorFilas);
        
        contadorFilas++;
        
        //boton.addEventHandler(MouseEvent.MOUSE_CLICKED, evt->agregarDato(evt))
    }
    
    
    HashMap<Button,Label> mapaControles = new HashMap();

    
    ArrayList<Object> objetosRuntime = new ArrayList<>();
    
    //private Button boton;
    
    private void metodoEjecutar(MouseEvent evt){
    


    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        // TODO
    }    
    
}
