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
public class Group {
    private int gid;
    private String gname;
    private int subid;
    private int lid;
    private String sem;
    private int year;

    public Group() {
        connect();
    }
     
    
    public Group(int gid, String gname, int subid, int lid, String sem, int year) {
        this.gid = gid;
        this.gname = gname;
        this.subid = subid;
        this.lid = lid;
        this.sem = sem;
        this.year = year;
        connect();
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public int getSubid() {
        return subid;
    }

    public void setSubid(int subid) {
        this.subid = subid;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public void getGroupname(int gid) {
        try {
            String strSelect = "select * from [Group] where gid=?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(1, gid);
            rs = pstm.executeQuery();
            while (rs.next()) {
                setGid(rs.getInt(1));
                setGname(rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println("getGroupname " + e.getMessage());
        }

    }
    
}
