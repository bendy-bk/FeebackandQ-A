/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class SubjectTest {
    
    public SubjectTest() {
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
     * Test of getSubid method, of class Subject.
     */
    @Test
    public void testGetSubid() {
        System.out.println("getSubid");
        Subject instance = new Subject();
        int expResult = 0;
        int result = instance.getSubid();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSubid method, of class Subject.
     */
    @Test
    public void testSetSubid() {
        System.out.println("setSubid");
        int subid = 0;
        Subject instance = new Subject();
        instance.setSubid(subid);
        
    }

    /**
     * Test of getSubname method, of class Subject.
     */
    @Test
    public void testGetSubname() {
        System.out.println("getSubname");
        Subject instance = new Subject();
        String expResult = "";
        String result = instance.getSubname();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSubname method, of class Subject.
     */
    @Test
    public void testSetSubname() {
        System.out.println("setSubname");
        String subname = "";
        Subject instance = new Subject();
        instance.setSubname(subname);
        
    }

    /**
     * Test of getSubjectname method, of class Subject.
     */
    @Test
    public void testGetSubjectname() {
        System.out.println("getSubjectname");
        int subid = 0;
        Subject instance = new Subject();
        instance.getSubjectname(subid);
        
    }
    
}
