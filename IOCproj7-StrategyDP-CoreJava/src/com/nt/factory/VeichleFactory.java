package com.nt.factory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


import com.nt.comp.DisealEngine;
import com.nt.comp.Engine;
import com.nt.comp.PetrolEngine;
import com.nt.comp.Veichle;
import com.nt.comp.WaterEngine;
public class VeichleFactory {
	public static Properties props;
	static {
		InputStream is=null;
	
	try {
		is=new FileInputStream("src/com/nt/commons/app.properties");
		props=new Properties();
		props.load(is);
		
	}
	catch(Exception e){
		e.printStackTrace();
		
	}
	}
	public static Veichle getInstance()throws Exception {
	Engine engg=null;
	Veichle vic=null;
	engg=(Engine)Class.forName(props.getProperty("dependent.class")).newInstance();
	vic=(Veichle)Class.forName(props.getProperty("target.class")).newInstance();
//	if(engineType.equalsIgnoreCase("Diseal"))
//		engg=new DisealEngine();
//	else if(engineType.equalsIgnoreCase("Petrol"))
//		engg=new PetrolEngine();
//	else if(engineType.equalsIgnoreCase("water"))
//		engg=new WaterEngine();
//	else
//		throw new IllegalArgumentException(engineType);
//	vic= new Veichle();
	vic.setEngine(engg);
	return vic;
	}

}
