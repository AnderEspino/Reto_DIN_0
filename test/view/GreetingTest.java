/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
public class GreetingTest {
    
    public GreetingTest() {
    }
    
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Greeting instance = new Greeting();
        String expResult = "";
        String result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class Greeting.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        String value = "";
        Greeting greeting = new Greeting();
        greeting.setValue(value);
        assertEquals("Error", greeting.getValue());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void getGreetingConstruction(){
        Greeting greeting = new Greeting();
        assertNotEquals("El objeto es nulo!", greeting);
    }
    
   
}
