package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import com.nt.dto.studentDTO;

public class studentController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		List<studentDTO> listdto=null;
		studentDTO s1=null,s2=null,s3=null;
		listdto=new ArrayList();
		s1=new studentDTO();
		s1.setSNo(1);s1.setSName("bhups");s1.setSmark(50);
		s2=new studentDTO();
		s2.setSNo(2);s2.setSName("manas");s1.setSmark(80);
		s3=new studentDTO();
		s3.setSNo(3);s3.setSName("pk");s3.setSmark(60);
		listdto.add(s1);listdto.add(s2);listdto.add(s3);
		
		if(req.getParameter("type").equalsIgnoreCase("pdf"))
			return new ModelAndView("pdfView","listDTO",listdto);
		else 
			return new ModelAndView("excelView","listDTO",listdto);
		
	}

}
