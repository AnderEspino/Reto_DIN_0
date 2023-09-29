
package model;

import java.util.ResourceBundle;

/**
 * Esta clase sirve para crear modelos.
 * @author Ander Espino, Adrian Moreno
 */
public class ModelFactory {
    /**
     * Esta clase recoge un objeto modelo
     * @return Devuelve un objeto modelo
     */
    public static Model getModel(){
        Model model=null;
        String option = ResourceBundle.getBundle("properties.propertiesTipo").getString("model");
        
        if(option.equalsIgnoreCase("file")){
            return new FileModelImplementation();
        } else if (option.equalsIgnoreCase("DB")){
            return new DBModelImplementation();
        }
        return model;
        
    }
}
