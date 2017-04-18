package com.sj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sj.daoImpl.CarDao;
import com.sj.entity.Car;

@Controller
public class CarController {

	@RequestMapping("/submitAdd")
	public String added(@ModelAttribute("car") Car car) {

		CarDao carDao = new CarDao();
		carDao.add(car);
		return "confirmation";

	}

	@RequestMapping("/find")
	public String found(ModelMap model, String regNumber) {

		CarDao carDao = new CarDao();

		Car foundCar = carDao.find(regNumber);

		if (foundCar == null) {
			model.addAttribute("foundStatus", "no car found");
		} else {
			model.addAttribute("foundStatus", "Following car found!");
			model.addAttribute("model", foundCar.getModel());
			model.addAttribute("getOwner", foundCar.getOwnerName());
			model.addAttribute("year", foundCar.getYear());
			model.addAttribute("regNum", foundCar.getRegNumber());
		}
		return "found";

	}
	
	@RequestMapping("/ViewAll")
	public String foundAll(ModelMap model){
		
		CarDao carDao = new CarDao();
		
		List<Car> cars = carDao.getAll();
		model.addAttribute("cars",cars);
		return "viewAll";
	}
	

}
