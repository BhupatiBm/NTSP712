package com.nt.comp;

public class Veichle {
	Engine engine;
	public Veichle() {
		System.out.println("Viechle 0 param Constructor");
	}
	public void setEngine(Engine engine) {
		System.out.println("Veichle.setEngine()");
		this.engine=engine;
	}
	public void journy(String from,String to) {
		engine.start();
		System.out.println("Journy is started from::"+from);
		//System.out.println("veichle engine started");
		engine.stop();
		//System.out.println("veichle engine turned-off");
		System.out.println("Reached to::"+to);
		System.out.println("******** Journy completed***********");
	}
}
