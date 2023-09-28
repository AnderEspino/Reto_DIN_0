/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Model;
import view.View;

/**
 * Esta clase actua como intermediario entre el Modelo y la Vista, gestionando
 * el flujo de informacion entre estos dos
 * @author Ander, Adrian
 */
public class ApplicationController extends javafx.application.Application {


    /**
     * Metodo que recibe el Modelo y la Vista como parametro para mostrar un 
     * saludo.
     * @param view  recibe el tipo de Vista que se va a mostrar. Puede ser de
     * tipo texto o de tipo grafico.
     * @param model recibe el tipo de Modelo donde esta almacenado el saludo.
     * Puede estar guardado en un archivo de propiedades o en una base de 
     * datos.
     */
    public void run(View view,Model model){
        view.showGreeting(model.getGreeting());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}