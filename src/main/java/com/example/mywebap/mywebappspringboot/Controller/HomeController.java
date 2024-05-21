package com.example.mywebap.mywebappspringboot.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mywebap.mywebappspringboot.dto.Person;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(HttpSession session) {
		System.out.println("Inside home()");
		
		Person person = new Person();
		person.setFname("Bhaiyya");
		person.setLname("Shaikh");
		session.setAttribute("person", person);
		
		// For junit and jacoco report
		if(person.getFname().equalsIgnoreCase("BHAIYYA")) {
			System.out.println("Person name is bhaiyya");
		}
		else {
			System.out.println("Person name is something else not bhaiyya");
		}
		
		System.out.println("BEFORE ==> " + session.getAttribute("person"));
		System.out.println("changing the name");
		
//		Person p = (Person)session.getAttribute("person");
//		p.setFname("Samir");
//		p.setLname(null);
		person.setFname("Mazahar");
		System.out.println("AFTER ==> " + session.getAttribute("person"));
		return "home";

	}

	@GetMapping("/about")
	public String about(HttpSession req) {
		System.out.println("Inside about()");
		
		System.out.println("AFTER ==> " + req.getAttribute("person"));
		return "about";
	}

}
