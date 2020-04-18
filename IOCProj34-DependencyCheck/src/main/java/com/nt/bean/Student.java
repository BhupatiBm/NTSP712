package com.nt.bean;

public class Student {
	private String name;
	private int regdNo;
	private Course course;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRegdNo(int regdNo) {
		this.regdNo = regdNo;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", regdNo=" + regdNo +", Course="+course+ "]";
	}
	
	

}
