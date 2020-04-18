package com.nt.dao;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public class CollegeDAOImpl implements CollegeDAO {

	@Override
	public int insertStudent(StudentBO bo) {
		System.out.println("inserting student data::"+bo.toString());
		return 1; 
	}

	@Override
	public int insertEmployee(EmployeeBO bo) {
		System.out.println("inserting Employee data::"+bo.toString());
		return 1;
	}

}
