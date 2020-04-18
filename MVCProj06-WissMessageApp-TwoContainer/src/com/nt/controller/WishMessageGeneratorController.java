package com.nt.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.services.WishService;

import oracle.net.aso.h;

public class WishMessageGeneratorController extends AbstractController {
	public WishService service;
	
	public WishMessageGeneratorController(WishService service) {
		this.service = service;
	}




	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String message=null;
		message=service.generateWishMessage();
		return new ModelAndView("wish","resMsg",message);
	}

}
