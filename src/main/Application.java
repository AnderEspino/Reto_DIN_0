package main;


import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import static model.ModelFactory.getModel;
import view.View;
import static view.ViewFactory.getView;

/**
 * Clase principal la cual va a abrir la primera ventana SignIn
 * @author Unai Urtiaga
 */
public abstract class Application extends javafx.application.Application{

    /**
     * Metodo main que va a ejecutar el metodo start
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationController controller = new ApplicationController();
        controller.run(getView(), getModel());
    }

    
}