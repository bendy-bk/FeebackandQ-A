/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Account;
import Model.Feedback;
import Model.QandA;
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
public class commentController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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

        String submit = req.getParameter("submit");
        String stdid_str = req.getParameter("stdid");
        int stdid = Integer.parseInt(stdid_str);
        String gid_str = req.getParameter("gid");
        int gid = Integer.parseInt(gid_str);
        String comment = req.getParameter("comment");

        if (!submit.equals("")) {
            Account a = new Account();
            a.getDisplaynameStudent(stdid);
            req.setAttribute("a", a);

            Feedback f = new Feedback(comment, stdid, gid);
            f.updateComment(stdid, gid);
            String msg = "Edit thành công";
            req.setAttribute("msg", msg);
            req.setAttribute("f", f);
            req.getRequestDispatcher("Comment.jsp").forward(req, resp);

            Account a1 = new Account(a.getGmail());
            System.out.println(a.getGmail());
            req.setAttribute("a1", a1);
            ArrayList<Feedback> data = f.getListFeedback(a.getStdid());
            req.setAttribute("data", data);

//            req.getRequestDispatcher("StudentFeedback.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("gmail") == null) {
            resp.setContentType("text/html;charset=UTF-8");
            try ( PrintWriter out = resp.getWriter()) {
//                out.print("chua login");
//req.getRequestDispatcher("home.jsp").forward(req, resp);
                resp.sendRedirect("home.jsp");
                return;
            }
        }

        String stdid_string = req.getParameter("stdid");
        int stdid = Integer.parseInt(stdid_string);

        String gid_string = req.getParameter("gid");
        int gid = Integer.parseInt(gid_string);

        Account a = new Account();
        a.getDisplaynameStudent(stdid);
        req.setAttribute("a", a);

        Feedback f = new Feedback();
        f.getDetailfeedback(stdid, gid);
        req.setAttribute("f", f);

        req.getRequestDispatcher("Comment.jsp").forward(req, resp);

    }

}
