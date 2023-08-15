/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
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
public class StudentTest {

    Student s = new Student("01", "hiep", "HE160555", 034506 );
 
    
    @Test
    public void testGetStdid() {
       
        String expResult = "01";
        String result = s.getStdid();
        assertEquals(expResult, result);

    }

    /**
     * Test of setStdid method, of class Student.
     */
    @Test
    public void testSetStdid() {
        String stdid = "01";
        Student instance = new Student();
        instance.setStdid(stdid);
        String expected = "01";
        assertEquals(expected, instance.getStdid());
    }

    /**
     * Test of getStdname method, of class Student.
     */
    @Test
    public void testGetStdname() {   
        Student instance = new Student();
        String expResult = "hiep";
        String result = s.getStdname();
        assertEquals(expResult, result);
        
    }
    

    /**
     * Test of setStdname method, of class Student.
     */
    @Test
    public void testSetStdname() {
        String stdname = "hiep";
        Student instance = new Student();
        instance.setStdname(stdname);
        String expected = "hiep";
        assertEquals(expected, instance.getStdname());
    }

    /**
     * Test of getMsv method, of class Student.
     */
    @Test
    public void testGetMsv() {

        String expResult = "HE160555";
        String result = s.getMsv();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMsv method, of class Student.
     */
    @Test
    public void testSetMsv() {
        
        String msv = "he160555";
        Student instance = new Student();
        instance.setMsv(msv);
        String expected = "he160555";
        assertEquals(expected, instance.getMsv());
        
    }

    /**
     * Test of getPhone method, of class Student.
     */
    @Test
    public void testGetPhone() {
        
        int expResult = 034506;
        int result = s.getPhone();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPhone method, of class Student.
     */
    @Test
    public void testSetPhone() {   
        int phone = 34505068;
        Student instance = new Student();
        instance.setPhone(phone);
        int expected = 34505068;
        assertEquals(expected, instance.getPhone());
       
    }

    /**
     * Test of getPstm method, of class Student.
     */
    @Test
    public void testGetPstm() {
        System.out.println("getPstm");
        Student instance = new Student();
        PreparedStatement expResult = null;
        PreparedStatement result = instance.getPstm();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPstm method, of class Student.
     */
    @Test
    public void testSetPstm() {
        System.out.println("setPstm");
        PreparedStatement pstm = null;
        Student instance = new Student();
        instance.setPstm(pstm);
        
    }

    /**
     * Test of connect method, of class Student.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        Student instance = new Student();
        instance.connect();
        
    }

    /**
     * Test of getID method, of class Student.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Student instance = new Student();
        String expResult = "1";
        String result = instance.getID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of AddStudent method, of class Student.
     */
    @Test
    public void testAddStudent() {
        System.out.println("AddStudent");
        Student instance = new Student();
        instance.AddStudent();
        
    }

}
