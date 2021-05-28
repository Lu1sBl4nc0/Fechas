/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LuisMiguel_Blanco
 */
public class FechasTestABbordes {

     Fechas instance = new Fechas();
    
    public FechasTestABbordes() {
    }

    @Before
    public void Before() {
    
     instance=new Fechas();
    
    }

    @After
    public void After() {
    
    instance =null;
    
    
    }

    
    
    
    /**
     * Test of esFacturaCorrectaEnFecha method, of class Fechas.
     */
    @Test
    public void testEsFacturaCorrectaEnFecha0() throws Exception {
        System.out.println("Tiene un dia menos");
        String fechaFactura = "2001-01-02";
        //Fechas instance = new Fechas();
        int expResult = 0;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEsFacturaCorrectaEnFechaBorde1() throws Exception {
        System.out.println("esFacturaCorrectaEnFecha");
        String fechaFactura = "2001-01-01";
        //Fechas instance = new Fechas();
        int expResult = -1;
        int result = instance.esFacturaCorrectaEnFecha(fechaFactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }

    @Test
    public void testEsFacturaCorrectaEnFechaBorde2() throws Exception {
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
