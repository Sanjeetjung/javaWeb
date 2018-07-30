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
public class WelcomeServlet extends HttpServlet {

   
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("text/html");
	PrintWriter out = response.getWriter();
		
	        String name=request.getParameter("username");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String cnumber=request.getParameter("contact number");
		String email=request.getParameter("email id");
		String bdate=request.getParameter("birthday");
		String gender=request.getParameter("gender");
                
                
		out.println("Welcome "+name+",<br/>");
		out.println("Address:"+address+"<br/>");
		out.println("Contact No.:"+cnumber+"<br/>");
		out.println("Email Id:"+email+"<br/>");
		out.println("Gender:"+gender+"<br/>");
		out.println("Birth Date:"+bdate);
    }


}
