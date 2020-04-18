package com.nt.controller;

import com.nt.dto.RailwayDTO;
import com.nt.service.RailwayServiceImpl;
import com.nt.vo.RailwayVO;

public class RailwayController {
	
	RailwayServiceImpl service;

	public RailwayController(RailwayServiceImpl service) {
		System.out.println("RailwayController.RailwayController()");
		this.service = service;
	}
	public String processPasenger(RailwayVO vo)throws Exception{
		System.out.println("RailwayController.processPasenger()");
		RailwayDTO dto;
		String ticket;
		dto=new RailwayDTO();
		dto.setTicketNo(Integer.parseInt(vo.getTicketNo()));
		dto.setPassangerName(vo.getPassangerName());
		dto.setGender(vo.getGender());
		dto.setAge(Integer.parseInt(vo.getAge()));
		dto.setOrigin(vo.getOrigin());
		dto.setDestination(vo.getDestination());
		dto.setCostPerKM(Float.parseFloat(vo.getCostPerKM()));
		dto.setDistance(Float.parseFloat(vo.getDistance()));
		ticket=service.registerPasenger(dto);
		
		return ticket;
		
		
		
		
		
	}
	
	

}
