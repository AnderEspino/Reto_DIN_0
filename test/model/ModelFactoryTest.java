/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ender
 */
public class ModelFactoryTest {

    public ModelFactoryTest() {
    }

    /**
     * Mediante este metodo nos aseguramos que el modelo se crea
     *
     * @author Ander
     */
    @Test
    public void testGetModel() {
        ModelFactory mf = new ModelFactory();
        assertNotNull(mf);
    }

    /**
     * Este metodo prueba si ModelBdImpleentacion instancia de manera correcta!
     *
     * @author Ander
     */
    @Test
    public void testGetModelBDImplementation() {
        Model mibd = new DBModelImplementation();
        assertTrue("No es bd", mibd instanceof DBModelImplementation);
    }

}
