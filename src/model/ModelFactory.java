
package model;

import java.util.ResourceBundle;

/**
 *
 * @author Ander Espino, Adrian Moreno
 */
public class ModelFactory {
    /**
     * Esta clase recoge un objeto modelo
     * @return Devuelve un objeto modelo
     */
    public static Model getModel(){
        
        String model = ResourceBundle.getBundle("model.propertiesTipo").getString("model");
        
        if(model.equalsIgnoreCase("file")){
            return new FileModelImplementation();
        } else {
            return new DBModelImplementation();
        }
        
    }
}
