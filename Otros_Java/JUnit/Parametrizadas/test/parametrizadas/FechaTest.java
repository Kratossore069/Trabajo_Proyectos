/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametrizadas;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */

@RunWith(Parameterized.class)


public class FechaTest {
    
    private int num;

    public FechaTest(int a) {
        a = num;
    }
    
    @Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][]{
            {1},{2},{3},{4}
        });
    }

    @Test
    public void testDevuelveFecha() {

        System.out.println("DevuelveFecha");
        Fecha instance = new Fecha();
        String esperado = "ERROR";
        String resultado = instance.DevuelveFecha(num);
        assertEquals(esperado, resultado); //Esperado y real.

    }


}
