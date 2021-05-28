/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LuisMiguel_Blanco
 */
public class EquivalantesACBC {
     private static Fechas instance = new Fechas();
    public EquivalantesACBC() {
    

    }
    
    @BeforeClass
    public static void setUpClass() {
    
    instance=new Fechas();
    
    
    }
    
    @AfterClass
    public static void tearDownClass() {
    
    instance=new Fechas();
    
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of esFacturaCorrectaEnFecha method, of class Fechas.
     */
   
    @Test
    public void testEsFacturaCorrectaEnFechaEquivalentes1() throws Exception {
        System.out.println("Tiene un dia menos");
        String fechaFactura = "2001-01-01";
        //Fechas instance = new Fechas();
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
 @Test
    public void testEsFacturaCorrectaEnFechaequivalentes2() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "2001-01-02";
        //Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

 @Test
    public void testEsFacturaCorrectaEnFechaEquivalentes3() throws Exception {
        System.out.println("Tiene un dia mas");
        String fechaFactura = "2001-01-03";
        //Fechas instance = new Fechas();
        int expResult = 1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }







     }
    

