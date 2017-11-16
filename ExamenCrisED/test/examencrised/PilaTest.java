/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencrised;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cris_
 */
public class PilaTest {
    
    public PilaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of afegir method, of class Pila.
     */
    @Test
    public void testAfegir() {
        System.out.println("L'element a afegir és MÉS gran que 0.");
        int el = 3;
        Pila instance = new Pila();
        int expResult = 3;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
       
    }
    
      /**
     * Test per comprovar els valors límit FRONTERA.
     */
    @Test
    public void testAfegir2() {
        System.out.println("L'element a afegir és IGUAL a 100.");
        int el = 100;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
       
    }
    
    
      /**
     * Test of afegir method, of class Pila.
     */
    @Test
    public void testAfegir3() {
        System.out.println("L'element a afegir és IGUAL a 0.");
        int el = 0;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
       
    }

      /**
     * Test of afegir method, of class Pila.
     */
    @Test
    public void testAfegir4() {
        System.out.println("L'element a afegir és NEGATIU, més petit que 0.");
        int el = -3;
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.afegir(el);
        assertEquals(expResult, result);
       
    }
    /**
     * Test of totalElements method, of class Pila.
     */
    @Test
    public void testTotalElements() {
        System.out.println("Comprova que el total d'elements sigui més petit que 100.");
        Pila instance = new Pila();
        int expResult = 98;
        
        int result = instance.totalElements();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of treure method, of class Pila.
     */
    @Test
    public void testTreure() {
        System.out.println("");
        Pila instance = new Pila();
        int expResult = 0;
        int result = instance.treure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
