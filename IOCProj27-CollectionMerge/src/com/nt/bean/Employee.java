package com.nt.bean;

import java.util.List;

public class Employee {
	private List<String> emp;

	public void setEmp(List<String> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Employee [emp=" + emp + "]";
	}
	

}
