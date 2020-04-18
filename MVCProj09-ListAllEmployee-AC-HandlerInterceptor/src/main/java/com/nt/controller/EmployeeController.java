package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.empDTO;
import com.nt.service.empService;

public class EmployeeController extends AbstractController {
	empService service;
	
	public EmployeeController(empService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<empDTO> listDTO=null;
		listDTO=new ArrayList();
		listDTO=service.jobDetails();
		return new ModelAndView("emp_details","listDTO",listDTO);
	}

}
