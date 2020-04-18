package com.nt.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import oracle.net.aso.h;

public class WishMessageGeneratorController extends AbstractController {


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String message=null;
		Calendar cal=null;
		int hour=0;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			message="Good morning";
		else if(hour>12 && hour<20)
			message="Good evening";
		else
			message="good night"; 
		
		return new ModelAndView("wish","resMsg",message);
	}

}
