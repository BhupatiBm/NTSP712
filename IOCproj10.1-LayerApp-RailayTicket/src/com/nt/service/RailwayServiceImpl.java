package com.nt.service;

import com.nt.bo.RailwayBO;
import com.nt.dao.RailwayDAO;
import com.nt.dto.RailwayDTO;

public class RailwayServiceImpl implements RailwayService {
	RailwayDAO dao;
	
	public RailwayServiceImpl(RailwayDAO dao) {
		System.out.println("RailwayServiceImpl.RailwayServiceImpl()");
		this.dao = dao;
	}

	@Override
	public String registerPasenger(RailwayDTO dto) throws Exception {
		System.out.println("RailwayServiceImpl.registerPasenger()");
		RailwayBO bo;
		int count=0;
		float perkm=dto.getCostPerKM();
		float dist=dto.getDistance();
		int age=dto.getAge();
		float fr=perkm*dist;
		float tf,disc;
		if (age>50) {
			tf=(float) (fr-(fr*0.3));
			disc=(float) (fr*0.3);
		}
		else {
			tf=fr;
		    disc=0.0f;
		}
		bo=new RailwayBO();
		bo.setTicketNo(dto.getTicketNo());
		bo.setPassangerName(dto.getPassangerName());
		bo.setAge(dto.getAge());
		bo.setGender(dto.getGender());
		bo.setOrigin(dto.getOrigin());
		bo.setDestination(dto.getDestination());		
		bo.setTotalFare(tf);
		bo.setDiscountAmt(disc);
		count=dao.insertPasenger(bo);
		if (count==0)
			return "Registration Failed**************Try Again";
		else
			return "Successful Registration!! Total_Fare:"+tf+" Discount:"+disc;
	
	}

}
