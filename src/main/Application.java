/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ModelFactory;
import view.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application {

    /**
     * @author Adrian, Ander
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //launch(args);
        new ApplicationController().run(ViewFactory.getView(), ModelFactory.getModel());
    }

}
