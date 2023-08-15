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
public class Account extends DBContext {

    private int accid;
    private int lid;
    private int stdid;
    private String gmail;
    private String password;
    private String displayname;
    private String lname;
    private String stdname;
    private String msv;
    private int phone;

    public Account(String gmail, String password, String stdname, String msv, int phone) {
        this.gmail = gmail;
        this.password = password;
        this.stdname = stdname;
        this.msv = msv;
        this.phone = phone;
        connect();
    }

    public Account(String gmail, String password, String msv, int phone) {
        this.gmail = gmail;
        this.password = password;
        this.msv = msv;
        this.phone = phone;
        connect();
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public Account() {
        connect();
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public Account(int accid, int lid, int stdid, String gmail, String password, String displayname, String lname, String stdname) {
        this.accid = accid;
        this.lid = lid;
        this.stdid = stdid;
        this.gmail = gmail;
        this.password = password;
        this.displayname = displayname;
        this.lname = lname;
        this.stdname = stdname;
        connect();
    }

    public Account(String gmail, String password) {
        this.gmail = gmail;
        this.password = password;
        connect();
    }

    public Account(int accid, int lid, int stdid, String gmail, String password, String displayname) {
        this.accid = accid;
        this.lid = lid;
        this.stdid = stdid;
        this.gmail = gmail;
        this.password = password;
        this.displayname = displayname;
        connect();
    }

    public Account(String gmail) {
        this.gmail = gmail;
        connect();
    }

    public int getAccid() {
        return accid;
    }

    public void setAccid(int accid) {
        this.accid = accid;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getStdid() {
        return stdid;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
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

    public boolean checkAccountLecturer() {

        try {
            String strSelect = "select * from Account a"
                    + " join Lecturer l on a.lid = l.lid and gmail='" + gmail + "'"
                    + " and password='" + password + "'";
            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stm.executeQuery(strSelect);
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("checkAccountLecturer() " + e.getMessage());
        }
        return false;

//        try {
//            String strSelect = "select a.gmail, a.password , a.displayname, l.lname, l.mgv from \n"
//                    + "Account a join Lecturer l\n"
//                    + "on a.lid = l.lid";
//            
//            pstm = cnn.prepareStatement(strSelect);
//            pstm.setString(1,gmail);
//            pstm.setString(2, this.password);
//            rs = pstm.executeQuery();
//            while (rs.next()) {
//                return true;
//            }
//        } catch (Exception e) {
//            System.out.println("checkAccountLecturer() " + e.getMessage());
//        }
//        return false;
    }

    public boolean checkAccountStudent() {
        try {
            String strSelect = "select * from Account a"
                    + " join Student s on a.stdid = s.stdid and gmail='" + gmail + "'"
                    + " and password='" + password + "'";
            stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stm.executeQuery(strSelect);
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("checkAccountLecturer() " + e.getMessage());
        }
        return false;
//        try {
//            String strSelect = "select a.gmail, a.password , a.displayname, s.stdname, s.msv from \n"
//                    + "Account a join Student s\n"
//                    + "on a.stdid = s.stdid";
//            pstm = cnn.prepareStatement(strSelect);
//            pstm.setString(1, gmail);
//            pstm.setString(2, password);
//            rs = pstm.executeQuery();
//            while (rs.next()) {
//                return true;
//            }
//        } catch (Exception e) {
//            System.out.println("checkAccountStudent()" + e.getMessage());
//        }
//        return false;

    }
//khai bao cac thanh phan xu li DB
    Connection cnn; //ket noi db
    Statement stm; // Thuc thi cau lenh sql
    PreparedStatement pstm; //ban nang cap cua stm
    ResultSet rs; //Luu tru va xu ly du lieu

    public void getAccountStudent() {
        try {
            String strSelect = "select *  \n"
                    + "from Account a join Student s\n"
                    + "on a.stdid = s.stdid \n"
                    + "and a.gmail=?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, gmail);
            rs = pstm.executeQuery();
//            System.out.println("check");
            while (rs.next()) {
                setGmail(rs.getString(1));
                setPassword(rs.getString(2));
                setStdid(rs.getInt(3));
                setLid(rs.getInt(4));
                setAccid(rs.getInt(5));
                setDisplayname(rs.getString(6));
                setStdname(rs.getString(8));
                setMsv(rs.getString(10));
            }
        } catch (Exception e) {
            System.out.println("getAccountStudent()" + e.getMessage());
        }
    }

    public void getAccountlecturer() {
        try {
            String strSelect = "select *  \n"
                    + "from Account a join Lecturer l\n"
                    + "on a.lid = l.lid \n"
                    + "and a.gmail=?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, gmail);
            rs = pstm.executeQuery();
//            System.out.println("check");
            while (rs.next()) {
                setGmail(rs.getString(1));
                setPassword(rs.getString(2));
                setStdid(rs.getInt(3));
                setLid(rs.getInt(4));
                setAccid(rs.getInt(5));
                setDisplayname(rs.getString(6));
                setLname(rs.getString(8));
            }
        } catch (Exception e) {
            System.out.println("getAccountlecturer()" + e.getMessage());
        }
    }

    public void getPasswordForgot(String gmail, String msv, int phone) {
        try {
//            String strSelect = "select * from \n"
//                    + "Account a join Student s\n"
//                    + "on a.stdid = s.stdid and a.gmail=? \n"
//                    + "and  s.msv=?  and s.stdname =? \n"
//                    + "and s.phone=?";
            String strSelect = "select * from \n"
                    + "Account a join Student s\n"
                    + "on a.stdid = s.stdid and a.gmail=? \n"
                    + "and  s.msv=? "
                    + "and s.phone=?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, gmail);
            pstm.setString(2, msv);
//            pstm.setString(3, stdname);
            pstm.setInt(3, phone);

            rs = pstm.executeQuery();
//            System.out.println("check");
            while (rs.next()) {
                setGmail(rs.getString(1));
                setPassword(rs.getString(2));
                setStdid(rs.getInt(3));
//                setLid(rs.getInt(4));
//                setAccid(rs.getInt(5));
                setDisplayname(rs.getString(6));
                setLname(rs.getString(8));
                setPhone(rs.getInt(9));
                setMsv(rs.getString(10));
            }
        } catch (Exception e) {
            System.out.println("getPasswordForgot()" + e.getMessage());
        }
    }

    public void getAccountLecturer() {
        try {
            String strSelect = "select *  \n"
                    + "from Account a join Lecturer l\n"
                    + "on a.lid = l.lid \n"
                    + "and a.gmail=?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, gmail);
            rs = pstm.executeQuery();
//            System.out.println("check");
            while (rs.next()) {
                setGmail(rs.getString(1));
                setPassword(rs.getString(2));
                setStdid(rs.getInt(3));
                setLid(rs.getInt(4));
                setAccid(rs.getInt(5));
                setDisplayname(rs.getString(6));
                setLname(rs.getString(8));

            }
        } catch (Exception e) {
            System.out.println("getAccountLecturer()" + e.getMessage());
        }
    }

    public void getDisplaynameStudent(int stdid) {
        try {
            String strSelect = "select *  \n"
                    + "from Account where stdid = ?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(1, stdid);
            rs = pstm.executeQuery();
//            System.out.println("check");
            while (rs.next()) {
                setGmail(rs.getString(1));
                setPassword(rs.getString(2));
                setStdid(rs.getInt(3));
                setLid(rs.getInt(4));
                setAccid(rs.getInt(5));
                setDisplayname(rs.getString(6));

            }
        } catch (Exception e) {
            System.out.println("getDisplaynameStudent" + e.getMessage());
        }
    }

    public void AddAccount() {
        try {
            String strInsert = "INSERT [dbo].[Account] ([gmail], [Password], [stdid] , [lid], [accid], [displayname] )\n"
                    + "VALUES (?,?,?,Null,?,?)";
            pstm = cnn.prepareStatement(strInsert);
            pstm.setString(1, gmail);
            pstm.setString(2, password);
            pstm.setInt(3, stdid);
            pstm.setInt(4, accid);
            pstm.setString(5, displayname);
            pstm.execute();
        } catch (Exception e) {
            System.out.println("AddAccount() " + e.getMessage());
        }
    }

}
