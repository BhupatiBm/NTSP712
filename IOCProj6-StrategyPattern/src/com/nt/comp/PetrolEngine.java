package com.nt.comp;

public class PetrolEngine implements Engine {

	@Override
	public void start() {
		System.out.println("PetrolEngine::Start");

	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine::Stop");

	}

}
