/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Sanjeet Jung Gurung
 */
public class HelloWorld extends HttpServlet {
    public void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException,
            ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
        String p=request.getParameter("password");
	String n=request.getParameter("username");

	out.println("Username :"+n+"<br/>");
	out.println("Password :"+p+"<br/>");       
        
        
    }
}
  
