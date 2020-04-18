package com.nt.bens;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private int marks[];
	private List<String> names;
	private Set<String> regdNo;
	private Map<String, String> subject ;
	private Properties stuHeight;
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	
	public void setRegdNo(Set<String> regdNo) {
		this.regdNo = regdNo;
	}
	
	
	public void setSubject(Map<String, String> subject) {
		this.subject =subject;
	}
	
	public void setStuHeight(Properties stuHeight) {
		this.stuHeight = stuHeight;
	}
	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + ", names=" + names + ", regdNo=" + regdNo + ", subject="
				+ subject + ", stuHeight=" + stuHeight + "]";
	}
	
	
	
	
	
	
	
	
	

}
