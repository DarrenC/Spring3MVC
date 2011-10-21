package net.iamdarren.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/welcome")
	public String home() {
		System.out.println("HomeController: Passing through...");
		
		return "index";
	}
}
