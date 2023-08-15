/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Retake {

    private int fbid;
    private int listfb1;
    private int listfb2;
    private int listfb3;
    private int listfb4;
    private int listfb5;
    private String GPA;

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    public Retake(int fbid, int listfb1, int listfb2, int listfb3, int listfb4, int listfb5, String GPA) {
        this.fbid = fbid;
        this.listfb1 = listfb1;
        this.listfb2 = listfb2;
        this.listfb3 = listfb3;
        this.listfb4 = listfb4;
        this.listfb5 = listfb5;
        this.GPA = GPA;
        connect();
    }
    

    public Retake() {
        connect();
    }

    public Retake(int fbid, int listfb1, int listfb2, int listfb3, int listfb4, int listfb5) {
        this.fbid = fbid;
        this.listfb1 = listfb1;
        this.listfb2 = listfb2;
        this.listfb3 = listfb3;
        this.listfb4 = listfb4;
        this.listfb5 = listfb5;
        connect();
    }

    public Retake(int fbid) {
        this.fbid = fbid;
        connect();
    }

    public int getFbid() {
        return fbid;
    }

    public void setFbid(int fbid) {
        this.fbid = fbid;
    }

    public int getListfb1() {
        return listfb1;
    }

    public void setListfb1(int listfb1) {
        this.listfb1 = listfb1;
    }

    public int getListfb2() {
        return listfb2;
    }

    public void setListfb2(int listfb2) {
        this.listfb2 = listfb2;
    }

    public int getListfb3() {
        return listfb3;
    }

    public void setListfb3(int listfb3) {
        this.listfb3 = listfb3;
    }

    public int getListfb4() {
        return listfb4;
    }

    public void setListfb4(int listfb4) {
        this.listfb4 = listfb4;
    }

    public int getListfb5() {
        return listfb5;
    }

    public void setListfb5(int listfb5) {
        this.listfb5 = listfb5;
    }

    private void connect() {
        try {
            cnn = (new DBContext()).connection;
            if (cnn != null) {
                System.out.println("Connect success");
            } else {
                System.out.println("Connext false");
            }
        } catch (Exception e) {
        }
    }

    //khai bao cac thanh phan xu li DB
    Connection cnn; //ket noi db
    Statement stm; // Thuc thi cau lenh sql
    PreparedStatement pstm; //ban nang cap cua stm
    ResultSet rs; //Luu tru va xu ly du lieu

    public void getInforRetake() {
        try {
            String strSelect = "select * from retake where fbid=? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(1, fbid);
            rs = pstm.executeQuery();
            while (rs.next()) {
                fbid = rs.getInt(1);
                listfb1 = rs.getInt(2);
                listfb2 = rs.getInt(3);
                listfb3 = rs.getInt(4);
                listfb4 = rs.getInt(5);
                listfb5 = rs.getInt(6);
                GPA = rs.getString(7);
            }
        } catch (Exception e) {
            System.out.println("getinforRetake() " + e.getMessage());
        }
    }

    public void updateRetake() {
        try {
            String strSelect = "update [Retake] set listfb1= ?,listfb2=?, "
                    + "listfb3=?, listfb4=?,listfb5=? where fbid =?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(6, fbid);
            pstm.setInt(1, listfb1);
            pstm.setInt(2, listfb2);
            pstm.setInt(3, listfb3);
            pstm.setInt(4, listfb4);
            pstm.setInt(5, listfb5);
            System.out.println(listfb1);
            pstm.execute();

        } catch (Exception e) {
            System.out.println("updateRetake() " + e.getMessage());
        }
    }

    public void DispalyValueAVG() {
        try {
            String strSelect = "SELECT Sum(listfb1 + listfb2 + listfb3 + listfb4 + listfb5) / 5\n"
                    + "FROM retake\n"
                    + "where fbid=? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(1, fbid);
            pstm.executeQuery();
            while (rs.next()) {
                int avg = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println("DisplayvalueAVG() " + e.getMessage());
        }
    }
    
    public ArrayList<Retake> getListRetake() {
        ArrayList<Retake> data = new ArrayList<>();
        try {
            String strSelect = "select * from retake "
                    + " ";

            pstm = cnn.prepareStatement(strSelect);
//            pstm.setInt(1, fbid);
            rs = pstm.executeQuery();
            while (rs.next()) {
                fbid = rs.getInt(1);
                listfb1 = rs.getInt(2);
                listfb2 = rs.getInt(3);
                listfb3 = rs.getInt(4);
                listfb4 = rs.getInt(5);
                listfb5 = rs.getInt(6);               
                GPA = rs.getString(7);               
                data.add(new Retake(fbid, listfb1, listfb2, listfb3, listfb4, listfb5 ,GPA));
            }
        } catch (Exception e) {
            System.out.println("getListRetake " + e.getMessage());
        }
        return data;
    }
    
    public float AvgValue(){
        try {
            String strSelect = "select avg(GPA) from Retake ";
            pstm = cnn.prepareStatement(strSelect);
//            pstm.setInt(1, fbid);
            rs = pstm.executeQuery();
            while (rs.next()) {
                float GPA = rs.getFloat(1);  
                return GPA;
            }
        } catch (Exception e) {
            System.out.println("getListRetake " + e.getMessage());
        }
        return 0;
    }

}
