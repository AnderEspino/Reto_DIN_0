/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ender
 */
public class ModelFactoryTest {
    
    public ModelFactoryTest() {
    }
    
    
    @Test
    public void testGetModel() {      
        ModelFactory mf = new ModelFactory();
        assertNotNull(mf);       
    }
    
    @Test
    public void testGetModelImplementation() {
        Model mi = new DBModelImplementation();
        assertTrue("No es archivo",mi instanceof DBModelImplementation);        
    }
    
    @Test
    public void testGetModelBDImplementation() {
        Model mibd = new DBModelImplementation();
        assertTrue("No es bd",mibd instanceof DBModelImplementation);
    }
    
}
