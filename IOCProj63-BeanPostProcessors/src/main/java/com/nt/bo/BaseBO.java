package com.nt.bo;

import java.util.Date;

import lombok.Data;
@Data
public class BaseBO {
	
	private int id;
	private String name;
	private String address;
	private Date doj;

}
