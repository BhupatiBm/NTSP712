package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;
import com.nt.dao.CollegeDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;

public abstract class CollegeMGMTserviceImpl implements CollegeMGMTservice {

	private CollegeDAO dao;
	
	public CollegeMGMTserviceImpl(CollegeDAO dao) {
		this.dao = dao;
	}
	
	public abstract StudentBO createStudentBO();
	public abstract EmployeeBO createEmployeeBO();

	@Override
	public String registerStudent(StudentDTO dto) {
		StudentBO bo=null;
		int count=0;
		bo=createStudentBO();
		BeanUtils.copyProperties(dto, bo);
		count=dao.insertStudent(bo);
		if(count==0)
			return "Student registration Failed";
		else
			return "Student registration Done";
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) {
		EmployeeBO bo=null;
		int count=0;
		
		bo=createEmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		count=dao.insertEmployee(bo);
		if(count==0)
			return "Employee registration Failed";
		else
			return "Employee registration Done";
	}

}
