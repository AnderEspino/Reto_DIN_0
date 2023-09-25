/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.ApplicationController;

/**
 *
 * @author 2dam
 */
public class javaFXImplementation extends javafx.application.Application implements View {

    public void start(Stage primaryStage) throws Exception {
        //Load FXML view 

        FXMLLoader loader = new FXMLLoader(getClass().getResource("view.Application.fxml"));
        Parent root = (Parent) loader.load();
        ApplicationController controller = loader.getController();
        controller.setGreeting(greeting);
        //Create a scene for view
        Scene scene = new Scene(root);

        controller.setScene(scene);
        controller.initStage();
    }

    @Override
    public void showGreeting(String greeting) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
