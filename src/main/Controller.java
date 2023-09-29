/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import javafx.stage.Stage;
import model.Model;
import view.View;

/**
 * Esta clase actua como intermediario entre el Modelo y la Vista, gestionando
 * el flujo de informacion entre estos dos
 * @author Ander, Adrian
 */
public class Controller  {

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

    

    
    
}