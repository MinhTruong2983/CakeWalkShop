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
	

}
