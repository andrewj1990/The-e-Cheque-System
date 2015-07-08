/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

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
public class EChequeRegisterationTest {
    
    public EChequeRegisterationTest() {
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
     * Test of setBankName method, of class EChequeRegisteration.
     */
    @Test
    public void testSetBankName() {
        System.out.println("setBankName");
        String bName = "TestBankName";
        EChequeRegisteration instance = new EChequeRegisteration();
        instance.setBankName(bName);
    }

    /**
     * Test of setBankAddress method, of class EChequeRegisteration.
     */
    @Test
    public void testSetBankAddress() {
        System.out.println("setBankAddress");
        String URL = "TestBankAddress";
        EChequeRegisteration instance = new EChequeRegisteration();
        instance.setBankAddress(URL);
    }

    /**
     * Test of setAccountNumber method, of class EChequeRegisteration.
     */
    @Test
    public void testSetAccountNumber() {
        System.out.println("setAccountNumber");
        String account = "TestAccountNumber";
        EChequeRegisteration instance = new EChequeRegisteration();
        instance.setAccountNumber(account);
    }

    /**
     * Test of setClientName method, of class EChequeRegisteration.
     */
    @Test
    public void testSetClientName() {
        System.out.println("setClientName");
        String cName = "TestClientName";
        EChequeRegisteration instance = new EChequeRegisteration();
        instance.setClientName(cName);
    }

    /**
     * Test of setEWalletLoaction method, of class EChequeRegisteration.
     */
    @Test
    public void testSetEWalletLoaction() {
        System.out.println("setEWalletLoaction");
        String path = "TestLocation";
        EChequeRegisteration instance = new EChequeRegisteration();
        instance.setEWalletLoaction(path);
    }

    /**
     * Test of setUsername method, of class EChequeRegisteration.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        int hashValue = 5649;
        EChequeRegisteration instance = new EChequeRegisteration();
        instance.setUsername(hashValue);
    }

    /**
     * Test of setPasword method, of class EChequeRegisteration.
     */
    @Test
    public void testSetPasword() {
        System.out.println("setPasword");
        int hashValue = 61461;
        EChequeRegisteration instance = new EChequeRegisteration();
        instance.setPasword(hashValue);
    }

    /**
     * Test of getBankName method, of class EChequeRegisteration.
     */
    @Test
    public void testGetBankName() {
        System.out.println("getBankName");
        EChequeRegisteration instance = new EChequeRegisteration();
        String expResult = "TestBankName";
        instance.setBankName(expResult);
        String result = instance.getBankName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBankAddress method, of class EChequeRegisteration.
     */
    @Test
    public void testGetBankAddress() {
        System.out.println("getBankAddress");
        EChequeRegisteration instance = new EChequeRegisteration();
        String expResult = "TestBankAddress";
        instance.setBankName(expResult);
        String result = instance.getBankAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAccountNumber method, of class EChequeRegisteration.
     */
    @Test
    public void testGetAccountNumber() {
        System.out.println("getAccountNumber");
        EChequeRegisteration instance = new EChequeRegisteration();
        String expResult = "testAccountNumber";
        instance.setAccountNumber(expResult);
        String result = instance.getAccountNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClientName method, of class EChequeRegisteration.
     */
    @Test
    public void testGetClientName() {
        System.out.println("getClientName");
        EChequeRegisteration instance = new EChequeRegisteration();
        String expResult = "TestClientName";
        instance.setClientName(expResult);
        String result = instance.getClientName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEWalletLoaction method, of class EChequeRegisteration.
     */
    @Test
    public void testGetEWalletLoaction() {
        System.out.println("getEWalletLoaction");
        EChequeRegisteration instance = new EChequeRegisteration();
        String expResult = "TestLocation";
        instance.setEWalletLoaction(expResult);
        String result = instance.getEWalletLoaction();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsername method, of class EChequeRegisteration.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        EChequeRegisteration instance = new EChequeRegisteration();
        int expResult = 154846;
        instance.setUsername(expResult);
        int result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPasword method, of class EChequeRegisteration.
     */
    @Test
    public void testGetPasword() {
        System.out.println("getPasword");
        EChequeRegisteration instance = new EChequeRegisteration();
        int expResult = 32691;
        instance.setPasword(expResult);
        int result = instance.getPasword();
        assertEquals(expResult, result);
    }
    
}
