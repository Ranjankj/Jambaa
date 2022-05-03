package com.ranjan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class MyServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();	
		String name = req.getParameter("name");
		int id = Integer.parseInt(req.getParameter("id"));
		out.println("Welcome "+ name +" !");
		out.println("Your ID is: "+ id);
	
	}
}
