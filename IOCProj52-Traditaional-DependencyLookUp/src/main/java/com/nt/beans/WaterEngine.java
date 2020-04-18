package com.nt.beans;

public class WaterEngine implements Engine {

	@Override
	public void start() {
		//System.out.println("WaterEngine.start()::method");
		System.out.println("water engine started");

	}

	@Override
	public void stop() {
		//System.out.println("WaterEngine.stop()::method");
		System.out.println("water engine stopped");

	}

}
