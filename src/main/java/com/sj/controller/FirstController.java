package com.sj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class FirstController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(ModelMap model){
		
		model.addAttribute("message","controller says hi");
		return "hello";
		
	}
	

}
