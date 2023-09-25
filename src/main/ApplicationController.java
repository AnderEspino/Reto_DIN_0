/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.Model;
import view.View;
import view.View;

/**
 *
 * @author 2dam
 */
public class ApplicationController extends javafx.application.Application {
    
    @FXML
    private Label label;
    
  
    
    @Override
  public void start(Stage primaryStage) throws Exception {
		
                
		
	} 
    
    public void run(View view, Model model) {
        view.showGreeting(model.getGreeting());
    }

    
}
