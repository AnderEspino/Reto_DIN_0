/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 *
 * @author Ander Espino, Adrian Moreno
 */
public class FileModelImplementation implements Model {

    /**
     *
     * Este metodo recoge un saludo
     *
     * @author Ander, Adrian
     * @return Devuelve un saludo en modo de String
     */
    public String getGreeting() {       
        return ResourceBundle.getBundle("model.propertiesMessage").getString("MESSAGE");

    }
}
