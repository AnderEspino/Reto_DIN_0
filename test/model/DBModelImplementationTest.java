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
public class DBModelImplementationTest {
    
    public DBModelImplementationTest() {
    }
    
     @Test
    public void testgetGreeting() {
        Model bdim = new DBModelImplementation();
        String resultado = "Hello World from DB";
        assertEquals("No es BD",resultado,bdim.getGreeting());
    }
    
}
