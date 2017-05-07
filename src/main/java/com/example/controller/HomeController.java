package com.example.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	
	
	@RequestMapping("/home")
	public String home(){
		return "Hello Word";
	}
	
//	@RequestMapping("/contact")
//	public List<Contact> getAll(){
//		return Arrays.asList(
//				new Contact("1","Rodiel","Martinez"),
//				new Contact("2","Ariel","Hiciano"),
//				new Contact("3","Yetti","Mendez")
//				);
//	}

}
