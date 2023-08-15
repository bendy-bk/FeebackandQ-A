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
public class Student extends DBContext {

    private String stdid, stdname, msv;
    private int phone;

    public Student() {
        connect();
    }

    public Student(String stdid, String stdname, String msv, int phone) {
        this.stdid = stdid;
        this.stdname = stdname;
        this.msv = msv;
        this.phone = phone;
        connect();
    }

    public String getStdid() {
        return stdid;
    }

    public void setStdid(String stdid) {
        this.stdid = stdid;
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public PreparedStatement getPstm() {
        return pstm;
    }

    public void setPstm(PreparedStatement pstm) {
        this.pstm = pstm;
    }

    public void connect() {
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

    public String getID() {
        try {
            String strSelect = "select *  from Student";
            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stm.executeQuery(strSelect);

            while (rs.next()) {
                String id = rs.getString(1);
                return id;
            }
        } catch (Exception e) {
            System.out.println("getID()" + e.getMessage());
        }
        return "";

    }


    public void AddStudent() {
        try {
            String strInsert = "INSERT [dbo].[Student] ([stdid], [stdname], [phone] , [msv] )\n"
                    + "VALUES (?,?,?,?)";
            pstm = cnn.prepareStatement(strInsert);
            pstm.setInt(1, Integer.parseInt(stdid));
            pstm.setString(2, stdname);
            pstm.setInt(3, phone);
            pstm.setString(4, msv);
            pstm.execute();
        } catch (Exception e) {
            System.out.println("AddStudent() " + e.getMessage());
        }
    }

}
