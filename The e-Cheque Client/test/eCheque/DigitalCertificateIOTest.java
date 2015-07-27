/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

import java.io.File;
import java.security.KeyPair;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asj
 */
public class DigitalCertificateIOTest {
    
    public DigitalCertificateIOTest() {
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
     * Test of SaveDC method, of class DigitalCertificateIO.
     */
    @Test
    public void testSaveDC() throws Exception {
        System.out.println("SaveDC");
        
        // file path for digital certificate to be saved to
        String filePath = "digital.txt";
        
        // rsa key
        RSAGenerator keyGen = new RSAGenerator();
        KeyPair RSAKeys = keyGen.GenerateRSAKeys();
        
        // create Digital certificate object.
        DigitalCertificate dcObj = new DigitalCertificate();
        dcObj.setHolderName("testClientName");
        dcObj.setIssuer("testIssuerName");
        dcObj.setSubject("testSubject");
        dcObj.setValidFrom("testValidFromDate");
        dcObj.setValidTo("testValidToDate");
        dcObj.setPublicKey(RSAKeys.getPublic());
        
        // create the digital certificate and save file
        DigitalCertificateIO instance = new DigitalCertificateIO();
        instance.SaveDC(dcObj, filePath);
        
        // check that the file was actually created
        File file = new File(filePath);
        assertTrue(file.exists());
        
       
    }

    /**
     * Test of readDigitalCertificate method, of class DigitalCertificateIO.
     */
    @Test
    public void testReadDigitalCertificate() throws Exception {
        System.out.println("readDigitalCertificate");
        
        // location of the saved file
        String filePath = "digital.txt";

        // create a new instance to read the input file
        DigitalCertificateIO instance = new DigitalCertificateIO();
        
        // read the file and store in result
        DigitalCertificate result = instance.readDigitalCertificate(filePath);
        
        // check that all the valid information was on the file
        assertTrue(result.getHolderName().equals("testClientName"));
        assertTrue(result.getIssuer().equals("testIssuerName"));
        assertTrue(result.getSubject().equals("testSubject"));
        assertTrue(result.getValidFrom().equals("testValidFromDate"));
        assertTrue(result.getValidTo().equals("testValidToDate"));
        
    }
    
}
