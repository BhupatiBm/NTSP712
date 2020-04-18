package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.empDTO;
import com.nt.service.empService;
@Controller
public class EmployeeController extends AbstractController {
	@Autowired
	empService service;

	@RequestMapping("welcome.htm")
	public String home() {
		return "home";
	}
	@RequestMapping("emp.htm")
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<empDTO> listDTO=null;
		listDTO=new ArrayList();
		listDTO=service.jobDetails();
		return new ModelAndView("emp_details","listDTO",listDTO);
	}

}
