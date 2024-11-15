package com.bvr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bvr.repositories.CarMongoRepository;
import com.bvr.repositories.CarSearchRepository;

@Controller
public class CarController {

	public CarController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	CarMongoRepository carMongoRepository;
	
	@Autowired
	CarSearchRepository carSearchRepository;
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("carList", carMongoRepository.findAll());
		return "home";
	}

}
