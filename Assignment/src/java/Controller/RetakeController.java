/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Account;
import Model.Feedback;
import Model.Retake;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author hp
 */
public class RetakeController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        req.getRequestDispatcher("Retake.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        if (session.getAttribute("gmail") == null) {
            resp.setContentType("text/html;charset=UTF-8");
            try ( PrintWriter out = resp.getWriter()) {
//                out.print("chua login");
//                req.getRequestDispatcher("home.jsp").forward(req, resp);
                resp.sendRedirect("home.jsp");
                return;
            }
        }

        String fbid_str = req.getParameter("fb");
        int fbid = Integer.parseInt(fbid_str);
        Feedback f = new Feedback(fbid);

        Retake r = new Retake(fbid);
        f.getInforFeedback();
        if (req.getParameter("sendfeedback") != null) {
            if (req.getParameter("listfb1") != null && req.getParameter("listfb2") != null
                    && req.getParameter("listfb3") != null && req.getParameter("listfb4") != null
                    && req.getParameter("listfb5") != null) {

//                if (req.getParameter("listfb1").equals("")) {
//                    String m1 = "*tích chỗ này đi";
//                    req.setAttribute("m1", m1);
//                }
//                if (req.getParameter("listfb2") == null) {
//                    String m2 = "*tích chỗ này đi";
//                    req.setAttribute("m2", m2);
//                }
//                if (req.getParameter("listfb3") == null) {
//                    String m3 = "*tích chỗ này đi";
//                    req.setAttribute("m3", m3);
//                }
//                if (req.getParameter("listfb4") == null) {
//                    String m4 = "*tích chỗ này đi";
//                    req.setAttribute("m4", m4);
//                }
//                if (req.getParameter("listfb5") == null) {
//                    String m5 = "*tích chỗ này đi";
//                    req.setAttribute("m5", m5);
//                }

                int listfb1 = Integer.parseInt(req.getParameter("listfb1"));
                int listfb2 = Integer.parseInt(req.getParameter("listfb2"));
                int listfb3 = Integer.parseInt(req.getParameter("listfb3"));
                int listfb4 = Integer.parseInt(req.getParameter("listfb4"));
                int listfb5 = Integer.parseInt(req.getParameter("listfb5"));

                r = new Retake(fbid, listfb1, listfb2, listfb3, listfb4, listfb5);

                r.updateRetake();

                String comment = req.getParameter("comment");
                f.setDetail(comment);
                f.updateComment(f.getStdid(), f.getGid());
                String msg = "Update feedback successful, Thank you";
                req.setAttribute("msg", msg);

            } else {
                
                
                
                String msg = "error all null";
                req.setAttribute("msg", msg);

            }

        }
        Account a = new Account();
        a.getDisplaynameStudent(f.getStdid());
        
        req.setAttribute("a", a);
        f.getInforFeedback();
        req.setAttribute("fb", f);
        r.getInforRetake();
        req.setAttribute("r", r);
        req.getRequestDispatcher("Retake.jsp").forward(req, resp);

    }

}
