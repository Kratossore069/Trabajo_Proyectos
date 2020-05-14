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
        gc.strokeLine(100, 300, 400, 300); //Línea recta
        gc.strokeLine(200, 300, 200, -600); //Línea vertical en medio de la recta
        gc.strokeLine(200, 80, 400, -600); //Línea horizontal al lado del final de la vertical
        gc.strokeLine(200, 10, 400, 10); //Línea hacia abajo de la horizontal
        gc.strokeLine(400, 10, 400, 100); //Línea hacia abajo de la horizontal
        gc.strokeOval(400, 100, 50, 50); //Cabeza
        gc.strokeLine(400, 100, 400, 200); //Cuerpo
        gc.strokeLine(400, 200, 300, 200); //Brazo I
        gc.strokeLine(400, 200, 500, 200); //Brazo D
        gc.strokeLine(400, 200, 300, 250); //Pierna I
        gc.strokeLine(400, 200, 500, 250); //Brazo D
    }    
    
}
