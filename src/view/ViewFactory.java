/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ResourceBundle;

/**
 * Esta clase sirve para crear vistas.
 * @author Ander Espino, Adrian Moreno
 */
public class ViewFactory {
   
    public static View getView() {

        View  view =null;
        String option = ResourceBundle.getBundle("properties.propertiesTipo").getString("view");
        
        if(option.equalsIgnoreCase("text")){
            return new TextImplementation();
        } else if (option.equalsIgnoreCase("window")){
            return (View) new JavaFXImplementation();
        }
        return view;
        
    }
}
