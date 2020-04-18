package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {
	private EmployeeDAO dao;
	
	public EmployeeMgmtServiceImpl(EmployeeDAO dao,String name) {
		System.out.println(name);
		this.dao = dao;
	}
	public void myInit() {
		System.out.println("EmployeeMgmtServiceImpl.myInit()");
		if(dao==null)
			throw new IllegalArgumentException("dao is empty");
	}
	public void myDestroy() {
		System.out.println("EmployeeMgmtServiceImpl.myDestroy()");
		dao=null;
	}

	@Override
	public List<EmployeeDTO> fetchEmpsBySal(float v1,float v2) throws Exception {
		List<EmployeeBO> listbo=null;
		List<EmployeeDTO> listdto=null;
		EmployeeDTO dto=null;
		listbo=dao.getEmpsBySal(v1, v2);
		listdto = new ArrayList();
		for(EmployeeBO bo:listbo) {
			 dto=new EmployeeDTO();
			 BeanUtils.copyProperties(bo, dto);
			 dto.setSrno(listdto.size()+1);
			 listdto.add(dto);
		}
		return listdto;
	}
}
