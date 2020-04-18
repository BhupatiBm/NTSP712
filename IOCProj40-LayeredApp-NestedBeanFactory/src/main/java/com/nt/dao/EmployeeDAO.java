package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	public List<EmployeeBO> getEmpsBySal(float v1,float v2)throws Exception;

}
