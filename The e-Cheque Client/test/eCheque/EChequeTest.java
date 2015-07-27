/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

import java.util.Arrays;
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
public class EChequeTest {
    
    public EChequeTest() {
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
     * Test of setaccountholder method, of class ECheque.
     */
    @Test
    public void testSetaccountholder() {
        System.out.println("setaccountholder");
        
        String x = "account holder1";
        
        ECheque instance1 = new ECheque();
        ECheque instance2 = new ECheque();
        
        instance1.setaccountholder(x);
        
        // check if the string is equal to the instances get account holder
        assertTrue(instance1.getaccountholder().equals(x));
        
        // check that the second instance is not the same as the first
        assertNotSame(instance1, instance2);
        
        // set a new value for account holder to test
        instance1.setaccountholder("test");
        assertTrue(instance1.getaccountholder().equals("test"));
        
    }

    /**
     * Test of setaccountNumber method, of class ECheque.
     */
    @Test
    public void testSetaccountNumber() {
        System.out.println("setaccountNumber");
 
        String x = "12345";
        ECheque instance1 = new ECheque();
        ECheque instance2 = new ECheque();

        instance1.setaccountNumber(x);
        
        // check if the string is equal to the instances get account number
        assertTrue(instance1.getaccountNumber().equals(x));
        
        // check that the second instance is not the same as the first
        assertNotSame(instance1, instance2);
        
        // set a new value for account number to test
        instance1.setaccountNumber("test");
        assertTrue(instance1.getaccountNumber().equals("test"));
        
    }

    /**
     * Test of setbankname method, of class ECheque.
     */
    @Test
    public void testSetbankname() {
        System.out.println("setbankname");
        String z = "test set bank name";
        
        ECheque instance1 = new ECheque();
        ECheque instance2 = new ECheque();
        instance1.setbankname(z);
        
        // check that the bank name was set correctly
        assertTrue(instance1.getbankname().equals(z));
        
        // check that the second instance is not the same as the first
        assertNotSame(instance1, instance2);
        
        // reset instance1 bank name to something else
        instance1.setbankname("test");
        
        // test that the name really got changed
        assertTrue(instance1.getbankname().equals("test"));
        
    }

    /**
     * Test of setpayToOrderOf method, of class ECheque.
     */
    @Test
    public void testSetpayToOrderOf() {
        System.out.println("setpayToOrderOf");
        String z = "test set pay to order of";
        
        ECheque instance1 = new ECheque();
        ECheque instance2 = new ECheque();
        instance1.setpayToOrderOf(z);
        
        // check that the pay order was set
        assertTrue(instance1.getpayToOrderOf().equals(z));
        
        // check that the second instance is not the same as the first
        assertNotSame(instance1, instance2);
        
        // set the pay order to a different string to test
        instance1.setpayToOrderOf("test");
        
        // test that the name really got changed
        assertTrue(instance1.getpayToOrderOf().equals("test"));
        
    }

    /**
     * Test of setamountofMony method, of class ECheque.
     */
    @Test
    public void testSetamountofMony() {
        System.out.println("setamountofMony");
        String z = "test set amount of money";
        
        ECheque instance1 = new ECheque();
        ECheque instance2 = new ECheque();
        instance1.setamountofMony(z);
        
        // check that the money was set
        assertTrue(instance1.getMoney().equals(z));
        
        // check that the second instance is not the same as the first
        assertNotSame(instance1, instance2);
        
        // set the amount of money to a different value
        instance1.setamountofMony("test");
        
        // test that the value really got changed
        assertTrue(instance1.getMoney().equals("test"));
        
    }

    /**
     * Test of setcurrencytype method, of class ECheque.
     */
    @Test
    public void testSetcurrencytype() {
        System.out.println("setcurrencytype");
        String z = "test set currency type";
        
        ECheque instance1 = new ECheque();
        ECheque instance2 = new ECheque();
        instance1.setcurrencytype(z);
        
        // check that the currency type was set correctly
        assertTrue(instance1.getcurrencytype().equals(z));
        
        // check that the second instance is not the same as the first
        assertNotSame(instance1, instance2);
        
        // reset instance1 currency type to something else
        instance1.setcurrencytype("test");
        
        // test that the currency really got changed
        assertTrue(instance1.getcurrencytype().equals("test"));
        
    }

    /**
     * Test of setchequeNumber method, of class ECheque.
     */
    @Test
    public void testSetchequeNumber() {
        System.out.println("setchequeNumber");
        String z = "test set cheque number";
        
        ECheque instance1 = new ECheque();
        ECheque instance2 = new ECheque();
        instance1.setchequeNumber(z);
        
        // check that the cheque number was set correctly
        assertTrue(instance1.getchequeNumber().equals(z));
        
        // check that the second instance is not the same as the first
        assertNotSame(instance1, instance2);
        
        // reset instance1 cheque number to something else
        instance1.setchequeNumber("test");
        
        // test that the value really got changed
        assertTrue(instance1.getchequeNumber().equals("test"));
    }

    /**
     * Test of setguaranteed method, of class ECheque.
     */
    @Test
    public void testSetguaranteed() {
        System.out.println("setguaranteed");

        boolean s = true;
        
        ECheque instance1 = new ECheque();
        ECheque instance2 = new ECheque();
        
        instance1.setguaranteed(s);
        
        // check that guaranteed was correctly set to true
        assertTrue(instance1.getguaranteed());
        
        // check that the second instance is not the same as the first
        assertNotSame(instance1, instance2);
        
        // reset instance1 guaranteed to false
        instance1.setguaranteed(false);
        
        // test that the guaranteed really got changed
        assertTrue(!instance1.getguaranteed());
           
    }

    /**
     * Test of setearnday method, of class ECheque.
     */
    @Test
    public void testSetearnday() {
        System.out.println("setearnday");
        
        String z = "test set earn day";
        
        ECheque instance1 = new ECheque();
        ECheque instance2 = new ECheque();
        instance1.setearnday(z);
        
        // check that the earn day was set correctly
        assertTrue(instance1.getearnday().equals(z));
        
        // check that the second instance is not the same as the first
        assertNotSame(instance1, instance2);
        
        // reset instance1 earn day to something else
        instance1.setearnday("test");
        
        // test that the value really got changed
        assertTrue(instance1.getearnday().equals("test"));
    }

    /**
     * Test of setbanksignature method, of class ECheque.
     */
    @Test
    public void testSetbanksignature() {
        System.out.println("setbanksignature");
        byte[] y = "testing bank sig".getBytes();
        
        ECheque instance1 = new ECheque();
        ECheque instance2 = new ECheque();

        instance1.setbanksignature(y);

        // check that the bank signature was set correctly
        assertTrue(Arrays.equals(instance1.getbanksignature(), y));
        
        // check that the second instance is not the same as the first
        assertNotSame(instance1, instance2);
        
        // reset instance1 bank signature to something else
        instance1.setbanksignature("test".getBytes());
        
        // test that the value really got changed
        assertTrue(Arrays.equals(instance1.getbanksignature(), "test".getBytes()));
               
    }

    /**
     * Test of setdrawersiganure method, of class ECheque.
     */
    @Test
    public void testSetdrawersiganure() {
        System.out.println("setdrawersiganure");
        byte[] y = "testing drawers sig".getBytes();
        
        ECheque instance1 = new ECheque();
        ECheque instance2 = new ECheque();

        instance1.setdrawersiganure(y);

        // check that the drawers signature was set correctly
        assertTrue(Arrays.equals(instance1.getdrawersiganure(), y));
        
        // check that the second instance is not the same as the first
        assertNotSame(instance1, instance2);
        
        // reset instance1 drawers signature to something else
        instance1.setdrawersiganure("test".getBytes());
        
        // test that the value really got changed
        assertTrue(Arrays.equals(instance1.getdrawersiganure(), "test".getBytes()));
    }

    /**
     * Test of getMoney method, of class ECheque.
     */
    @Test
    public void testGetMoney() {
        System.out.println("getMoney");
        String z = "test get amount of money";
        
        ECheque instance1 = new ECheque();
        instance1.setamountofMony(z);
        
        // check that the money was set
        assertTrue(instance1.getMoney().equals(z));
        
        // set the amount of money to a different value
        instance1.setamountofMony("test");
        
        // test that the value really got changed
        assertTrue(instance1.getMoney().equals("test"));
    }

    /**
     * Test of getaccountholder method, of class ECheque.
     */
    @Test
    public void testGetaccountholder() {
        System.out.println("getaccountholder");
        String x = "account holder1";
        
        ECheque instance1 = new ECheque();
        instance1.setaccountholder(x);
        
        // check if the string is equal to the instances get account holder
        assertTrue(instance1.getaccountholder().equals(x));
        
        // set a new value for account holder to test
        instance1.setaccountholder("test");
        assertTrue(instance1.getaccountholder().equals("test"));
    }

    /**
     * Test of getaccountNumber method, of class ECheque.
     */
    @Test
    public void testGetaccountNumber() {
        System.out.println("getaccountNumber");

        String x = "12345";
        ECheque instance1 = new ECheque();
        instance1.setaccountNumber(x);
        
        // check if the string is equal to the instances get account number
        assertTrue(instance1.getaccountNumber().equals(x));
        
        // set a new value for account number to test
        instance1.setaccountNumber("test");
        assertTrue(instance1.getaccountNumber().equals("test"));
    }

    /**
     * Test of getbankname method, of class ECheque.
     */
    @Test
    public void testGetbankname() {
        System.out.println("getbankname");
        String z = "test get bank name";
        
        ECheque instance1 = new ECheque();
        instance1.setbankname(z);
        
        // check that the bank name was set correctly
        assertTrue(instance1.getbankname().equals(z));
        
        // reset instance1 bank name to something else
        instance1.setbankname("test");
        
        // test that the name really got changed
        assertTrue(instance1.getbankname().equals("test"));
    }

    /**
     * Test of getpayToOrderOf method, of class ECheque.
     */
    @Test
    public void testGetpayToOrderOf() {
        System.out.println("getpayToOrderOf");
        String z = "test get pay to order of";
        
        ECheque instance1 = new ECheque();
        instance1.setpayToOrderOf(z);
        
        // check that the pay order was set
        assertTrue(instance1.getpayToOrderOf().equals(z));

        // set the pay order to a different string to test
        instance1.setpayToOrderOf("test");
        
        // test that the name really got changed
        assertTrue(instance1.getpayToOrderOf().equals("test"));
    }

    /**
     * Test of getcurrencytype method, of class ECheque.
     */
    @Test
    public void testGetcurrencytype() {
        System.out.println("getcurrencytype");
        String z = "test get currency type";
        
        ECheque instance1 = new ECheque();
        instance1.setcurrencytype(z);
        
        // check that the currency type was set correctly
        assertTrue(instance1.getcurrencytype().equals(z));
        
        // reset instance1 currency type to something else
        instance1.setcurrencytype("test");
        
        // test that the currency really got changed
        assertTrue(instance1.getcurrencytype().equals("test"));
    }

    /**
     * Test of getchequeNumber method, of class ECheque.
     */
    @Test
    public void testGetchequeNumber() {
        System.out.println("getchequeNumber");
        String z = "test get cheque number";
        
        ECheque instance1 = new ECheque();
        instance1.setchequeNumber(z);
        
        // check that the cheque number was set correctly
        assertTrue(instance1.getchequeNumber().equals(z));
        
        // reset instance1 cheque number to something else
        instance1.setchequeNumber("test");
        
        // test that the value really got changed
        assertTrue(instance1.getchequeNumber().equals("test"));
    }

    /**
     * Test of getguaranteed method, of class ECheque.
     */
    @Test
    public void testGetguaranteed() {
        System.out.println("getguaranteed");
        boolean s = true;
        
        ECheque instance1 = new ECheque();
        
        instance1.setguaranteed(s);
        
        // check that guaranteed was correctly set to true
        assertTrue(instance1.getguaranteed());
        
        // reset instance1 guaranteed to false
        instance1.setguaranteed(false);
        
        // test that the guaranteed really got changed
        assertTrue(!instance1.getguaranteed());
    }

    /**
     * Test of getearnday method, of class ECheque.
     */
    @Test
    public void testGetearnday() {
        System.out.println("getearnday");
        String z = "test get earn day";
        
        ECheque instance1 = new ECheque();
        instance1.setearnday(z);
        
        // check that the earn day was set correctly
        assertTrue(instance1.getearnday().equals(z));
        
        // reset instance1 earn day to something else
        instance1.setearnday("test");
        
        // test that the value really got changed
        assertTrue(instance1.getearnday().equals("test"));
    }

    /**
     * Test of getbanksignature method, of class ECheque.
     */
    @Test
    public void testGetbanksignature() {
        System.out.println("getbanksignature");
        byte[] y = "testing bank sig".getBytes();
        
        ECheque instance1 = new ECheque();

        instance1.setbanksignature(y);

        // check that the bank signature was set correctly
        assertTrue(Arrays.equals(instance1.getbanksignature(), y));
        
        // reset instance1 bank signature to something else
        instance1.setbanksignature("test".getBytes());
        
        // test that the value really got changed
        assertTrue(Arrays.equals(instance1.getbanksignature(), "test".getBytes()));
    }

    /**
     * Test of getdrawersiganure method, of class ECheque.
     */
    @Test
    public void testGetdrawersiganure() {
        System.out.println("getdrawersiganure");
        byte[] y = "testing drawers sig".getBytes();
        
        ECheque instance1 = new ECheque();
      
        instance1.setdrawersiganure(y);

        // check that the drawers signature was set correctly
        assertTrue(Arrays.equals(instance1.getdrawersiganure(), y));
        
        // reset instance1 drawers signature to something else
        instance1.setdrawersiganure("test".getBytes());
        
        // test that the value really got changed
        assertTrue(Arrays.equals(instance1.getdrawersiganure(), "test".getBytes()));
    }
    
}
