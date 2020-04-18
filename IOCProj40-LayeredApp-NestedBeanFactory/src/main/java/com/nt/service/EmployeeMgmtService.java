package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeMgmtService {
	public List<EmployeeDTO> fetchEmpsBySal(float v1,float v2)throws Exception; 

}
