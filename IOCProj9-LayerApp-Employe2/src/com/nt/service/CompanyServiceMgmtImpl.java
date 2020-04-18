package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class CompanyServiceMgmtImpl implements CompanyServiceMgmt {
	private EmployeeDAO dao;
	
	public CompanyServiceMgmtImpl(EmployeeDAO dao) {
		System.out.println("CompanyServiceMgmtImpl:: 1-param constructor");
		this.dao = dao;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		System.out.println("CompanyServiceMgmtImpl.registerEmployee()");
		EmployeeBO bo=null;
		int count=0;
		float empgross=0.0f;
		float empsal=dto.getEmpSall();
		empgross=(empsal+(empsal/100*30));
		bo=new EmployeeBO();
		bo.setEmpNo(dto.getEmpNo());
		bo.setEmpName(dto.getEmpName());
		bo.setEmpDept(dto.getEmpDept());
		bo.setEmpSall(dto.getEmpSall());
		bo.setEmoGrosSsal(empgross);
		count=dao.insert(bo);
		if(count == 0)
			return "Employee Registration Failed::Gross sal is "+empgross;
		else
			
			return "Employee Registration Succeded::Gross sal is "+empgross;
		
	}

}
