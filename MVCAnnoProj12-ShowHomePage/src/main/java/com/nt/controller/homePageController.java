package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homePageController {
	@RequestMapping("/welcome.htm")
	public String home() {
		return "home";
	}

}
