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
    /**
     * En este etodo probamos la recogida del saludo
     * @author Ander, Adrian
     */
    
    @Test
    public void testGetGreeting() {
        DBModelImplementation dbModel = new DBModelImplementation();
        // Prueba que el método getGreeting() devuelve un saludo no nulo
        String greeting = dbModel.getGreeting();
        assertNotNull(greeting, "El saludo no debe ser nulo");
    }

    @Test
    public void testGetGreetingEquals() {
        DBModelImplementation dbModel = new DBModelImplementation();
        String resultado = "Hello World!";
        String result = dbModel.getGreeting();
        assertEquals(resultado, result);
    }
}
