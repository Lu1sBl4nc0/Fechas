package fechas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuisMiguel_Blanco
 */
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
    


/**
 *
 * @author LuisMiguel_Blanco
 */

@RunWith(value = Parameterized.class)


public class Parametizer {

     private String fechaFactura= "";
      private int iRespuesta; 

    public Parametizer(int iRespuesta) {
        this.iRespuesta = iRespuesta;
    }
   
     
   

    @Parameters
    
   public static Iterable<Object[]> getdata() {
         List<Object[]> Obj= new ArrayList<>();
        
         
        Obj.add(new Object[]{0,"2001-01-02"});
        Obj.add(new Object[]{1,"2001-01-03"});
        Obj.add(new Object[]{-1,"2001-01-01"});
       
        
   
        return Obj;
    
   
   }
   
}
    /**
     *
     */
     
    
