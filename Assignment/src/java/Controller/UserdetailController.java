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
public class UserdetailController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("gmail") == null) {
            resp.setContentType("text/html;charset=UTF-8");
            try ( PrintWriter out = resp.getWriter()) {
//                req.getRequestDispatcher("home.jsp").forward(req, resp);
                resp.sendRedirect("home.jsp");
//                out.print("chua login");
                return;
            }
        }

        //Nhaan thong tin tu jsp - tham so acc
        String gmail = req.getParameter("gmail");
        String gmail_l = req.getParameter("gmail-l");
        //Goi den class Account de getDisplayname tuong ung voi acc      
        Account a = new Account(gmail);
        Account l = new Account(gmail_l);
        
        l.getAccountLecturer();
        a.getAccountStudent();
        
        // Tra thong tin User vua get ve cho trang StudentFeedback.jsp
        req.setAttribute("a", a);
        req.setAttribute("l", l);
        req.getRequestDispatcher("userDetail.jsp").forward(req, resp);

    }

}
