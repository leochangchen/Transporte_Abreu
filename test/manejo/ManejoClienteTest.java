/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manejo;

import entidades.Cliente;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author leochangchen
 */
public class ManejoClienteTest {
    
    public ManejoClienteTest() {
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
     * Test of getClienteString method, of class ManejoCliente.
     */
    @Test
    public void testGetClienteString() {
        System.out.println("getClienteString");
        String identificacion = "04700012934";
        ManejoCliente instance = new ManejoCliente();
        Cliente expResult = new Cliente();
        expResult.setIdentificacion(identificacion);
        Cliente result = instance.getClienteString(identificacion);
        assertEquals(expResult.getIdentificacion(), result.getIdentificacion());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class ManejoCliente.
     */
    @Ignore
    public void testGetCliente() {
        System.out.println("getCliente");
        int codigo = 0;
        ManejoCliente instance = new ManejoCliente();
        Cliente expResult = null;
        Cliente result = instance.getCliente(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaClientes method, of class ManejoCliente.
     */
    @Ignore
    public void testGetListaClientes() {
        System.out.println("getListaClientes");
        ManejoCliente instance = new ManejoCliente();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.getListaClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarCliente method, of class ManejoCliente.
     */
    @Ignore
    public void testGuardarCliente() {
        System.out.println("guardarCliente");
        Cliente cliente = null;
        ManejoCliente instance = new ManejoCliente();
        boolean expResult = false;
        boolean result = instance.guardarCliente(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class ManejoCliente.
     */
    @Ignore
    public void testGetTotal() {
        System.out.println("getTotal");
        ManejoCliente instance = new ManejoCliente();
        int expResult = 0;
        int result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarCliente method, of class ManejoCliente.
     */
    @Ignore
    public void testBorrarCliente() {
        System.out.println("borrarCliente");
        int codigo = 0;
        ManejoCliente instance = new ManejoCliente();
        instance.borrarCliente(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCliente method, of class ManejoCliente.
     */
    @Ignore
    public void testUpdateCliente() {
        System.out.println("updateCliente");
        Cliente cliente = null;
        ManejoCliente instance = new ManejoCliente();
        instance.updateCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
