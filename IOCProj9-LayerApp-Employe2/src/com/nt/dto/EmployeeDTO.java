package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	private int EmpNo;
	private String EmpName;
	private String EmpDept;
	private float EmpSall;
	
	public int getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpDept() {
		return EmpDept;
	}
	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}
	public float getEmpSall() {
		return EmpSall;
	}
	public void setEmpSall(float empSall) {
		EmpSall = empSall;
	}
	

}
