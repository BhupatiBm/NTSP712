package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.CompanyServiceMgmt;
import com.nt.vo.EmployeeVO;

public class MainController {
	private CompanyServiceMgmt service;

	public MainController(CompanyServiceMgmt service) {
		System.out.println("MainController:: 1 param constructor");
		this.service = service;
	}
	 
	public String processEmployee(EmployeeVO vo)throws Exception {
		EmployeeDTO dto=null;
		String result=null;
		dto=new EmployeeDTO();
		dto.setEmpNo(Integer.parseInt(vo.getEmpNo()));
		dto.setEmpName(vo.getEmpName());
		dto.setEmpDept(vo.getEmpDept());
		dto.setEmpSall(Float.parseFloat(vo.getEmpSall()));
		result=service.registerEmployee(dto);
		return result;
		
		
		
		
	}
}
