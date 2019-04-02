package com.capgemini.newsapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/todayNews" ,loadOnStartup=1)
public class NewsAppController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewsAppController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String path = request.getParameter("paper");
		if(path.equals("tOI")) {
			response.sendRedirect("https://timesofindia.indiatimes.com/");
		}
		else if(path.equals("eT")) {
			response.sendRedirect("https://economictimes.indiatimes.com/");
		}
		else if(path.equals("mT")) {
			response.sendRedirect("https://maharashtratimes.indiatimes.com/");
		}
		else if(path.equals("dNA")) {
			response.sendRedirect("https://www.dnaindia.com/");
		}

	}

	

}
