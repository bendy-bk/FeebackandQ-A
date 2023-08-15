/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Account;
import Model.QandA;
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
public class qandaController extends HttpServlet {

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

        //setAttribute của student  
        String mail = req.getParameter("info");
        Account a = new Account(mail);
        a.getAccountStudent();
        req.setAttribute("a", a);

        //Lấy jsp từ 
        String question = req.getParameter("question");
        String stdid = req.getParameter("studentid");
        int sid = Integer.parseInt(stdid);
        //Tạo một QandA với sid và ques
        QandA q = new QandA(sid, question);
        if (req.getParameter("update") != null) {
            q.updateQuestion(stdid);
            req.setAttribute("q", q);
            String mess = "update thanh cong";
            req.setAttribute("mess", mess);
            req.getRequestDispatcher("QandA.jsp").forward(req, resp);
        } else {
            //ShowAnswer
            //Lấy jsp từ 
            String reply = req.getParameter("reply");
            QandA A = new QandA(sid, reply);
            if (req.getParameter("reply") != null) {
                String r = A.selectReply(stdid);
                System.out.println(r);
                req.setAttribute("r", r);
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
                resp.sendRedirect("home.jsp");
//                out.print("run login pls");
                return;
            }
        }
//        //setAttribute của student  
//        String mail = req.getParameter("info");
//        Account a = new Account(mail);
//        a.getAccountStudent();
//        req.setAttribute("a", a);
//
//        //Lấy jsp từ 
//        String reply = req.getParameter("reply");
//        String stdid = req.getParameter("studentid");
//        int sid = Integer.parseInt(stdid);
//        //Tạo một QandA với sid và ques
//        QandA q = new QandA(sid, reply);
//        if (req.getParameter("reply") != null) {
//            String r = q.selectReply(stdid);
//            req.setAttribute("r", r);
//        }
//
//        req.setAttribute("q", q);
//        req.getRequestDispatcher("QandA.jsp").forward(req, resp);
    }

}
