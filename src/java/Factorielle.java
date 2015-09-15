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
public class Factorielle extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter page = response.getWriter();
            page.println("<!DOCTYPE html>");
            page.println("<html>");
            page.println("<head>");
            page.println("<title>Servlet Calcul de Factorielle</title>");            
            page.println("</head>");
            
            String sDeb = request.getParameter("debut");
            String sFin = request.getParameter("fin");
            int debut, fin;
            if(sDeb == null) debut=0;
            else debut = Integer.parseInt(sDeb);
            if (sFin == null) fin = 0;
            else fin = Integer.parseInt(sFin);
            
            page.println("<body>");
            page.println("<h1>Servlet Factorielle " + "</h1>");
            page.println("factorielles de " + debut + " a " + fin + "<br>");
            int i = 1, fac = 1;
            for (; i <= fin ; ++i)
            {
                fac *= i;
                if (i >= debut) page.println(i + "! = " + fac + "<br>");
            }
           
            page.println("</body>");
            page.println("</html>");
    }
}
