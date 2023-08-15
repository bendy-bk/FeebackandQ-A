/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Account;
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
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        //Nhận thông tin
        String gmail = req.getParameter("gmail");
        String password = req.getParameter("password");
        String campus = req.getParameter("select");

        //Xử lí       
        if (campus.equals("1")) {

            Account l = new Account(gmail, password);
            Account a = new Account(gmail, password);
//            Account b = new Account()
            boolean checkstd = a.checkAccountStudent();
            boolean checklec = a.checkAccountLecturer();

            if (gmail.equals("admin@fpt.hl") && password.equals("admin")) {
                req.getRequestDispatcher("admin.jsp").forward(req, resp);
            } else {
                //Trả Lại kết quả
                if (checkstd) {
                    HttpSession session = req.getSession();
                    session.setAttribute("gmail", a);

                    a.getAccountStudent();
                    req.setAttribute("a", a);
                    req.getRequestDispatcher("myFap.jsp").forward(req, resp);
                } else {
                    if (checklec) {
                        HttpSession session = req.getSession();
                        session.setAttribute("gmail", l);
                        l.getAccountlecturer();
                        req.setAttribute("l", l);
                        req.getRequestDispatcher("myFap.jsp").forward(req, resp);
                    } else {

                        req.getRequestDispatcher("home.jsp").forward(req, resp);
                    }
                }
            }

        } else {
            req.getRequestDispatcher("home.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        if (req.getParameter("mod") != null && req.getParameter("mod").equals("1")) {
//            HttpSession session = req.getSession();
//            String gmail = (String)session.getAttribute("gmail");
            String gmail = req.getParameter("gmail");
            Account a = new Account(gmail);
            a.getAccountStudent();
            req.setAttribute("a", a);
            req.getRequestDispatcher("myFap.jsp").forward(req, resp);
        }

        resp.sendRedirect("home.jsp");
    }

//        resp.sendRedirect("home.jsp");
}
