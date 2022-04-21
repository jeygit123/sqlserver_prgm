package com.training.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/home")
public class HomeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HomeServelet() {
        super();
        // TODO Auto-generated constructor stub
    }
    String name = null;
    public void init() {
    	name="Jacob";
    }

	
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("inside doget method...");
//    	response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<HTML>");
//		out.println("<HEAD><TITLE>SERVLET DEMO</TITLE></HEAD>");
//		out.println("<BODY>");
//		out.println("<H1>Hello from servlet</H1>"+name);
//		out.println("</BODY></HTML>");
//		response.sendRedirect("home.jsp");
//    request.setAttribute("userName",name );
   String userName= request.getParameter("uname");
   String password= request.getParameter("pwd");
   System.out.println("Validating credentials!!");
   if(userName.equalsIgnoreCase("Jey")&&
		   password.equalsIgnoreCase("1234")) {
   request.setAttribute("userName",userName );   
      RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
      rd.forward(request, response);      
	}else {
		RequestDispatcher rd = request.getRequestDispatcher("InvalidAccess.jsp");
		rd.forward(request, response);
	}

    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		System.out.println("inside dopost method...");
		doGet(request, response);
	}

}
