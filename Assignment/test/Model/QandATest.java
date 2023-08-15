/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import java.util.ArrayList;
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
public class QandATest {
    
    QandA q = new QandA(1, "superman", 2, "who are u?");
    /**
     * Test of getId method, of class QandA.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        QandA instance = new QandA();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class QandA.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        QandA instance = new QandA();
        instance.setId(id);
        
    }

    /**
     * Test of getAdetail method, of class QandA.
     */
    @Test
    
    //err
    public void testGetAdetail() {
        
        String expResult = "superman";
        String result = q.getAdetail();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAdetail method, of class QandA.
     */
    @Test
    public void testSetAdetail() {
        System.out.println("setAdetail");
        String Adetail = "";
        QandA instance = new QandA();
        instance.setAdetail(Adetail);
        
    }

    /**
     * Test of getStdid method, of class QandA.
     */
    @Test
    public void testGetStdid() {
        System.out.println("getStdid");
        QandA instance = new QandA();
        int expResult = 0;
        int result = instance.getStdid();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStdid method, of class QandA.
     */
    @Test
    public void testSetStdid() {
        System.out.println("setStdid");
        int stdid = 0;
        QandA instance = new QandA();
        instance.setStdid(stdid);
        
    }

    /**
     * Test of getQdetail method, of class QandA.
     */
    @Test
    //err
    public void testGetQdetail() {
        
        String expResult = "who are u?";
        String result = q.getQdetail();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setQdetail method, of class QandA.
     */
    @Test
    public void testSetQdetail() {
        System.out.println("setQdetail");
        String Qdetail = "";
        QandA instance = new QandA();
        instance.setQdetail(Qdetail);
       
    }

    /**
     * Test of updateQuestion method, of class QandA.
     */
    @Test
    public void testUpdateQuestion() {
        System.out.println("updateQuestion");
        String id = "";
        QandA instance = new QandA();
        instance.updateQuestion(id);
        
    }

    /**
     * Test of getQandA method, of class QandA.
     */
    @Test
    public void testGetQandA() {
        System.out.println("getQandA");
        QandA instance = new QandA();
        instance.getQandA();
        
    }

    /**
     * Test of selectReply method, of class QandA.
     */
    @Test
    public void testSelectReply() {
        System.out.println("selectReply");
        String stdid = "";
        QandA instance = new QandA();
        String expResult = "";
        String result = instance.selectReply(stdid);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getListQandA method, of class QandA.
     */
    @Test
    public void testGetListQandA() {
        
        QandA instance = new QandA();
        ArrayList<QandA> expResult = null;
        ArrayList<QandA> result = instance.getListQandA();
     
    }

    /**
     * Test of updatereply method, of class QandA.
     */
    @Test
    public void testUpdatereply() {
        System.out.println("updatereply");
        String sid = "";
        QandA instance = new QandA();
        instance.updatereply(sid);
        
    }
    
}
