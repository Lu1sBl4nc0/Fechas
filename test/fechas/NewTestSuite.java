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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author LuisMiguel_Blanco
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({fechas.FechasTestPruebaequivalencia.class, 
    
    fechas.FechasTestABbordes.class, 
    fechas.Parametizer.class, 
    fechas.FechasPruebasBordeTest.class, 
    fechas.FechasTestABEquivalente.class, 
    fechas.BordesACBC.class, 
    fechas.EquivalantesACBC.class, 
    fechas.mainFechasTest.class})
public class NewTestSuite {

    
    
}
