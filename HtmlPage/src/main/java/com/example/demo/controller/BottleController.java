package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Bottle;
import com.example.demo.service.BottleService;

@Controller
public class BottleController {

	@Autowired
	private BottleService bottleService;
	
	@GetMapping("/")
	public String frontpage(Model model) {
		model.addAttribute("list",bottleService.get());
		return "index";
      }
	
	@GetMapping("/save")
	public String savedata(Model model) {
		Bottle bottle=new Bottle();
		model.addAttribute("bottle",bottle);
		return "AddData_Water";
		
	}
	
	
	@PostMapping("/savebot")
	public String save(@ModelAttribute("bottle") Bottle bottle) {
		this.bottleService.create(bottle);
		return "redirect:/";
    }
	
	@GetMapping("/update/{id}")
	public String updateform(@PathVariable long id, Model model) {
		Bottle bottle=bottleService.getById(id);
		model.addAttribute("bottle",bottle);
		return "update";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteid(@PathVariable long id) {
		this.bottleService.deleteById(id);
		return "redirect:/";
		
	}
	
}
