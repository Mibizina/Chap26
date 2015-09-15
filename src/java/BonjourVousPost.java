/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mihary
 */
public class BonjourVousPost extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter page = response.getWriter();
        page.println("<!DOCTYPE html>");
            page.println("<html>");
            page.println("<head>");
            page.println("<title>Servlet BonjourVousPost</title>");            
            page.println("</head>");
            
            String nom = request.getParameter("nom");
            if (nom == null)
            {
            page.println("<body>");
            page.println("<h1>Servlet BonjourVousPost at " + request.getContextPath() + "</h1>");
            page.println("</body>");
            }
            else
            {
            page.println("<body>");
            page.println("<font size=2>");
            page.println("<h1>Servlet BonjourVousPost KAIZA at " + nom + "</h1>");
            page.println("</body>");
            page.println("</html>");
            }
    }
}
