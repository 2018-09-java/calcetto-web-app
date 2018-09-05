/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.time.LocalDateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Valentino
 */
public class PartitaTest {
    
    public PartitaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getData method, of class Partita.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Partita instance = null;
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroPartecipanti method, of class Partita.
     */
    @Test
    public void testGetNumeroPartecipanti() {
        System.out.println("getNumeroPartecipanti");
        Partita instance = null;
        int expResult = 0;
        int result = instance.getNumeroPartecipanti();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStruttura method, of class Partita.
     */
    @Test
    public void testGetStruttura() {
        System.out.println("getStruttura");
        Partita instance = null;
        String expResult = "";
        String result = instance.getStruttura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testBuilderOK() {
        
        
    }
    
}
