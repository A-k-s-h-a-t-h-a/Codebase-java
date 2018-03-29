package com.niit.shoppingcart.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.domain.Category;
@Controller
public class CategoryController {

	@Autowired
	private CategoryDAO categoryDAO; 
	
	@Autowired
	private Category category; 
	
	@Autowired 
	HttpSession httpSession;
	
//	@GetMapping("/category/get/{category_id}")
//	public ModelAndView getCategory(@RequestParam("category_id") String id)
//	{
//		category= categoryDAO.get(id);
//		ModelAndView mv= new ModelAndView("Home");
//		return mv.addObject("category", category); //"category"
//	}
	
	@PostMapping("/category/save/")
	/*public ModelAndView saveCategory(@RequestBody Category category)
	{
		ModelAndView mv= new ModelAndView("Home");
		if (categoryDAO.save(category)== true){
			mv.addObject("success", "Category saved successfully");
		}
		else{
			mv.addObject("failure", "Couldn't save");
		}
		return mv;
	}*/
	public ModelAndView saveCategory(@RequestParam("category_id") String id, @RequestParam("name") String name, 
																@RequestParam("description") String description){
		ModelAndView mv= new ModelAndView("redirect:/managecategories");
		category.setCategory_id(id);
		category.setName(name);
		category.setDescription(description);
		if (categoryDAO.save(category)){
			mv.addObject("categorysuccess", "Category saved successfully");
			category.setCategory_id("");
			category.setName("");
			category.setDescription("");
			List<Category> categories = categoryDAO.list();					//fetches all categories again
			httpSession.setAttribute("categories", categories);				//and sets to http session
		}
		else{
			mv.addObject("categoryerror", "Couldn't save");
		}
		return mv;
	}
		
	@PutMapping("/category/update/")
	public ModelAndView updateCategory(@ModelAttribute Category category)
	{
		ModelAndView mv= new ModelAndView("Home");
		
		if (categoryDAO.update(category)==true){
			mv.addObject("categorysuccess", "Successfully updated");
		}
		else{
			mv.addObject("categoryerror", "Failed to update");
		}
		return mv; 
	}
	
	@GetMapping("/category/delete") //"/category/delete/{category_id}"
	public ModelAndView deleteCategory(@RequestParam("id") String id) //@RequestParam("category_id")
	{
		ModelAndView mv= new ModelAndView("redirect:/managecategories"); //redirects to admincontroller
		if (categoryDAO.delete(id)==true){
			mv.addObject("categorysuccess", "Deleted");
		}
		else{
			mv.addObject("categoryerror", "Not deleted");
		}
		return mv;
	}
	
	@GetMapping("/Allcategories")
	public ModelAndView  getAllCategories()
	{
		ModelAndView mv= new ModelAndView("Home");
		List<Category> categories= categoryDAO.list();
		mv.addObject("categories", categories);
		return mv;
	}
	
	@GetMapping("/category/edit")
	public ModelAndView editCategory(@RequestParam String id){
		ModelAndView mv= new ModelAndView("redirect:/managecategories");
		category= categoryDAO.get(id);
		httpSession.setAttribute("category", category); //"category"
		return mv;
	}
}
