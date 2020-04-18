package com.nt.car;

public class SwiftCar implements SuzukiCar {
	@Override
	public String specification() {
		return "Engine CC->1250 \nFuel Type->petrol";
	}
	@Override
	public String drive() {
		return "Gear->4+1";
	}

}
