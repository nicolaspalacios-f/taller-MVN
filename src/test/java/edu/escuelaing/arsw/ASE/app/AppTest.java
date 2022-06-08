package edu.escuelaing.arsw.ASE.app;

import static org.junit.Assert.fail;

import java.io.File;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void deberiaContarLineasArchivoConPhy() {
        try {
            File file = new File("src\\main\\java\\edu\\escuelaing\\arsw\\ASE\\app\\App.java");
            Assert.assertEquals(52, App.contadorLineas("phy", file));
            System.out.println(App.contadorLineas("phy", file));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaContarLineasArchivoConLoc() {
        try {
            File file = new File("src\\main\\java\\edu\\escuelaing\\arsw\\ASE\\app\\App.java");
            Assert.assertEquals(40, App.contadorLineas("loc", file));
            System.out.println(App.contadorLineas("loc", file));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaContarLineasArchivoDeFolder() {
        try {
            String file = new String("src\\main\\java\\edu\\escuelaing\\arsw\\ASE\\app");
            Assert.assertEquals(56, App.lector_archivos("phy", file));
            System.out.println(App.lector_archivos("phy", file));
        } catch (Exception e) {
            fail();
        }
    }
}
