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
 *  Premiere servlet
 * @author Mihary
 */
public class Bonjour extends HttpServlet {

    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter page = response.getWriter();
        
            page.println("<!DOCTYPE html>");
            page.println("<html>");
            page.println("<head>");
            page.println("<title>Servlet Bonjour</title>");            
            page.println("</head>");
            
            String nom = request.getParameter("anarana");
            
            if (nom==null)
            {
            page.println("<body>");
            page.println("<font size=+2>");
            page.println("BONJOUR Akory Lahaly ");
            page.println("</body>");
            }
            else
             {
            page.println("<body>");
            page.println("<font size=+2>");
            page.println("Akory Lahaly " + nom);
            page.println("</body>");
            }   
    }

    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
