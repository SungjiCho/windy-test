package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Scale;
import com.example.demo.repository.ScaleMongoRepo;
import com.example.demo.repository.ResultSearchRepo;

@Controller
public class ScaleController {
	
	@Autowired
	ScaleMongoRepo scaleRepo;
	
	@Autowired
	ResultSearchRepo resultSearchRepo;
	
	@RequestMapping("/scale")
	public String home(Model model) {
		model.addAttribute("scaleList", scaleRepo.findAll());
		return "scale";
	}
	
	@RequestMapping(value = "/addScale", method = RequestMethod.POST)
	public String addScale(@ModelAttribute Scale scale) {
		scaleRepo.save(scale);
		return "redirect:scale";
	}
	
//	@RequestMapping(value = "/search")
//	public String search(Model model, @RequestParam String search) {
//		model.addAttribute("scaleList", resultSearchRepo.searchResults(search));
//		model.addAttribute("search", search);
//		
//		return "home";
//	}

}
