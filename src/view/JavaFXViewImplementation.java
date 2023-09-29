/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static javafx.application.Application.launch;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import reto0_g3.ApplicationController;

/**
 * Esta clase contiene el JAVA FX
 *
 * @author Ander
 */
public class JavaFXViewImplementation extends javafx.application.Application implements View {

    @FXML
    private Label lbl;

    private static String greeting;

    @Override
    /**
     * Método start de javaFX
     */
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("window_greeting.fxml"));
        Parent root = (Parent) loader.load();
        ApplicationController controller = ((ApplicationController) loader.getController());
        controller.setStage(primaryStage);
        controller.showGreeting(greeting);
        controller.initStage(root);

    }

    @Override
    /**
     * Método de la interfaz para pasarlo al controlador de la ventana
     */
    public void showGreeting(String message) {
        greeting = message;
        launch(message);
    }

}
