package myPkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HeaderInfoDisplay extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) 
        {    
            out.println("HTTP headers sent by your client:<br>");  
            Enumeration e = request.getHeaderNames();  
            while (e.hasMoreElements())
            {  
                String headerName = (String) e.nextElement();  
                String headerValue = request.getHeader(headerName);  

                out.print("<b>"+headerName + "</b>: ");  
                out.println(headerValue + "<br>");  
            }  
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
