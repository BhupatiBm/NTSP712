package com.nt.bo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeBO extends BaseBO{
	private String qlfy;

	@Override
	public String toString() {
		return "EmployeeBO [qlfy=" + qlfy + ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getDoj()=" + getDoj() + "]";
	}
	
	
}
