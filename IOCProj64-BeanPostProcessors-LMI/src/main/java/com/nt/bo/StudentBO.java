package com.nt.bo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentBO extends BaseBO{
	private String course;

	@Override
	public String toString() {
		return "StudentBO [course=" + course + ", getCourse()=" + getCourse() + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAddress()=" + getAddress() + ", getDoj()=" + getDoj() + "]";
	}
	
	
	
	
	
	
	
}
