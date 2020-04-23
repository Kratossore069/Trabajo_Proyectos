/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacanvas.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Juego implements Initializable {
    
    private Label label;
    @FXML
    private Canvas canvas;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        GraphicsContext gc = canvas.getGraphicsContext2D();
        /*gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, 100, 200);
        
        gc.setFill(Color.BLUE);
        gc.fillRect(100, 0, 100, 200);
        
        gc.setFill(Color.YELLOW);
        gc.fillRect(100, 0, 100, 200);*/
        
        gc.setLineWidth(3.0);
        gc.setStroke(Color.BLACK);
        gc.strokeLine(50, 50, 50, 100);
        gc.strokeLine(50, 100, 200, 100);
        gc.strokeOval(200, 100, 5, 5);
    }    
    
}
