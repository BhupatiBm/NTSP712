package com.nt.bean;

public class Course {
	private String course;
	private int duration;
	public void setCourse(String course) {
		this.course = course;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [name=" + course + ", duration=" + duration + "]";
	}
	
	

}
