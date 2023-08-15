/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author hp
 */
public class Subject {
    private int subid;
    private String subname;

    public Subject() {
    }

    public Subject(int subid, String subname) {
        this.subid = subid;
        this.subname = subname;
    }

    public int getSubid() {
        return subid;
    }

    public void setSubid(int subid) {
        this.subid = subid;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
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

    public void getSubjectname(int subid) {
        try {
            String strSelect = "select * from [subject] where subid=?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(1, subid);
            rs = pstm.executeQuery();
            while (rs.next()) {
                setSubid(rs.getInt(1));
                setSubname(rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println("getSubjectname " + e.getMessage());
        }
    }
    
    
}
