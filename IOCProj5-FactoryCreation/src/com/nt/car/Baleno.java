package com.nt.car;

public class Baleno implements SuzukiCar {
	@Override
	public String specification() {
		return "Engine CC->1250 \nFuel Type->Deasle";
	}
	@Override
	public String drive() {
		return "Gear->4+1";
	}


}
