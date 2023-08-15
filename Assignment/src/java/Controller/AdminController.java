/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author hp
 */
public class AdminController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String gmail_str = req.getParameter("gmail");
        
        String pass_str = req.getParameter("password");
        
        String stdid_str = req.getParameter("stdid");
        
        String accid_str = req.getParameter("accid");
        
        String displayname_str = req.getParameter("displayname");
        
        String stdname_str = req.getParameter("stdname");
        
        String phone_str = req.getParameter("phone");
        
        String msv_str = req.getParameter("msv");
        
        
        
    }
    
    
}
