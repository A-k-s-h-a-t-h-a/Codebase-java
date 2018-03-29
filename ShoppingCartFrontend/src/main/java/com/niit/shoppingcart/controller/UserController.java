
package com.niit.shoppingcart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.domain.User;

@Controller
public class UserController {

	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private User user;
	
	@Autowired
	HttpSession httpSession;
	
	@PostMapping("validate")
	public ModelAndView validate(@RequestParam("mailid") String mail, @RequestParam("psw") String password)
	{
		ModelAndView mv= new ModelAndView("Home"); //in both cases navigate to home page
		
//		if (name.equals("niit") && password.equals("niit"))
//		{
//			mv.addObject("welcome", "Welcome Mr/Ms"+name); //key- is a string, value- is another string and a variable
//		}
//		else
//		{
//			mv.addObject("error", "invalid credentials.. please try again");
//		}
		
		user= userDAO.validate(mail, password);
		if (user==null)
		{
			mv.addObject("fail", "Invalid email id or password");
		}
		else
		{
			httpSession.setAttribute("success", "Welcome "+ user.getName());
			if (user.getRole()=='A')
			{
				httpSession.setAttribute("isAdmin", true);
			}
		}
		
		return mv;
	}
	
	@PostMapping("from_form")
	public ModelAndView from_form(@RequestParam("email") String mail, @RequestParam("psw") String password, 
			@RequestParam("mob") String mobile, @RequestParam("name") String name)
	{
		ModelAndView mv= new ModelAndView("Home");
		
		user= userDAO.get(mail);
		if (user!= null){
			mv.addObject("fail", "This email id is already taken");
		}
		else
		{
		user.setEmailID(mail);
		user.setMobile(mobile);
		user.setName(name);
		user.setPwd(password);
		userDAO.save(user);
		
		httpSession.setAttribute("success", "Welcome "+ user.getName()+ "You have successfully created an account with us");
		}
		
		return mv;
	}
}
