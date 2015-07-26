/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

import java.security.KeyPair;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dc
 */
public class RSAGeneratorTest {
    
    public RSAGeneratorTest() {
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
     * Test of GenerateRSAKeys method, of class RSAGenerator.
     */
    @Test
    public void testGenerateRSAKeys() throws Exception {
        System.out.println("GenerateRSAKeys");
        RSAGenerator instance = new RSAGenerator();
        KeyPair expResult = null;
        KeyPair result = instance.GenerateRSAKeys();
        assertNotNull(result);
    }
    
}
