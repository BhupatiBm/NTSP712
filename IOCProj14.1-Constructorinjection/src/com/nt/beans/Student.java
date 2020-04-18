package com.nt.beans;

public class Student {
	private int sno;
	private String sname;
	private int m1;
	private int m2;
	private float avg;
	public Student(int sno, String sname, float avg,int m1,int m2) {
		this.sno = sno;
		this.sname = sname;
		this.avg = avg;
		this.m1=m1;
		this.m2=m2;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", m1=" + m1 + ", m2=" + m2 + ", avg=" + avg + "]";
	}
	
	
	

}
