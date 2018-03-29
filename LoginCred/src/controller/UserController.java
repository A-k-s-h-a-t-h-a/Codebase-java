package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logincred.dao.UserDAO;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Doget function has been executed");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DoPost function is being executed");
		
		String id= request.getParameter("userID");
		String password= request.getParameter("password");
		
		//System.out.println("ID is:"+ id);
		//System.out.println("password is:"+ password);
		
		UserDAO userDAO= new UserDAO();
		
		RequestDispatcher rd;
		
		if(userDAO.isValid(id, password)== true){
			//System.out.println("Valid credentials");
			rd= request.getRequestDispatcher("/home.html");
			rd.forward(request, response);
		}
		else{
			//System.out.println("Invalid. Try again");
			//dispatcher.forward(request, response);
			/*if credentials aren't valid, give proper message to print on html, include login.html+ error message
			  response object gets instance of printwriter*/
			PrintWriter write= response.getWriter();
			write.println("Invalid. Try again");
			rd= request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}
	}

}
