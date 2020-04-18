package com.nt.beans;

public class Student {
	private int sno;
	private String sname;
	private int m1;
	private int m2;
	private float avg;
	
	
	
	public int getSno() {
		return sno;
	}



	public void setSno(int sno) {
		this.sno = sno;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public int getM1() {
		return m1;
	}



	public void setM1(int m1) {
		this.m1 = m1;
	}



	public int getM2() {
		return m2;
	}



	public void setM2(int m2) {
		this.m2 = m2;
	}



	public float getAvg() {
		return avg;
	}



	public void setAvg(float avg) {
		this.avg = avg;
	}



	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", m1=" + m1 + ", m2=" + m2 + ", avg=" + avg + "]";
	}



	
	
	
	

}
