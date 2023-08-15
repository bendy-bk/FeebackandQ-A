/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {  
        
        
        
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            String r = "";          
            String s = req.getParameter("select");
            
            if (s.equals("1")) {
                r = "<img src='images/hoalac.png' width='400px' height='300px' >";
                
            } else if (s.equals("2")) {
                r = "<img src='images/hochiminh.jpg' width='400px' height='300px'>";
               
            } else if (s.equals("3")) {
                r = "<img src='images/quynhon.jpg' width='400px' height='300px'>";

            } else if (s.equals("4")) {
                r = "<img src='images/danang.jpg' width='400px' height='300px'>";

            } else if (s.equals("5")) {
                r = "<img src='images/cantho.jpg' width='400px' height='300px'>";

            } else {
                r = "*select campus";

            }
           

            req.setAttribute("r", r);
            req.setAttribute("select", req.getParameter("select"));
            req.getRequestDispatcher("home.jsp").forward(req, resp);
           

        } catch (ServletException | IOException e) {

            out.print("Invalid input, try again!!!!!");

        }
    }

}
