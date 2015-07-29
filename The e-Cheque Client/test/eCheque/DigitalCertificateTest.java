/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

import java.security.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Scott
 */
public class DigitalCertificateTest {
    
    public DigitalCertificateTest() {
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
     * Test of setHolderName method, of class DigitalCertificate.
     */
    @Test
    public void testSetHolderName() {
        System.out.println("setHolderName");
        String x = "TestHolder";
        DigitalCertificate instance = new DigitalCertificate();
        instance.setHolderName(x);
    }

    /**
     * Test of setSubject method, of class DigitalCertificate.
     */
    @Test
    public void testSetSubject() {
        System.out.println("setSubject");
        String x = "TestSubject";
        DigitalCertificate instance = new DigitalCertificate();
        instance.setSubject(x);
    }

    /**
     * Test of setIssuer method, of class DigitalCertificate.
     */
    @Test
    public void testSetIssuer() {
        System.out.println("setIssuer");
        String x = "TestIssuer";
        DigitalCertificate instance = new DigitalCertificate();
        instance.setIssuer(x);
    }

    /**
     * Test of setSerialNumber method, of class DigitalCertificate.
     */
    @Test
    public void testSetSerialNumber() {
        System.out.println("setSerialNumber");
        String x = "TestSerialNumber";
        DigitalCertificate instance = new DigitalCertificate();
        instance.setSerialNumber(x);
    }

    /**
     * Test of setValidFrom method, of class DigitalCertificate.
     */
    @Test
    public void testSetValidFrom() {
        System.out.println("setValidFrom");
        String x = "TestValidFrom";
        DigitalCertificate instance = new DigitalCertificate();
        instance.setValidFrom(x);
    }

    /**
     * Test of setValidTo method, of class DigitalCertificate.
     */
    @Test
    public void testSetValidTo() {
        System.out.println("setValidTo");
        String x = "TestValidTo";
        DigitalCertificate instance = new DigitalCertificate();
        instance.setValidTo(x);
    }

    /**
     * Test of setPublicKey method, of class DigitalCertificate.
     */
    @Test
    public void testSetPublicKey() {
        System.out.println("setPublicKey");
        try{
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
            keyGen.initialize(1024, random);
            KeyPair pair = keyGen.generateKeyPair();
            PublicKey x = pair.getPublic();
            DigitalCertificate instance = new DigitalCertificate();
            instance.setPublicKey(x);
        }catch(Exception e){
            e.printStackTrace();
            fail("Exception caught in testSetPublicKey");
        }
    }

    /**
     * Test of setIssuerSignature method, of class DigitalCertificate.
     */
    @Test
    public void testSetIssuerSignature() {
        System.out.println("setIssuerSignature");
        byte[] x = new byte[]{
            (byte)0x75, (byte)0xff, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x9a, (byte)0xff
        };
        DigitalCertificate instance = new DigitalCertificate();
        instance.setIssuerSignature(x);
    }

    /**
     * Test of getHolderName method, of class DigitalCertificate.
     */
    @Test
    public void testGetHolderName() {
        System.out.println("getHolderName");
        DigitalCertificate instance = new DigitalCertificate();
        String expResult = "TestHolderName";
        instance.setHolderName(expResult);
        String result = instance.getHolderName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSubject method, of class DigitalCertificate.
     */
    @Test
    public void testGetSubject() {
        System.out.println("getSubject");
        DigitalCertificate instance = new DigitalCertificate();
        String expResult = "TestSubject";
        instance.setSubject(expResult);
        String result = instance.getSubject();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIssuer method, of class DigitalCertificate.
     */
    @Test
    public void testGetIssuer() {
        System.out.println("getIssuer");
        DigitalCertificate instance = new DigitalCertificate();
        String expResult = "TestIssuer";
        instance.setIssuer(expResult);
        String result = instance.getIssuer();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSerialNumber method, of class DigitalCertificate.
     */
    @Test
    public void testGetSerialNumber() {
        System.out.println("getSerialNumber");
        DigitalCertificate instance = new DigitalCertificate();
        String expResult = "TestSerialNumber";
        instance.setSerialNumber(expResult);
        String result = instance.getSerialNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValidFrom method, of class DigitalCertificate.
     */
    @Test
    public void testGetValidFrom() {
        System.out.println("getValidFrom");
        DigitalCertificate instance = new DigitalCertificate();
        String expResult = "TestValidFrom";
        instance.setValidFrom(expResult);
        String result = instance.getValidFrom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValidTo method, of class DigitalCertificate.
     */
    @Test
    public void testGetValidTo() {
        System.out.println("getValidTo");
        DigitalCertificate instance = new DigitalCertificate();
        String expResult = "TestValidTo";
        instance.setValidTo(expResult);
        String result = instance.getValidTo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getpublicKey method, of class DigitalCertificate.
     */
    @Test
    public void testGetpublicKey() {
        System.out.println("getpublicKey");
        DigitalCertificate instance = new DigitalCertificate();
        try{
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA","SUN");
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
            keyGen.initialize(1024, random);
            KeyPair pair = keyGen.generateKeyPair();
            PublicKey expResult = pair.getPublic();
            instance.setPublicKey(expResult);
            PublicKey result = instance.getpublicKey();
            assertEquals(expResult, result);
        }catch(Exception e){
            e.printStackTrace();
            fail("Failed at testGetpublicKey()");
        }
    }

    /**
     * Test of getIssuerSignature method, of class DigitalCertificate.
     */
    @Test
    public void testGetIssuerSignature() {
        System.out.println("getIssuerSignature");
        DigitalCertificate instance = new DigitalCertificate();
        byte[] expResult = new byte[]{
            (byte)0x75, (byte)0xff, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x9a, (byte)0xff
        };
        instance.setIssuerSignature(expResult);
        byte[] result = instance.getIssuerSignature();
        assertArrayEquals(expResult, result);
    }
    
}