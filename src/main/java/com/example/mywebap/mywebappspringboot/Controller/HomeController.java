package com.example.mywebap.mywebappspringboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("Hi...........");
		return "home.jsp";
		
	}
	@GetMapping("/about")
	public String about()
	{
		return "about.jsp";
	}

}
