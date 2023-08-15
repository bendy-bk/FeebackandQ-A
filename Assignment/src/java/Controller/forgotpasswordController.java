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
public class forgotpasswordController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        

        

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String gmail = req.getParameter("gmail");
        String msv = req.getParameter("msv");
        String phone_s = req.getParameter("phone");
        int phone = Integer.parseInt(phone_s);

        String password = req.getParameter("password");

        Account a = new Account(gmail, password, msv, phone);

        a.getPasswordForgot(gmail,msv,phone);
        req.setAttribute("a", a);

        req.getRequestDispatcher("forgotpassword.jsp").forward(req, resp);
    }

}
