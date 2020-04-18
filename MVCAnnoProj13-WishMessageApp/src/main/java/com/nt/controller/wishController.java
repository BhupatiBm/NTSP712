package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.wishService;

@Controller
public class wishController extends AbstractController {
	@Autowired
	wishService service;
	
	@RequestMapping("welcome.htm")
	public String showHome() {
		return "home";
	} 

	@RequestMapping("wish.htm")
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String msg=null;
		msg=service.messageGenerator();
		return new ModelAndView("wish_msg","message",msg);
	}

}
