package com.nt.car;

public class Ciaz implements SuzukiCar {
	
	@Override
	public String specification() {
		return "Engine CC->1600 \nFuel Type->petrol";
	}
	@Override
	public String drive() {
		return "Gear->5s+1";
	}


}
