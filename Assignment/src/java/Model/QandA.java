/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class QandA {

    private int id;
    private String Adetail;
    private int stdid;
    private String Qdetail;

    public QandA() {
        connect();
    }

    public QandA(String Adetail, int stdid, String Qdetail) {
        this.Adetail = Adetail;
        this.stdid = stdid;
        this.Qdetail = Qdetail;
        connect();
    }
    

    public QandA(String Adetail, String Qdetail) {
        this.Adetail = Adetail;
        this.Qdetail = Qdetail;
        connect();
    }

    public QandA(String Adetail, int stdid) {
        this.Adetail = Adetail;
        this.stdid = stdid;
        connect();
    }

    public QandA(int stdid, String Qdetail) {
        this.stdid = stdid;
        this.Qdetail = Qdetail;
        connect();
    }

    public QandA(int id, String Adetail, int stdid, String Qdetail) {
        this.id = id;
        this.Adetail = Adetail;
        this.stdid = stdid;
        this.Qdetail = Qdetail;
    }

    public QandA(int stdid) {
        this.stdid = stdid;
        connect();
    }

    public QandA(String Qdetail) {
        this.Qdetail = Qdetail;
        connect();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdetail() {
        return Adetail;
    }

    public void setAdetail(String Adetail) {
        this.Adetail = Adetail;
    }

    public int getStdid() {
        return stdid;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
    }

    public String getQdetail() {
        return Qdetail;
    }

    public void setQdetail(String Qdetail) {
        this.Qdetail = Qdetail;
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

    public void updateQuestion(String id) {
        try {
            String strSelect = "update QandA set Qdetail=? "
                    + " where stdid=? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, Qdetail);
            pstm.setInt(2, stdid);
            pstm.execute();

        } catch (Exception e) {
            System.out.println("updateQuestion()" + e.getMessage());
        }
    }

    public void getQandA() {
        try {
            String strSelect = "select * from QandA where stdid=? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(1, stdid);
            rs = pstm.executeQuery();
//            System.out.println("check");
            while (rs.next()) {
                setId(rs.getInt(1));
                setAdetail(rs.getString(2));
                setQdetail(rs.getString(4));

            }
        } catch (Exception e) {
            System.out.println("getQandA()" + e.getMessage());
        }
    }

    public String selectReply(String stdid) {
        try {
            String strSelect = "select * from QandA  where stdid=?";

            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, stdid);
            rs = pstm.executeQuery();

            while (rs.next()) {
                String reply = rs.getString(2);
                return reply;
            }
        } catch (Exception e) {
            System.out.println("selectReply(String stdid)" + e.getMessage());
        }
        return "";
    }

    public ArrayList<QandA> getListQandA() {
        ArrayList<QandA> data = new ArrayList<>();
        try {
            String strSelect = "select *  from QandA ";
            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stm.executeQuery(strSelect);
            
            while (rs.next()) {
                int id = rs.getInt(1);
                String a = rs.getString(2);
                int stdid = rs.getInt(3);
                String q = rs.getString(4);
                
                data.add(new QandA(id, a, stdid, q));

            }
        } catch (Exception e) {
            System.out.println("getListQandA()" + e.getMessage());
        }
        return data;

    }

    public void updatereply(String sid) {
         try {
            String strSelect = "update QandA set Adetail=? "
                    + " where stdid=? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, Adetail);
            pstm.setString(2,sid);
//            System.out.println(Adetail);
//            System.out.println(sid);
            pstm.execute();

        } catch (Exception e) {
            System.out.println("updatereply(String sid)" + e.getMessage());
        }
    }
}
