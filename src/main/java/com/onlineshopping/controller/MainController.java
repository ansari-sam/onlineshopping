package com.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingbackend.service.CategoryService;

@Controller
public class MainController {
	@Autowired
	private CategoryService catService;
	
	@RequestMapping(path = {"/","/home","index"})
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		mv.addObject("categories", catService.getListCategory());
		return mv;
		
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		
		return mv;
		
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		
		return mv;
		
	}
	
}
