package com.rimelp.web.controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Random
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
	 	
        Integer count = (Integer) session.getAttribute("count");
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String randWord = "";
        Date currentDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MMM d, yyyy - h:m a");
        String date = format.format(currentDate);
        
        if (count == null) {
        	session.setAttribute("count", 0);
        	session.setAttribute("generated", "Never");
        	randWord = "Click the generate button for a random word";
        }
        else {
        	Random rando = new Random();	
        	for(int i = 0; i < 10; i++) {
        		int randNum = rando.nextInt(alpha.length());
        		randWord = randWord.concat(String.valueOf(alpha.charAt(randNum)));
        }
	        count++;
	 
	        session.setAttribute("generated", date);
	        session.setAttribute("count", count);
        }
        
        session.setAttribute("randWord", randWord);
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
