package com.nt.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MYcontroller implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		Date d=null;
		ModelAndView mav=null;
		d=new Date();
			mav=new ModelAndView();
			mav.setViewName("result");
			mav.addObject("sysDate",d);
		//	mav.addObject(d);
			
			return mav;
		//return new ModelAndView("result","sysDate",new Date());
	}

		
	}

