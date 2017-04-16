package com.sj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sj.daoImpl.CarDao;
import com.sj.entity.Car;

@Controller
public class CarController {

	@RequestMapping("/submitAdd")
	public String added(@ModelAttribute("car") Car car){
		
		
		CarDao carDao = new CarDao();
		carDao.add(car);
		return "confirmation";
		
	}
	
	@RequestMapping("find")
	public String found(String regNumber){
		
		
		CarDao carDao = new CarDao();
		
		carDao.find(regNumber);
		return "found";
		
	}

}
