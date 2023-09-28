/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.DBModelImplementation;
import model.Model;
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
public class ViewFactoryTest {
    
    public ViewFactoryTest() {
    }
    
   
     @Test
    public void testGetView() {

        ViewFactory vf = new ViewFactory();
        assertNotNull(vf);
        
    }
    @Test
    public void testGetViewTextImplementation() {
        Model mibd = new DBModelImplementation();
        assertTrue("No es Texto",mibd instanceof DBModelImplementation);
    }
    @Test
    public void testGetViewFxImplementation() {
        Model mibd = new DBModelImplementation();
        assertTrue("No es JavaFx",mibd instanceof DBModelImplementation);
    }
   
}
