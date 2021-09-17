package com.essgineer.demo.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.essgineer.demo.dao.CustomerRepo;
import com.essgineer.demo.model.Customer;

@Controller
public class CustomerController {
	@Autowired
	CustomerRepo repo;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("connected");
		return "home.jsp";
	}

	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(int id, Customer c) {
		System.out.println("addCustomer");
		ModelAndView mv=new ModelAndView("addCustomer.jsp");
		Customer customer=repo.findById(id).orElse(null);
		System.out.println("*customer="+ customer+" c="+c);
		if(customer==null) {
			repo.save(c);
			return mv;
		}	
		mv.addObject("obj", customer);
		mv.setViewName("idUsed.jsp");
		return mv;
	}	
	@RequestMapping("/getCustomer")
	public ModelAndView getCustomer(int id) {
		System.out.println("getCustomer");
		ModelAndView mv=new ModelAndView("getCustomer.jsp");
		Customer customer=repo.findById(id).orElse(null);
	    if(customer==null) {
	    	mv.setViewName("noData.jsp");
	    	return mv;
	    }
		mv.addObject(customer);
		return mv;
	}
	
	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomer(int id,Customer c) {
		System.out.println("updateCustomer");
		ModelAndView mv=new ModelAndView("updateCustomer.jsp"); 
		Customer customer=repo.findById(id).orElse(null);
		if(customer==null){
			mv.setViewName("noData.jsp");
			return mv;
		}
		repo.save(c);
		mv.addObject("obj",customer); // ${obj.id}  ${obj.name} in updateCustomer.jsp
		return mv;
	}
	
	@RequestMapping("/deleteCustomer")
	public ModelAndView deleteCustomer(int id) {
		System.out.println("deleteCustomer");
		ModelAndView mv=new ModelAndView("deleteCustomer.jsp");
		Customer customer=repo.findById(id).orElse(null);
		if(customer==null){
			mv.setViewName("noData.jsp");
			return mv;
		}
		mv.addObject(customer); // ${obj.id}  ${obj.name} in deleteCustomer.jsp
		repo.deleteById(id);
		return mv;
	}
	
}

