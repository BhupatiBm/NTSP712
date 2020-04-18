package com.nt.factory;
import org.springframework.context.support.StaticApplicationContext;

import com.nt.car.Baleno;
import com.nt.car.Ciaz;
import com.nt.car.SwiftCar;
import com.nt.car.SuzukiCar;

public class SuzukiCarFactory {
	public static SuzukiCar getInstance(String type) {
		SuzukiCar car=null;
		if(type.equalsIgnoreCase("Baleno"))
			car=new Baleno();
		else if(type.equalsIgnoreCase("Ciaz"))
			car=new Ciaz();
		else if(type.equalsIgnoreCase("SwiftCar"))
			car=new SwiftCar();
		else
			System.out.println("wrong input");
		
		return car;
		
	}
}
