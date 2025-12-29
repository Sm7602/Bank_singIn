package com.spring.mvc.contriller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.model.AcHolder;
import com.spring.mvc.service.AcHolderService;

@Controller
public class AcHolderController {
	
	@Autowired
	private AcHolderService acHolderService;
	
	@RequestMapping("/")
	public String greetings() {
		System.out.println("public String greetings().................");
		return "acHolder-form";
	}
	
	@PostMapping("/saveAcHolder")
	public String saveAcHolder(@ModelAttribute AcHolder acholder,Model model) {
		System.out.println("public String saveAcHolder()..............");
		acHolderService.saveAcHolder(acholder);
		model.addAttribute("ach", acholder);
		return "acHolder-profile";
	}
	
	

}
