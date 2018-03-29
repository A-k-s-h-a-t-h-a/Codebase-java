package com.niit.shoppingcart.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.domain.Category;
import com.niit.shoppingcart.domain.Product;
import com.niit.shoppingcart.domain.Supplier;

@Controller
public class AdminController {

	@Autowired
	HttpSession httpSession;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private Product product;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private Supplier supplier;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@Autowired
	private Category category;
	
	@ModelAttribute("category")
	public Category creatingcat()
	{
		return new Category();
	}
	
	@GetMapping("/managecategories")
	public ModelAndView adminClickCategories()
	{
		ModelAndView mv= new ModelAndView("Home");
		mv.addObject("isadminClickCategories", true);
		category=(Category) httpSession.getAttribute("category");
		mv.addObject("category",category);
		List<Category> categories= categoryDAO.list();					//fetches all categories again
		httpSession.setAttribute("categories", categories);
		return mv;
	}
	
	@GetMapping("/managesuppliers")
	public ModelAndView adminClickSuppliers()
	{
		ModelAndView mv= new ModelAndView("Home");
		mv.addObject("isadminClickSuppliers", true);
		/*List<Supplier> suppliers= supplierDAO.list();
		httpSession.setAttribute("suppliers", suppliers);*/
		return mv;
	}
	
	@GetMapping("/manageproducts")
	public ModelAndView adminClickProducts()
	{
		ModelAndView mv= new ModelAndView("Home");
		mv.addObject("isadminClickProducts", true);
		List<Product> products= productDAO.list();		//to fetch the table
		List<Category> categories= categoryDAO.list();	//to fetch in the dropdown and navbar
		List<Supplier> suppliers= supplierDAO.list();	//same

		httpSession.setAttribute("products", products);
		httpSession.setAttribute("categories", categories);
		httpSession.setAttribute("suppliers", suppliers);
		
		return mv;
	}
}
