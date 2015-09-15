/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  Une Servlet comportant ses appels
 * @author Mihary
 */
public class BonjourVousCompte extends HttpServlet {
    public void init(ServletConfig Config) throws ServletException
    {
        compte = 0; // compteur du nombre d'appels de la servlet
    }   
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter page = response.getWriter();
            page.println("<!DOCTYPE html>");
            page.println("<html>");
            page.println("<head>");
            page.println("<title>Servlet Bonjour Comptant ses appels </title>");            
            page.println("</head>");
            page.println("<body>");
            
            String nom = request.getParameter("prenom");
            if (nom == null)
            {
                page.println("BONJOUR");
            }
            else
            {
                page.println("BONJOUR " + nom);
            }
            compte++;
            page.println("<br> <br>");
            page.println("Appel numero " + compte);
            page.println("</body>");
            page.println("</html>");
    }
    private int compte;
}
