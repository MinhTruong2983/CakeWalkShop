package com.CakeWalk.Controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class home {

	@GetMapping("/home/index")
	private String home_index() {
		// TODO Auto-generated method stub

		return "/home/index";
	}
	
	@GetMapping("/home/product")
	private String products() {
		// TODO Auto-generated method stub

		return "/products/product";
	}
	@GetMapping("/home/about")
	private String about() {
		// TODO Auto-generated method stub

		return "/about/about";
	}
	
	
	@GetMapping("/home/404")
	private String loi() {
		// TODO Auto-generated method stub

		return "/404/404";
	}
	
	@GetMapping("/home/contact")
	private String contact() {
		// TODO Auto-generated method stub

		return "/contact/contact";
	}
}

