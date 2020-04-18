package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;
import com.nt.vo.EmployeeVO;

public class MainController {
	private EmployeeMgmtService service;

	public MainController(EmployeeMgmtService service)  {
	
		this.service = service;
	}
	public void myInit() {
		System.out.println("MainController.myInit()");
		if(service==null)
			throw new IllegalArgumentException("ds is empty");
	}
	public void myDestroy() {
		System.out.println("MainController.myDestroy()");
		service=null;
	}
	public List<EmployeeVO> showEmpBySal(float v1,float v2)throws Exception{
		List<EmployeeDTO> listdto=null;
		List<EmployeeVO> listvo=null;
		EmployeeVO vo=null;
		listdto=service.fetchEmpsBySal(v1,v2);
		listvo=new ArrayList();
		for(EmployeeDTO dto:listdto) {
			vo=new EmployeeVO();
			vo.setSrno(String.valueOf(dto.getSrno()));
			vo.setEid(String.valueOf(dto.getEid()));
			vo.setEname(dto.getEname());
			vo.setDeptno(String.valueOf(dto.getDeptno()));
			vo.setJob(dto.getJob());
			vo.setSalary(String.valueOf(dto.getSalary()));
			listvo.add(vo);
		}
		return listvo;
	}
}
