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
 * @author 2dam
 */
public class ModelTest {
    
    public ModelTest() {
    }
    
    
    /**
     * Test of getGreeting method, of class Model.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        Model instance = new ModelImpl();
        String expResult = "";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ModelImpl implements Model {

        public String getGreeting() {
            return "";
        }
    }
    
}
