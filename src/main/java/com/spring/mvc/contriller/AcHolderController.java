package com.spring.mvc.contriller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/getAcHolder/{id}")
	public String getAcHolderbyId(@PathVariable("id")int id,Model model) {
		System.out.println("public String getAcHolderbyId().............."+id);
		AcHolder acholder=acHolderService.getAcHolderbyId(id);
		model.addAttribute("ach", acholder);
		return "acHolder-profile";
	}
	
	@GetMapping("/removeAcHolder/{id}")
	public String removeAcHolder(@PathVariable("id")int id,Model model) {
		System.out.println("public String removeAcHolder.............."+id);
		AcHolder acholder=acHolderService.removeAcHolderbyId(id);
		model.addAttribute("ach", acholder);
		return "acHolder-profile";
	}
	
	@GetMapping("/updateAcHolder/{id}")
	public String updateAcHolder(@PathVariable("id")int id,Model model) {
		System.out.println("public String updatedAcHolder.............."+id);
		AcHolder acholder=acHolderService.updateAcHolderbyId(id);
		model.addAttribute("ach", acholder);
		return "update-form";
	}
	
	

}
