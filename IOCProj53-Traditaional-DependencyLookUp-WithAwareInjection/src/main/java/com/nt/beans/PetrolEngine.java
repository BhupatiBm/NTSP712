package com.nt.beans;

public class PetrolEngine implements Engine {
	
	

	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine()::0-constructor");
	}

	@Override
	public void start() {
		//System.out.println("PetrolEngine.start()::method");
		System.out.println("petrol engine started");

	}

	@Override
	public void stop() {
		//System.out.println("PetrolEngine.stop()::method");
		System.out.println("petrol engine stopped");

	}

}
