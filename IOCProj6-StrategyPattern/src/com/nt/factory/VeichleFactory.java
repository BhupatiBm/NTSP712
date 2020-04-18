package com.nt.factory;
import com.nt.comp.DisealEngine;
import com.nt.comp.Engine;
import com.nt.comp.PetrolEngine;
import com.nt.comp.Veichle;
import com.nt.comp.WaterEngine;
public class VeichleFactory {
	public static Veichle getInstance(String engineType) {
	Engine engg=null;
	Veichle vic=null;
	if(engineType.equalsIgnoreCase("Diseal"))
		engg=new DisealEngine();
	else if(engineType.equalsIgnoreCase("Petrol"))
		engg=new PetrolEngine();
	else if(engineType.equalsIgnoreCase("water"))
		engg=new WaterEngine();
	else
		throw new IllegalArgumentException(engineType);
	vic= new Veichle();
	vic.setEngine(engg);
	return vic;
	}

}
