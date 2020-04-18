package com.nt.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO extends BaseDTO{
	private String qlfy;

	@Override
	public String toString() {
		return "EmployeeDTO [qlfy=" + qlfy + ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}
	

}
