package controller;

import java.io.IOException;
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
public class UserController1 extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("this is get");
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
				
		if (userDAO.isValid(id, password)== true){
			System.out.println("Valid credentials");
		}
		else{
			System.out.println("Invalid credentials.. please try again");
		}
	}

}
