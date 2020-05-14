/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MesaJuego;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
//import proyectoflota.programa.Barco;

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

    MesaJuego tablero = new MesaJuego(); 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tablero.generarBarcos();//Se generan barcos de manera aleatoria, en total 3
        resultados.setText("Hay 3 barcos posicionados aleatoriamente. \nIntenta darle a todos.");
    }    


    @FXML
    private void disparo00(ActionEvent event) {
        
        if(tablero.disparo(0, 0)){
            resultados.setText("Tocado en 0 0");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo33(ActionEvent event) {
        if(tablero.disparo(3, 3)){
            resultados.setText("Tocado en 3 3");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo32(ActionEvent event) {
        if(tablero.disparo(3, 2)){
            resultados.setText("Tocado en 3 2");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo31(ActionEvent event) {
        if(tablero.disparo(3, 1)){
            resultados.setText("Tocado en 3 1");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo30(ActionEvent event) {
        if(tablero.disparo(3, 0)){
            resultados.setText("Tocado en 3 0");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo23(ActionEvent event) {
        if(tablero.disparo(2, 3)){
            resultados.setText("Tocado en 2 3");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo22(ActionEvent event) {
       if(tablero.disparo(2, 2)){
            resultados.setText("Tocado en 2 2");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo21(ActionEvent event) {
       if(tablero.disparo(2, 1)){
            resultados.setText("Tocado en 2 1");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo20(ActionEvent event) {
       if(tablero.disparo(2, 0)){
            resultados.setText("Tocado en 2 0");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo13(ActionEvent event) {
      if(tablero.disparo(1, 3)){
            resultados.setText("Tocado en 1 3");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo12(ActionEvent event) {
      if(tablero.disparo(1, 2)){
            resultados.setText("Tocado en 1 2");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo11(ActionEvent event) {
       if(tablero.disparo(1, 1)){
            resultados.setText("Tocado en 1 1");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo10(ActionEvent event) {
      if(tablero.disparo(1, 0)){
            resultados.setText("Tocado en 1 0");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo03(ActionEvent event) {
     if(tablero.disparo(0, 3)){
            resultados.setText("Tocado en 0 3");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo02(ActionEvent event) {
      if(tablero.disparo(0, 2)){
            resultados.setText("Tocado en 0 2");
        }else{
            resultados.setText("Agua");
        }
    }

    @FXML
    private void disparo01(ActionEvent event) {
      if(tablero.disparo(0, 1)){
            resultados.setText("Tocado en 0 1");
        }else{
            resultados.setText("Agua");
        }
    }
    
}
