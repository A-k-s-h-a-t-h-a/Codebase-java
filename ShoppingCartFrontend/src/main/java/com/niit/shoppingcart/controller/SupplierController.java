package com.niit.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.domain.Supplier;
@Controller
public class SupplierController {

	@Autowired
	private SupplierDAO supplierDAO; 
	
	@Autowired
	private Supplier supplier; 
	
	@GetMapping("/supplier/get/{supplier_id}")
	public ModelAndView getSupplier(@RequestParam("supplier_id") String id)
	{
		supplier= supplierDAO.get(id);
		ModelAndView mv= new ModelAndView("Home");
		return mv.addObject("SupplierIs", supplier);
	}
	
	@PostMapping("/supplier/save/")
	public ModelAndView saveSupplier(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("address") String address)
	{
		ModelAndView mv= new ModelAndView("Home");
		supplier.setSupplier_id(id);
		supplier.setName(name);
		supplier.setAddress(address);
		
		if (supplierDAO.save(supplier)== true){
			mv.addObject("success", "Supplier saved successfully");
		}
		else{
			mv.addObject("failure", "Couldn't save");
		}
		return mv;
	}
	
	@PutMapping("/supplier/update/")
	public ModelAndView updateSupplier(@RequestBody Supplier supplier)
	{
		ModelAndView mv= new ModelAndView("Home");
		if (supplierDAO.update(supplier)==true){
			mv.addObject("successs", "Successfully updated");
		}
		else{
			mv.addObject("fail", "Failed to update");
		}
		return mv; 
	}
	
	@DeleteMapping("/supplier/delete/{supplier_id}")
	public ModelAndView deleteSupplier(String supplier_id)
	{
		ModelAndView mv= new ModelAndView("Home");
		if (supplierDAO.delete(supplier_id)==true){
			mv.addObject("Success", "Deleted");
		}
		else{
			mv.addObject("Fail", "Not deleted");
		}
		return mv;
	}
	
	@GetMapping("/allsuppliers")
	public ModelAndView  getAllSuppliers()
	{
		ModelAndView mv= new ModelAndView("Home");
		List<Supplier> suppliers= supplierDAO.list();
		mv.addObject("Suppliers", suppliers);
		return mv;
	}
}
