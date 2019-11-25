package com.javadevelopersguide.mavenwebapp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Helloservlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private String login;

public void init() throws ServletException {
		// Servlet initialization code here
		super.init();
	}

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String login = request.getParameter("login");
        out.println("</body></html>");
        out.close();
    }
}