package com.niit.shoppingcart.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.domain.Product;
import com.niit.util.FileUtil;
@Controller
public class ProductController {

	@Autowired
	private ProductDAO productDAO; 
	
	@Autowired
	private Product product; 
	
	@Autowired
	HttpSession httpSession;
	
	@Autowired
	private CategoryDAO categoryDAO; 
	
	@Autowired
	private SupplierDAO supplierDAO; 
	
	
//	@GetMapping("/product/get/{code}")
//	public ModelAndView getProduct(@RequestParam String id)
//	{
//		product= productDAO.get(id);
//		ModelAndView mv= new ModelAndView("Home");
//		mv.addObject("product", products);
//		return mv;
//	}
	
	@PostMapping("/product/save/")
	public ModelAndView saveProduct(@RequestParam("code") String id, @RequestParam("name") String name,
			@RequestParam("price") String price, @RequestParam("stock") String stock, 
			@RequestParam("categoryid") String categoryID, @RequestParam("supplierid") String supplierID, 
			@RequestParam("file") MultipartFile file){
		
		ModelAndView mv= new ModelAndView("redirect:/manageproducts"); 
		product.setCode(id);
		product.setName(name);
		price= price.replace(", ", "");
		product.setPrice(Integer.parseInt(price));
		product.setStock(Integer.parseInt(stock));
//		product.setCategory(categoryDAO.get(categoryID));
//		product.setSupplier(supplierDAO.get(supplierID));
		product.setCat_id(categoryID);
		product.setSup_id(supplierID);
		
		if (productDAO.save(product)){
			mv.addObject("productsuccess", "Product saved successfully");
			if (FileUtil.copyFile(file, id+ "png"))
			{
				mv.addObject("uploadmsg", "Product image successfully uploaded");
			}
			else
			{
				mv.addObject("uploadmsg", "Product image could not be uploaded");
			}
			List<Product> products= productDAO.list();
			httpSession.setAttribute("products", products);
		}
		else{
			mv.addObject("producterror", "Couldn't save");
		}
		return mv;
	}
    
	@PutMapping("/product/update/")
	public ModelAndView updateProduct(@ModelAttribute Product product)
	{
		ModelAndView mv= new ModelAndView("Home");
		if (productDAO.update(product)==true){
			mv.addObject("productsuccess", "Successfully updated");
		}
		else{
			mv.addObject("producterror", "Failed to update");
		}
		return mv; 
	}
	
		
	@GetMapping("/allproducts")
	public ModelAndView getAllProducts()
	{
		ModelAndView mv= new ModelAndView("Home");
		List<Product> products= productDAO.list();
		mv.addObject("products", products);
		return mv;
	}
	
	@GetMapping("/product/delete") 
	public ModelAndView deleteProduct(@RequestParam String id) 
	{
		ModelAndView mv= new ModelAndView("redirect:/manageproducts"); 
		if (productDAO.delete(id)==true){
			mv.addObject("productsuccess", "Deleted");
		}
		else{
			mv.addObject("producterror", "Not deleted");
		}
		return mv;
	}
	
	@GetMapping("/product/edit")
	public ModelAndView editProduct(@RequestParam String id){
		ModelAndView mv= new ModelAndView("redirect:/manageproducts");
		product= productDAO.get(id);
		httpSession.setAttribute("product", product); 
		return mv;
	}
}
