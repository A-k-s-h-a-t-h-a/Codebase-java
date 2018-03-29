package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginapp.dao.UserDAO;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("this is get");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("this is post");
		
		String id= request.getParameter("userID");
		String password= request.getParameter("pwd");
		System.out.println("ID is:"+ id);
		System.out.println("password is:"+ password);
		
		UserDAO userDAO= new UserDAO();
		
		RequestDispatcher dispatcher;
		
		if (userDAO.isValid(id, password)== true){
			dispatcher= request.getRequestDispatcher("/home.html");
			dispatcher.forward(request, response);
		}
		else{
			dispatcher= request.getRequestDispatcher("/login");
			dispatcher.forward(request, response);
		}
	}

}
