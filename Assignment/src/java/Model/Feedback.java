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
public class Feedback {

    private int fbid;
    private String detail;
    private String begindate, enddate;
    private int lid, stdid, gid, sub;

    public Feedback() {
        connect();
    }

    public Feedback(int fbid) {
        this.fbid = fbid;
        connect();
    }

    
    
    public Feedback(String detail, int stdid, int gid) {
        this.detail = detail;
        this.stdid = stdid;
        this.gid = gid;
        connect();
    }
    
    

    public Feedback(int fbid, String detail, String begindate, String enddate, int lid, int stdid, int gid, int sub) {
        this.fbid = fbid;
        this.detail = detail;
        this.begindate = begindate;
        this.enddate = enddate;
        this.lid = lid;
        this.stdid = stdid;
        this.gid = gid;
        this.sub = sub;
        connect();
    }

    public Feedback(int fbid, String detail, String begindate, String enddate, int lid, int stdid, int gid) {
        this.fbid = fbid;
        this.detail = detail;
        this.begindate = begindate;
        this.enddate = enddate;
        this.lid = lid;
        this.stdid = stdid;
        this.gid = gid;
        connect();
    }

    public int getFbid() {
        return fbid;
    }

    public void setFbid(int fbid) {
        this.fbid = fbid;
    }

    public String getDetail() {
        return detail;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
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

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
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

    public String getGroupname() {
        try {

            String strSelect = "select * from [Group] where gid= ? ";
            pstm = cnn.prepareStatement(strSelect);
//            System.out.println("check" + gid);
            pstm.setInt(1, gid);

            rs = pstm.executeQuery();

            while (rs.next()) {

                return rs.getString(2);
            }
        } catch (Exception e) {
            System.out.println("getGroupname()" + e.getMessage());
        }
        return "";
    }

    public String getSubname() {
        try {

            String strSelect = "select * from [subject] where subid= ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(1, sub);
            rs = pstm.executeQuery();

            while (rs.next()) {
                return rs.getString(2);
            }
        } catch (Exception e) {
            System.out.println("getSubname()" + e.getMessage());
        }
        return "";
    }

    public String getLecturename() {
        try {

            String strSelect = "select * from [account] where lid= ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(1, lid);
            rs = pstm.executeQuery();

            while (rs.next()) {
                return rs.getString(6);
            }
        } catch (Exception e) {
            System.out.println("getLecturename()" + e.getMessage());
        }
        return "";
    }
    public String getStudentname() {
        try {

            String strSelect = "select * from [account] where stdid= ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(1, stdid);
            rs = pstm.executeQuery();

            while (rs.next()) {
                return rs.getString(6);
            }
        } catch (Exception e) {
            System.out.println("getStudentname()" + e.getMessage());
        }
        return "";
    }

    public ArrayList<Feedback> getListFeedback(int stdid) {
        ArrayList<Feedback> data = new ArrayList<>();
        try {
            String strSelect = "select * from feedback where stdid=? ";

            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(1, stdid);
            rs = pstm.executeQuery();
            while (rs.next()) {
                int fbid = rs.getInt(1);
                String detail = rs.getString(2);
                SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
                String begindate = "";
                if (rs.getDate(3) != null) {
                    begindate = f.format(rs.getDate(3));
                }
                String enddate = "";
                if (rs.getDate(4) != null) {
                    enddate = f.format(rs.getDate(4));
                }
                int lid = rs.getInt(5);
                stdid = rs.getInt(6);
                int gid = rs.getInt(7);
                int subid = rs.getInt(8);

                data.add(new Feedback(fbid, detail, begindate, enddate, lid, stdid, gid, subid));
            }
        } catch (Exception e) {
            System.out.println("getListFeedback " + e.getMessage());
        }
        return data;
    }

    public void getDetailfeedback(int stdid, int Gid) {
        try {

            String strSelect = "select * from \n"
                    + "feedback f where f.stdid =? and f.gid=?;";
            pstm = cnn.prepareStatement(strSelect);
//            System.out.println(stdid + "" + Gid);
            pstm.setInt(1, stdid);
            pstm.setInt(2, Gid);

            rs = pstm.executeQuery();

            while (rs.next()) {
                setFbid(rs.getInt(1));
                setDetail(rs.getString(2));
                setStdid(rs.getInt(6));
                setGid(rs.getInt(7));
            }
        } catch (Exception e) {
            System.out.println("getDetailfeedback() " + e.getMessage());
        }

    }

    public void updateComment(int stdid, int gid) {
        try {
            String strSelect = "update Feedback set detail= ? where stdid = ? and gid=? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, detail);
            pstm.setInt(2, stdid);
            pstm.setInt(3, gid);
//            System.out.println(detail);
//            System.out.println(stdid);
//            System.out.println(gid);
            pstm.execute();

        } catch (Exception e) {
            System.out.println("updateComment" + e.getMessage());
        }
    }

    public void getInforFeedback() {
        try {
            String strSelect = "select * from feedback where fbid=? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(1, fbid);
            rs = pstm.executeQuery();
            while (rs.next()) {
                fbid = rs.getInt(1);
                detail = rs.getString(2);
                SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
                
                if (rs.getDate(3) != null) {
                    begindate = f.format(rs.getDate(3));
                }
                
                if (rs.getDate(4) != null) {
                    enddate = f.format(rs.getDate(4));
                }
                lid = rs.getInt(5);
                stdid = rs.getInt(6);
                gid = rs.getInt(7);
                sub = rs.getInt(8);
            }
        } catch (Exception e) {
            System.out.println("getinforFeedback() " + e.getMessage());
        }
    }
    
    public String getLecturemail() {
        try {

            String strSelect = "select * from [account] where lid= ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(1, lid);
            rs = pstm.executeQuery();

            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("getLecturemail()" + e.getMessage());
        }
        return "";
    }

    public ArrayList<Feedback> getList(int lid) {
        ArrayList<Feedback> data = new ArrayList<>();
        try {
            String strSelect = "select * from feedback f join retake r"
                    + " on r.fbid=f.fbid and f.lid=? ";

            pstm = cnn.prepareStatement(strSelect);
            pstm.setInt(1, lid);
            rs = pstm.executeQuery();
            while (rs.next()) {
                int fbid = rs.getInt(1);
                String detail = rs.getString(2);
                SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
                String begindate = "";
                if (rs.getDate(3) != null) {
                    begindate = f.format(rs.getDate(3));
                }
                String enddate = "";
                if (rs.getDate(4) != null) {
                    enddate = f.format(rs.getDate(4));
                }
                lid = rs.getInt(5);
                stdid = rs.getInt(6);
                int gid = rs.getInt(7);
                int subid = rs.getInt(8);

                data.add(new Feedback(fbid, detail, begindate, enddate, lid, stdid, gid, subid));
            }
        } catch (Exception e) {
            System.out.println("getList " + e.getMessage());
        }
        return data;
    }

}
