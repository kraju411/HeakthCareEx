package com.nareshit.raju.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nareshit.raju.entity.Specialisation;
import com.nareshit.raju.service.SpecialisationService;


@Controller
@RequestMapping("/spec")
public class SpecialisationController {
	@Autowired
	private SpecialisationService service;
	@GetMapping("/all")
	public String viewAll(Model model) {
		List<Specialisation> list = service.getAll();
		model.addAttribute("list",list);
		return "SpecialisationData";
	}
	@GetMapping("/register")
	public String save() {
		return "SpecialisationRegister";
	}
}

