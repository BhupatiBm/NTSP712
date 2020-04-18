package com.nt.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentDTO extends BaseDTO {
	private  String course;

	@Override
	public String toString() {
		return "StudentDTO [course=" + course + ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + "]";
	}

	
}
