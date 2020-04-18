package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class SchoolServiceMgmtImpl implements SchoolServiceMgmt {
     StudentDAO dao;
     
	public SchoolServiceMgmtImpl(StudentDAO dao) {
		System.out.println("SchoolServiceMgmtImpl::1 param constructor");
		this.dao = dao;
	}

	@Override
	public String studentRegistration(StudentDTO dto) throws Exception {
		System.out.println("SchoolServiceMgmtImpl.studentRegistration()");
		StudentBO bo=null;
		String result=null; 
		int count=0;
		float avg=0.0f;
		int m1=dto.getM1();
		int m2=dto.getM2();
		int m3=dto.getM3();
		avg=(m1+m2+m3)/3;
		if (avg<35)
			result="FAIL";
		else
			result="PASS";
		bo=new StudentBO();	
	
		bo.setSname(dto.getSname());
		bo.setSaddress(dto.getSaddress());
		bo.setM1(m1);
		bo.setM2(m2);
		bo.setM3(m3);
		bo.setSavg(avg);
		bo.setSresult(result);
		count=dao.insert(bo);
		if(count==0)
			return "Registration failed";
		else
			return "Student is registered:: Student Average Mark is::"+avg+" and Result is:"+result;
	}

}
