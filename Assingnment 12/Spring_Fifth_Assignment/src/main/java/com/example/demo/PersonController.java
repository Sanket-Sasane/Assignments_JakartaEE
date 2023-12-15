package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PersonController {
	
	@GetMapping("PersonInfo")
	public String before()
	{
		return "Person";
	}
	
	@PostMapping("Person")
	public String afterSubmit(@RequestParam("pname") String name,@RequestParam("paddress") String address,@RequestParam("page") int age,Model model) 
	{
		Person p=new Person();
		p.setName(name);
		p.setAddress(address);
		p.setAge(age);
		model.addAttribute("Person", p);
		return "View";
	}
}
