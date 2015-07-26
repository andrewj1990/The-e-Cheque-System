/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class DigitalsignetureTest {
    
    /// Private/Public key pair
    private static KeyPair  _keyPair;
    private static Digitalsigneture _dsign;
    
    public DigitalsignetureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        try {
            // generate private/public key pair
            _keyPair = new RSAGenerator().GenerateRSAKeys();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DigitalsignetureTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        _dsign = new Digitalsigneture();
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
     * Test of signature method, of class Digital signature.
     * @throws java.lang.Exception
     */
    @Test
    public void testSigneture() throws Exception {
        System.out.println("signeture");
        
        // Sign the following message
        String message = "John Doe's message!";
        byte[] signedMessage = _dsign.signeture(message, _keyPair.getPrivate());
        assertNotNull(signedMessage);
        
        // Ensure that the signed message is different from original message
        String signedStr = new String(signedMessage);
        assertTrue("Signed message should be different from unsigned message",
                !signedStr.equalsIgnoreCase(message));
        

        // Since there is a test VerifySignature, we will leave verifying that
        // decrypting message gives correct message
    }

    /**
     * Test of verifySignature method, of class Digital Signature.
     * @throws java.lang.Exception
     */
    @Test
    public void testVerifySignature() throws Exception {
        System.out.println("verifySignature");
        String message = "John Doe's message!";
        byte[] signedMessage = _dsign.signeture(message, _keyPair.getPrivate());
        
        boolean result = _dsign.verifySignature(signedMessage, message,
                                _keyPair.getPublic());
        assertTrue("Decripting signed message should return unsigned message", result);
        
        // trying to verify a message with a different key should fail
        KeyPair keys = new RSAGenerator().GenerateRSAKeys();
        result = _dsign.verifySignature(signedMessage, message,
                                    keys.getPublic());
        assertFalse("Decrypting a signed message with an invalid key should fail!", result);
    }
    
}
