package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {
	private int srNo;
	private int eid;
	private String ename;
	private String job;
	private  int deptNo;
	private  float salary;

}
