/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Account;
import Model.Feedback;
import Model.QandA;
import Model.Retake;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class myfapController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        if (session.getAttribute("gmail") == null) {
            resp.setContentType("text/html;charset=UTF-8");
            try ( PrintWriter out = resp.getWriter()) {
//                req.getRequestDispatcher("home.jsp").forward(req, resp);
                resp.sendRedirect("home.jsp");
                return;
            }
        }

        String mail_s = req.getParameter("if");
        String mail_l = req.getParameter("iflecturer");
        //Feedback                       
        if (req.getParameter("op1").equals("FEEDBACK")) {
            if (mail_s.equals("")) {
                //student
                Account a = new Account(mail_s);
                a.getAccountStudent();
                req.setAttribute("a", a);
                //lecturer
                Account l = new Account(mail_l);
                l.getAccountlecturer();
                req.setAttribute("l", l);

                Feedback f = new Feedback();
                ArrayList<Feedback> data = f.getList(l.getLid());
                req.setAttribute("data", data);

                
                Retake r = new Retake();
                ArrayList<Retake> retake = r.getListRetake();
                req.setAttribute("retake", retake);

                r.AvgValue();
//                System.out.println(r.AvgValue());
                req.setAttribute("gpa", r.AvgValue());
                
                req.getRequestDispatcher("LecturerFeedback.jsp").forward(req, resp);
            } else {
                //student
                Account a = new Account(mail_s);
                a.getAccountStudent();
                req.setAttribute("a", a);
                //list feedback
                Feedback f = new Feedback();
                ArrayList<Feedback> data = f.getListFeedback(a.getStdid());
                req.setAttribute("data", data);

                req.getRequestDispatcher("StudentFeedback.jsp").forward(req, resp);
            }

        }

        /////////////////////////////  
        ///////////////////////////// 
        ///////////////////////////// 
        //connect Q&A
        if (req.getParameter("op1").equals("QandA")) {
            if (mail_s.equals("")) {
                //Lecturer connect Feedback and Q&A
                Account l = new Account(mail_l);
                l.getAccountlecturer();
                req.setAttribute("l", l);
                //list question and ansewr
                QandA a = new QandA();
                ArrayList<QandA> data = a.getListQandA();
                req.setAttribute("data", data);
                req.getRequestDispatcher("LecturerReply.jsp").forward(req, resp);

            } else {

                //truyen attribute student
                Account a = new Account(mail_s);
                a.getAccountStudent();
                req.setAttribute("a", a);

                //lay question tu database
                String stdid = req.getParameter("stdid");
                int id = Integer.parseInt(stdid);
                QandA q = new QandA(id);
                q.getQandA();
                req.setAttribute("q", q);
                req.getRequestDispatcher("QandA.jsp").forward(req, resp);
            }

        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("gmail") == null) {
            resp.setContentType("text/html;charset=UTF-8");
            try ( PrintWriter out = resp.getWriter()) {
//                req.getRequestDispatcher("home.jsp").forward(req, resp);
//                resp.sendRedirect("home.jsp");
                out.print("run login pls");
                return;
            }
        }

        if (req.getParameter("mod") != null && req.getParameter("mod").equals("1")) {
//            HttpSession session = req.getSession();
//            String gmail = (String)session.getAttribute("gmail");
            String gmail_s = req.getParameter("gmail");
            Account a = new Account(gmail_s);
            a.getAccountStudent();
            req.setAttribute("a", a);
            //list feedback
            Feedback f = new Feedback();
            ArrayList<Feedback> data = f.getListFeedback(a.getStdid());
            req.setAttribute("data", data);
            req.getRequestDispatcher("StudentFeedback.jsp").forward(req, resp);
        }

    }

}
