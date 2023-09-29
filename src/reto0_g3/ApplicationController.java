/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0_g3;

import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 * Esta clase sirve como el controlador de Java FX
 * @author Ander
 */
public class ApplicationController {

    @FXML
    private Pane panel;
    @FXML
    private Label lbl_Greeting;
    @FXML
    private Stage stage;

    private String greeting;

    protected static final Logger LOGGER = Logger.getLogger("/main/ApplicationController");

    /**
     * Método initiStage, se encarga la ventana y de su ejecución
     * @author Ander, Adrian
     * @param root
     */
    public void initStage(Parent root) {
        // TODO
        LOGGER.info("Initializing the greeting visual interface");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Greeting");
        lbl_Greeting.setStyle("-fx-aligment: center-right");
        lbl_Greeting.setStyle("-fx-font-size: 20px");
        lbl_Greeting.setText(greeting);
        stage.show();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void showGreeting(String message) {
        this.greeting = message;
    }

}
