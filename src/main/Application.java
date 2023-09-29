package main;


import static model.ModelFactory.getModel;
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
        Controller controller = new Controller();
        controller.run(getView(), getModel());
    }

    
}