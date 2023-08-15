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
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class LecturerReplyController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("gmail") == null) {
            resp.setContentType("text/html;charset=UTF-8");
            try ( PrintWriter out = resp.getWriter()) {
//                out.print("chua login");
//                    req.getRequestDispatcher("home.jsp").forward(req, resp);
                resp.sendRedirect("home.jsp");
                return;
            }
        }

        String update = req.getParameter("update");
        if (!update.equals("")) {
            String adetail = req.getParameter("reply");
            String l_mail = req.getParameter("mail_l");
            String sid = req.getParameter("stdid");

//            System.out.println(adetail);
//            System.out.println(sid);
            QandA a = new QandA(adetail, sid);

            Account l = new Account(l_mail);
            l.getAccountlecturer();
            req.setAttribute("l", l);
            req.setAttribute("a", a);

            a.updatereply(sid);

            ArrayList<QandA> data = a.getListQandA();
            req.setAttribute("data", data);
            String mess="update thanh cong";
            req.setAttribute("mess", mess);
            req.getRequestDispatcher("LecturerReply.jsp").forward(req, resp);

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
    }

}
