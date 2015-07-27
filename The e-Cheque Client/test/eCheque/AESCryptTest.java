/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eCheque;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
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
public class AESCryptTest {
    
    public AESCryptTest() {
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
     * Test of GenerateRandomAESKey method, of class AESCrypt.
     */
    @Test
    public void testGenerateRandomAESKey() throws Exception {
        System.out.println("GenerateRandomAESKey");
        AESCrypt instance1 = new AESCrypt();
        AESCrypt instance2 = new AESCrypt();
        SecretKey result1 = instance1.GenerateRandomAESKey();
        SecretKey result2 = instance2.GenerateRandomAESKey();

        // check that the generated keys are not equal
        assertNotSame(result1, result2);
        // check that the two objects are not the same
        assertNotSame(instance1, instance2);

    }

    /**
     * Test of initializeCipher method, of class AESCrypt.
     */
    @Test
    public void testInitializeCipher() throws Exception {
        System.out.println("initializeCipher");
        Key key, key2;
        
        // create a AES key
        AESCrypt instance = new AESCrypt();
        key = instance.GenerateRandomAESKey();
        
        // create a key pair generator to generate a RSA key for wrap/unwrap mode
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);
        KeyPair keyPair = generator.generateKeyPair();
        SecretKey sessionKey = new SecretKeySpec(new byte[16], "RSA");
        
        // create a cipher using encrypt mode
        Cipher ciph1 = instance.initializeCipher(key, 0);
        byte[] result1 = ciph1.doFinal(key.getEncoded());        

        // decrypt cipher and store secret key
        Cipher ciph4 = instance.initializeCipher(key, 1);
        SecretKey sessionKey2 = new SecretKeySpec(ciph4.doFinal(result1), "AES");
        
        // create a cipher using wrap mode
        Cipher ciph2 = instance.initializeCipher(keyPair.getPublic(), 2);
        byte[] result2 = ciph2.wrap(sessionKey);
        
        // unwrap cipher and save secret key
        Cipher ciph3 = instance.initializeCipher(keyPair.getPrivate(), 3);
        SecretKey sessionKey1 = (SecretKey) ciph3.unwrap(result2, "AES", Cipher.SECRET_KEY);
                
        // check that the encrypted keys are not the same
        assertTrue(!Arrays.equals(result1, result2));
        
        // check that the two keys are not null
        assertNotNull(sessionKey1);
        assertNotNull(sessionKey2);
        

    }

    /**
     * Test of crypt method, of class AESCrypt.
     */
    @Test
    public void testCrypt() throws Exception {
        System.out.println("crypt");

        // password to test (has to be 16 characters in length)
        String passTest = "1234567891234567";
        // input file path
        String input_location = "crypt_in.txt";
        // output file path
        String output_location = "crypt_out.txt";
        
        ObjectOutputStream outObj; 
        // create a rsa key)
        RSAGenerator keyGen = new RSAGenerator();
        KeyPair RSAKeys = keyGen.GenerateRSAKeys();

        // write to input file the rsa key
        outObj = new ObjectOutputStream(new FileOutputStream(input_location));
        outObj.writeObject(RSAKeys.getPrivate());
        outObj.close();

        // create an aes key
        AESCrypt instance = new AESCrypt();
        Key AES128 = instance.inilizeAESKeyByPassword(passTest);
        Cipher cipher = instance.initializeCipher(AES128,0);
        InputStream in = new FileInputStream(input_location);
        OutputStream out = new FileOutputStream(output_location); 
        
        // write encrypted password to output file
        instance.crypt(in, out, cipher);
        
        // close the input and output files
        in.close();
        out.close();
        
        File input_file = new File(input_location);
        File output_file = new File(output_location);
        
        // check that the input and output files were created
        assertTrue(input_file.exists());
        assertTrue(output_file.exists());
        
    }

    /**
     * Test of inilizeAESKeyByPassword method, of class AESCrypt.
     */
    @Test
    public void testInilizeAESKeyByPassword() {
        System.out.println("inilizeAESKeyByPassword");
        
        // input for the AESkey
        String pass = "testPassword";
        
        AESCrypt instance = new AESCrypt();
        SecretKeySpec result = instance.inilizeAESKeyByPassword(pass);
        SecretKeySpec result1 = instance.inilizeAESKeyByPassword(pass);
       
        // check that the key produced from the same password are the same
        assertEquals(result, result1);        
               
        // check that a key was actually created
        assertNotNull(result);
        
    }
    
}
