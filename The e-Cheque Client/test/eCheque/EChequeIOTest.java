/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

import java.io.File;
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
public class EChequeIOTest {
    
    // Used by individual tests
    private static ECheque _cheque = null;
    private static final String FILENAME = "jdoe.cheque";
    public EChequeIOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        _cheque = new ECheque();
        _cheque.setaccountNumber("4519111122223333");
        _cheque.setaccountholder("John Doe");
        _cheque.setbankname("Bank De Bank");
        _cheque.setchequeNumber("033-333-459632");
        _cheque.setcurrencytype("Dollar");
        _cheque.setamountofMony("1500.00");
        _cheque.setearnday("31-08-2015");
        _cheque.setpayToOrderOf("Jane Doe");
        _cheque.setguaranteed(false);
        _cheque.setdrawersiganure(null);
        _cheque.setbanksignature(null);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // Ensure that we remove previously saved cheques if any
        File file = new File(FILENAME);
        if (file.exists()) {
            file.delete();
        }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of savecheque method, of class EChequeIO.
     */
    @Test
    public void testSavecheque() throws Exception { 
        /* ---------------- Test procedure -------------------
           1. Create and save a cheque.
           2. Verify that the cheque exists
        */
        
        System.out.println("savecheque");
        
        EChequeIO instance = new EChequeIO();
        instance.savecheque(_cheque, FILENAME);
        // Ensure that the file was saved successfully
        File file = new File(FILENAME);
        assertTrue(file.exists()&&!file.isDirectory());
    }

    /**
     * Test of readcheque method, of class EChequeIO.
     */
    @Test
    public void testReadcheque() throws Exception {
        System.out.println("readcheque");
        /* ---------------- Test procedure -------------------
           1. Create and save a cheque.
           2. Verify that the cheque exists
        */
        
        // Need to save cheque first
        EChequeIO instance = new EChequeIO();
        instance.savecheque(_cheque, FILENAME);
        
        // Read cheque
        ECheque result = instance.readcheque(FILENAME);
        assertEquals(_cheque.getMoney(), result.getMoney());
        assertEquals(_cheque.getaccountNumber(), result.getaccountNumber());
        assertEquals(_cheque.getaccountholder(), result.getaccountholder());
        assertEquals(_cheque.getbankname(), result.getbankname());
        assertArrayEquals(_cheque.getbanksignature(), result.getbanksignature());
        assertEquals(_cheque.getchequeNumber(), result.getchequeNumber());
        assertEquals(_cheque.getcurrencytype(), result.getcurrencytype());
        assertArrayEquals(_cheque.getdrawersiganure(), result.getdrawersiganure());
        assertEquals(_cheque.getearnday(), result.getearnday());
        assertEquals(_cheque.getpayToOrderOf(), result.getpayToOrderOf());
        assertEquals(_cheque.getguaranteed(), result.getguaranteed());
    }
    
}
