package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.service.SchoolServiceMgmtImpl;
import com.nt.vo.StudentVO;

public class MainController {
	private SchoolServiceMgmtImpl service;

	public MainController(SchoolServiceMgmtImpl service) {
		System.out.println("MainController::1 param constructor");
		this.service = service;
	}
	public String procesStudent(StudentVO vo)throws Exception{
		StudentDTO dto=null;
		String result=null;
		dto=new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setSaddress(vo.getSaddress());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		result=service.studentRegistration(dto);
		return result;
	} 
	
}
