package com.nt.beans;

public class DieselEngine implements Engine {

	
	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine()::0-constructor");
	}

	@Override
	public void start() {
		//System.out.println("DieselEngine.start()::method");
		System.out.println("Diesel engine started");

	}

	@Override
	public void stop() {
		//System.out.println("DieselEngine.stop()::method");
		System.out.println("Diesel engine stopped");

	}

}
