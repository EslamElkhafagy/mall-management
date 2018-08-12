/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontApp.Classes;

import java.io.FileInputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Enjoy
 */
public class electronic_itemsTest {
    static electronic_items instance;
    public electronic_itemsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
     instance= new electronic_items();
     instance.setAmount(50);
     instance.setCategory("mobile");
     instance.setCode("ce115");
     instance.setDetails("one two three");
     instance.setFin(null);
     instance.setImage(null);
     instance.setLen_image(15);
     instance.setName("one");
     instance.setPrice(50);
     instance.setShop_id("ce112");
    
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
     * Test of getName method, of class electronic_items.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        
        String expResult = "one";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    

    /**
     * Test of getCode method, of class electronic_items.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        
        String expResult = "ce115";
        String result = instance.getCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    
    /**
     * Test of getAmount method, of class electronic_items.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        
        int expResult = 50;
        int result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    
    
    /**
     * Test of getPrice method, of class electronic_items.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult =50;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    
    /**
     * Test of getDetails method, of class electronic_items.
     */
    @Test
    public void testGetDetails() {
        System.out.println("getDetails");
        
        String expResult = "one two three";
        String result = instance.getDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    
    
    /**
     * Test of getImage method, of class electronic_items.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        
        byte[] expResult = null;
        byte[] result = instance.getImage();
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    
    /**
     * Test of getFin method, of class electronic_items.
     */
    @Test
    public void testGetFin() {
        System.out.println("getFin");
        
        FileInputStream expResult = null;
        FileInputStream result = instance.getFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    
    
    /**
     * Test of getLen_image method, of class electronic_items.
     */
    @Test
    public void testGetLen_image() {
        System.out.println("getLen_image");
        
        int expResult = 15;
        int result = instance.getLen_image();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    
    /**
     * Test of getCategory method, of class electronic_items.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        
        String expResult = "mobile";
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    
    /**
     * Test of getShop_id method, of class electronic_items.
     */
    @Test
    public void testGetShop_id() {
        System.out.println("getShop_id");
        
        String expResult = "ce112";
        String result = instance.getShop_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    
    
}
