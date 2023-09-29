/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Esta clase sirve como test de la implementacion del fichero
 * @author Ander, Adrian
 */
public class FileModelImplementationTest {

    /**
     * Este metodo prueba si el saludo es correcto o no! Test of getGreeting
     * method, of class FileModelImplementation.
     *
     * @author Ander, Adrian
     */
    @Test
    public void testGetGreeting() {
        FileModelImplementation file = new FileModelImplementation();
        String resultado = "Hello World!";
        String result = file.getGreeting();
        assertEquals(resultado, result);
    }
    
     @Test
    public void testGetGreetingNotNull() {
       FileModelImplementation file = new FileModelImplementation();
        // Prueba que el método getGreeting() devuelve un saludo no nulo
        String greeting = file.getGreeting();
        assertNotNull(greeting, "El saludo no debe ser nulo");
    }
}
