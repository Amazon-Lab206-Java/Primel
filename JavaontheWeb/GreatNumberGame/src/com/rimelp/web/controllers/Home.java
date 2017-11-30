package com.rimelp.web.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Home
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
		Integer winner = (Integer) session.getAttribute("winner");
		String result = (String) session.getAttribute("result");
		Random randNum = new Random();
		
		if(winner == null) {
			winner = randNum.nextInt(101);
			session.setAttribute("winner", winner);
		}
		
		if(result == null) {
			session.setAttribute("result", "");
		}
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		view.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		HttpSession session = request.getSession();
		Integer winner = (Integer) session.getAttribute("winner");
		Integer guess = Integer.parseInt(request.getParameter("guess"));
		String result = "";
		if (guess > winner) {
			result = "Too High";
		}
		else if (guess < winner) {
			result = "Too Low";
		}
		else {
			result = "You got it!";
			session.removeAttribute("winner");
		}
		session.setAttribute("result", result);
		
		response.sendRedirect("/GreatNumberGame/Home");
	}

}
