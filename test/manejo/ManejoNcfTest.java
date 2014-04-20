/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manejo;

import entidades.Ncf;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author leochangchen
 */
public class ManejoNcfTest {
    
    public ManejoNcfTest() {
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
     * Ignore of getNcf method, of class ManejoNcf.
     */
    @Test
    public void testGetNcf() {
        System.out.println("getNcf");
        int codigo = 1;
        ManejoNcf instance = new ManejoNcf();
        Ncf expResult = new Ncf();
        Ncf result = instance.getNcf(codigo);
        expResult.setCodigo(codigo);
        expResult.setActual(14);
        System.out.println(expResult);
        assertEquals(expResult, result);
        assertEquals(expResult.getActual(), result.getActual());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Ignore of getListaNcf method, of class ManejoNcf.
     */
    @Ignore
    public void testGetListaNcf() {
        System.out.println("getListaNcf");
        ManejoNcf instance = new ManejoNcf();
        List<Ncf> expResult = null;
        List<Ncf> result = instance.getListaNcf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Ignore of guardarNcf method, of class ManejoNcf.
     */
    @Ignore
    public void testGuardarNcf() {
        System.out.println("guardarNcf");
        Ncf ncf = null;
        ManejoNcf instance = new ManejoNcf();
        boolean expResult = false;
        boolean result = instance.guardarNcf(ncf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Ignore of getTotal method, of class ManejoNcf.
     */
    @Ignore
    public void testGetTotal() {
        System.out.println("getTotal");
        ManejoNcf instance = new ManejoNcf();
        int expResult = 0;
        int result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Ignore of getNCFSiguiente method, of class ManejoNcf.
     */
    @Ignore
    public void testGetNCFSiguiente() {
        System.out.println("getNCFSiguiente");
        Ncf ncf = null;
        String expResult = "";
        String result = ManejoNcf.getNCFSiguiente(ncf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Ignore of updateActual method, of class ManejoNcf.
     */
    @Ignore
    public void testUpdateActual() {
        System.out.println("updateActual");
        int codigo = 0;
        ManejoNcf instance = new ManejoNcf();
        instance.updateActual(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Ignore of borrarNcf method, of class ManejoNcf.
     */
    @Ignore
    public void testBorrarNcf() {
        System.out.println("borrarNcf");
        int codigo = 0;
        ManejoNcf instance = new ManejoNcf();
        instance.borrarNcf(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Ignore of updateNcf method, of class ManejoNcf.
     */
    @Ignore
    public void testUpdateNcf() {
        System.out.println("updateNcf");
        Ncf ncf = null;
        ManejoNcf instance = new ManejoNcf();
        instance.updateNcf(ncf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
